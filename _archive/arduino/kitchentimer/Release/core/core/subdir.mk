################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/CDC.cpp \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/HardwareSerial.cpp \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/HardwareSerial0.cpp \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/HardwareSerial1.cpp \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/HardwareSerial2.cpp \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/HardwareSerial3.cpp \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/IPAddress.cpp \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/PluggableUSB.cpp \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/Print.cpp \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/Stream.cpp \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/Tone.cpp \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/USBCore.cpp \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/WMath.cpp \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/WString.cpp \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/abi.cpp \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/main.cpp \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/new.cpp 

S_UPPER_SRCS += \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/wiring_pulse.S 

C_SRCS += \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/WInterrupts.c \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/hooks.c \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/wiring.c \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/wiring_analog.c \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/wiring_digital.c \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/wiring_pulse.c \
/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/wiring_shift.c 

C_DEPS += \
./core/core/WInterrupts.c.d \
./core/core/hooks.c.d \
./core/core/wiring.c.d \
./core/core/wiring_analog.c.d \
./core/core/wiring_digital.c.d \
./core/core/wiring_pulse.c.d \
./core/core/wiring_shift.c.d 

AR_OBJ += \
./core/core/CDC.cpp.o \
./core/core/HardwareSerial.cpp.o \
./core/core/HardwareSerial0.cpp.o \
./core/core/HardwareSerial1.cpp.o \
./core/core/HardwareSerial2.cpp.o \
./core/core/HardwareSerial3.cpp.o \
./core/core/IPAddress.cpp.o \
./core/core/PluggableUSB.cpp.o \
./core/core/Print.cpp.o \
./core/core/Stream.cpp.o \
./core/core/Tone.cpp.o \
./core/core/USBCore.cpp.o \
./core/core/WInterrupts.c.o \
./core/core/WMath.cpp.o \
./core/core/WString.cpp.o \
./core/core/abi.cpp.o \
./core/core/hooks.c.o \
./core/core/main.cpp.o \
./core/core/new.cpp.o \
./core/core/wiring.c.o \
./core/core/wiring_analog.c.o \
./core/core/wiring_digital.c.o \
./core/core/wiring_pulse.S.o \
./core/core/wiring_pulse.c.o \
./core/core/wiring_shift.c.o 

S_UPPER_DEPS += \
./core/core/wiring_pulse.S.d 

CPP_DEPS += \
./core/core/CDC.cpp.d \
./core/core/HardwareSerial.cpp.d \
./core/core/HardwareSerial0.cpp.d \
./core/core/HardwareSerial1.cpp.d \
./core/core/HardwareSerial2.cpp.d \
./core/core/HardwareSerial3.cpp.d \
./core/core/IPAddress.cpp.d \
./core/core/PluggableUSB.cpp.d \
./core/core/Print.cpp.d \
./core/core/Stream.cpp.d \
./core/core/Tone.cpp.d \
./core/core/USBCore.cpp.d \
./core/core/WMath.cpp.d \
./core/core/WString.cpp.d \
./core/core/abi.cpp.d \
./core/core/main.cpp.d \
./core/core/new.cpp.d 


