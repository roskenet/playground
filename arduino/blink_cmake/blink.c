#include<avr/io.h>
#include<util/delay.h>
#include<avr/interrupt.h>

uint8_t myFlag = 0;

ISR(PCINT_vect) {
    if (myFlag == 0) {
        myFlag = 1;
    } else {
        myFlag = 0;
    }
}

int main(void) {
    DDRB |= (1 << 5);

    DDRA = 0b00000000;
    PORTA |= 0xFF;


    GIMSK |= (1 << PCIE0);
    GIMSK |= (1 << PCIE1);

    PCMSK0 |= (1 << 4);
    PCMSK1 |= (1 << 4);
    sei();

    while (1) {

        if (myFlag == 0) {
            for (int i = 0; i < 10; ++i) {
                PORTB |= 0b00100000;
                _delay_ms(10);
                PORTB &= ~(0b00100000);
                _delay_ms(990);
            }
        } else {
            PORTB = 0b00100000;
            _delay_ms(1000);
            PORTB = 0b00000000;
            _delay_ms(100);
        }
    }

    return 0;
}






//void setup() {
//    Serial.begin(115200);
//    delay(2000);
//    Serial.println("Hello, world!");
//    pinMode(PA4, OUTPUT);
//}
//
//void loop() {
//    digitalWrite(PA4 , HIGH);
//    delay(500);
//    digitalWrite(PA4, LOW);
//    delay(500);
//    Serial.println("Hello, world!");
//}
