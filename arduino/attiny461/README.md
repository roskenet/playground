# My attiny461 direct flash experiments

# This works on the command line:

```shell
avr-gcc -O3 -mmcu=avr25 -D __AVR_ATtiny461__ -D F_CPU=8000000 main.c
avr-gcc -O3 -mmcu=attiny461 -D F_CPU=8000000 main.c
```
Found somewhere:
avr-gcc -mmcu=atmega128 -I. -gstabs -Os -Wall -Wstrict-prototypes -std=gnu99 filename.o --output filename.elf -lm

avr-objcopy -O ihex -R .eeprom filename.elf filename.hex

And then something like this should happen:

```shell
/bin/avrdude -pattiny461 -cstk500v2 -P/dev/ttyACM0 -b9600 -Uflash:w:./cmake-build-release-avr-gnu/hello.hex:i
```

## Step by step second one:

```shell
avr-gcc -Os -Wall -std=gnu99 -mmcu=attiny461 -D F_CPU=1000000 hello.c -o hello.elf
```

```shell
avr-objcopy -O ihex -R .eeprom hello.elf hello.hex                                

```

```shell
/bin/avrdude -pattiny461 -cstk500v2 -P/dev/ttyACM0 -b9600 -Uflash:w:hello.hex:i 

```