#include<avr/io.h>
#include<avr/interrupt.h>
#include<util/delay.h>

void buttonInterrupt(void);

volatile uint8_t my_flag = 0;

ISR(PCINT_vect) {
    // Does this debpunce?
    if (~(PINA) & (1 << PINA4)) {
        _delay_ms(50);
        if (~(PINA) & (1 << PINA4)) {
           buttonInterrupt();
        }
    }
}

void buttonInterrupt(void) {
    if (~(PINA) & (1 << PINA4)) {
        my_flag = 1;
    }
}

int main(void) {
    DDRB |= (1 << 5);
    DDRA |= 0b00000000;

    PORTA |= 0xFF;

//  GIMSK |= 0b00110000;  // General Interrupt Mask Register, / Bit 5 – PCIE: Pin Change Interrupt Enable / When the PCIE bit is set (one) and the I-bit in the Status Register (SREG) is set (one), pin change interrupt is enabled. Any change on any enabled PCINT[5:0] pin will cause an interrupt. The corresponding interrupt of Pin Change Interrupt Request is executed from the PCI Interrupt Vector. PCINT[5:0] pins are enabled individually by the PCMSK0 Register. / see https://ww1.microchip.com/downloads/en/DeviceDoc/Atmel-2586-AVR-8-bit-Microcontroller-ATtiny25-ATtiny45-ATtiny85_Datasheet.pdf
//    cli();

    GIMSK |= (1 << 5);
//    PCMSK0 = 0b00010000;  // Pin-change interrupt for PB0, PB1, PB2
    PCMSK0 |= (1 << 4);
    sei();

    while (1) {
//        if (~(PINA) & (1 << PINA4)) {
//            PORTB = 0b00100000;
//            _delay_ms(1000);
//        }
        if (my_flag == 1) {
            for (int i = 0; i < 10; ++i) {
                PORTB = 0b00100000;
                _delay_ms(50);
                PORTB = 0b00000000;
                _delay_ms(50);
            }
        } else {
//            PORTB = 0b00100000;
//            _delay_ms(1000);

            PORTB = 0b00000000;
//            _delay_ms(100);
//        }
        }
        my_flag = 0;
    }
    return 0;
}