# Each subdirectory must supply rules for building sources it contributes
core/core/CDC.cpp.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/CDC.cpp
	@echo 'Building file: $<'
	@echo 'Starting C++ compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-g++" -c -g -Os -w -std=gnu++11 -fpermissive -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -Wno-error=narrowing -MMD -flto -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 -x c++ "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/HardwareSerial.cpp.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/HardwareSerial.cpp
	@echo 'Building file: $<'
	@echo 'Starting C++ compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-g++" -c -g -Os -w -std=gnu++11 -fpermissive -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -Wno-error=narrowing -MMD -flto -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 -x c++ "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/HardwareSerial0.cpp.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/HardwareSerial0.cpp
	@echo 'Building file: $<'
	@echo 'Starting C++ compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-g++" -c -g -Os -w -std=gnu++11 -fpermissive -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -Wno-error=narrowing -MMD -flto -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 -x c++ "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/HardwareSerial1.cpp.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/HardwareSerial1.cpp
	@echo 'Building file: $<'
	@echo 'Starting C++ compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-g++" -c -g -Os -w -std=gnu++11 -fpermissive -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -Wno-error=narrowing -MMD -flto -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 -x c++ "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/HardwareSerial2.cpp.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/HardwareSerial2.cpp
	@echo 'Building file: $<'
	@echo 'Starting C++ compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-g++" -c -g -Os -w -std=gnu++11 -fpermissive -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -Wno-error=narrowing -MMD -flto -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 -x c++ "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/HardwareSerial3.cpp.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/HardwareSerial3.cpp
	@echo 'Building file: $<'
	@echo 'Starting C++ compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-g++" -c -g -Os -w -std=gnu++11 -fpermissive -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -Wno-error=narrowing -MMD -flto -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 -x c++ "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/IPAddress.cpp.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/IPAddress.cpp
	@echo 'Building file: $<'
	@echo 'Starting C++ compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-g++" -c -g -Os -w -std=gnu++11 -fpermissive -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -Wno-error=narrowing -MMD -flto -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 -x c++ "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/PluggableUSB.cpp.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/PluggableUSB.cpp
	@echo 'Building file: $<'
	@echo 'Starting C++ compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-g++" -c -g -Os -w -std=gnu++11 -fpermissive -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -Wno-error=narrowing -MMD -flto -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 -x c++ "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/Print.cpp.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/Print.cpp
	@echo 'Building file: $<'
	@echo 'Starting C++ compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-g++" -c -g -Os -w -std=gnu++11 -fpermissive -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -Wno-error=narrowing -MMD -flto -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 -x c++ "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/Stream.cpp.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/Stream.cpp
	@echo 'Building file: $<'
	@echo 'Starting C++ compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-g++" -c -g -Os -w -std=gnu++11 -fpermissive -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -Wno-error=narrowing -MMD -flto -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 -x c++ "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/Tone.cpp.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/Tone.cpp
	@echo 'Building file: $<'
	@echo 'Starting C++ compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-g++" -c -g -Os -w -std=gnu++11 -fpermissive -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -Wno-error=narrowing -MMD -flto -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 -x c++ "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/USBCore.cpp.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/USBCore.cpp
	@echo 'Building file: $<'
	@echo 'Starting C++ compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-g++" -c -g -Os -w -std=gnu++11 -fpermissive -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -Wno-error=narrowing -MMD -flto -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 -x c++ "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/WInterrupts.c.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/WInterrupts.c
	@echo 'Building file: $<'
	@echo 'Starting C compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-gcc" -c -g -Os -w -std=gnu11 -ffunction-sections -fdata-sections -MMD -flto -fno-fat-lto-objects -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/WMath.cpp.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/WMath.cpp
	@echo 'Building file: $<'
	@echo 'Starting C++ compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-g++" -c -g -Os -w -std=gnu++11 -fpermissive -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -Wno-error=narrowing -MMD -flto -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 -x c++ "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/WString.cpp.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/WString.cpp
	@echo 'Building file: $<'
	@echo 'Starting C++ compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-g++" -c -g -Os -w -std=gnu++11 -fpermissive -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -Wno-error=narrowing -MMD -flto -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 -x c++ "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/abi.cpp.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/abi.cpp
	@echo 'Building file: $<'
	@echo 'Starting C++ compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-g++" -c -g -Os -w -std=gnu++11 -fpermissive -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -Wno-error=narrowing -MMD -flto -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 -x c++ "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/hooks.c.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/hooks.c
	@echo 'Building file: $<'
	@echo 'Starting C compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-gcc" -c -g -Os -w -std=gnu11 -ffunction-sections -fdata-sections -MMD -flto -fno-fat-lto-objects -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/main.cpp.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/main.cpp
	@echo 'Building file: $<'
	@echo 'Starting C++ compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-g++" -c -g -Os -w -std=gnu++11 -fpermissive -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -Wno-error=narrowing -MMD -flto -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 -x c++ "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/new.cpp.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/new.cpp
	@echo 'Building file: $<'
	@echo 'Starting C++ compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-g++" -c -g -Os -w -std=gnu++11 -fpermissive -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -Wno-error=narrowing -MMD -flto -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 -x c++ "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/wiring.c.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/wiring.c
	@echo 'Building file: $<'
	@echo 'Starting C compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-gcc" -c -g -Os -w -std=gnu11 -ffunction-sections -fdata-sections -MMD -flto -fno-fat-lto-objects -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/wiring_analog.c.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/wiring_analog.c
	@echo 'Building file: $<'
	@echo 'Starting C compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-gcc" -c -g -Os -w -std=gnu11 -ffunction-sections -fdata-sections -MMD -flto -fno-fat-lto-objects -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/wiring_digital.c.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/wiring_digital.c
	@echo 'Building file: $<'
	@echo 'Starting C compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-gcc" -c -g -Os -w -std=gnu11 -ffunction-sections -fdata-sections -MMD -flto -fno-fat-lto-objects -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/wiring_pulse.S.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/wiring_pulse.S
	@echo 'Building file: $<'
	@echo 'Starting S compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-gcc" -c -g -x assembler-with-cpp -flto -MMD -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@"  "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/wiring_pulse.c.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/wiring_pulse.c
	@echo 'Building file: $<'
	@echo 'Starting C compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-gcc" -c -g -Os -w -std=gnu11 -ffunction-sections -fdata-sections -MMD -flto -fno-fat-lto-objects -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '

core/core/wiring_shift.c.o: /home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino/wiring_shift.c
	@echo 'Building file: $<'
	@echo 'Starting C compile'
	"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/tools/avr-gcc/7.3.0-atmel3.6.1-arduino7/bin/avr-gcc" -c -g -Os -w -std=gnu11 -ffunction-sections -fdata-sections -MMD -flto -fno-fat-lto-objects -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10812 -DARDUINO_AVR_UNO -DARDUINO_ARCH_AVR     -I"/home/felix/Packages/Sloeber/arduinoPlugin/examples/01.Basics/Blink" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/variants/standard" -I"/home/felix/Packages/Sloeber/arduinoPlugin/packages/arduino/hardware/avr/1.8.4/cores/arduino" -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -D__IN_ECLIPSE__=1 "$<"   -o "$@"
	@echo 'Finished building: $<'
	@echo ' '


