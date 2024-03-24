# My attiny461 direct flash experiments

# This works on the command line:

```shell
avr-gcc -Os -Wall -std=gnu99 -mmcu=attiny461 -D F_CPU=1000000 hello.c -o hello.elf
```

```shell
avr-objcopy -O ihex -R .eeprom hello.elf hello.hex                                

```

```shell
/bin/avrdude -pattiny461 -cstk500v2 -P/dev/ttyACM0 -b9600 -Uflash:w:hello.hex:i 

```

Check for compiler options and optimizations... Others did:

avr-gcc -mmcu=atmega128 -I. -gstabs -Os -Wall -Wstrict-prototypes -std=gnu99 filename.o --output filename.elf -lm

avr-gcc -mmcu=atmega32 -I. -gdwarf-2   -Os -funsigned-char 
-funsigned-bitfields -fpack-struct -fshort-enums -Wall 
-Wstrict-prototypes -Wa,-adhlns=main.o  -std=gnu99 -DF_OSC=20000000 -MD 
-MP -MF .dep/test.elf.d main.o   --output test.elf 
-Wl,-Map=main.map,--cref    -lm


