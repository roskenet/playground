#include <avr/io.h>
#include <util/delay.h>


int main(void) {
    DDRB |= 0b11111111;

    while (1) {

        PORTB = 0b11111111;
        _delay_ms(1000);

        PORTB = 0b00000000;
        _delay_ms(100);

    }
    return 0;
}
