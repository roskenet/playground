cmake_minimum_required(VERSION 3.16)
set(CMAKE_SYSTEM_NAME Generic)
SET(CMAKE_SYSTEM_VERSION 1)

####################################
#  Target-specific stuff
set(TARGET_CPU attiny461)
#  End of target-specific stuff
####################################

###################################
#  Machine-specific stuff
set(AVR_DUDE_EXECUTABLE /usr/bin/avrdude)
set(AVR_DUDE_PORT /dev/ttyACM0)
#  End of machine-specific stuff
###################################

project(clion_avr_c_demo CXX C)

include(CMakeVerifyCompiler.txt)

set(CMAKE_CXX_STANDARD 17)

include_directories(inc)

add_compile_definitions("__AVR_${TARGET_CPU}__")

add_link_options(-Wl,--print-memory-usage)

add_executable(${PROJECT_NAME} src/main.c)

#### Uncomment this to see flashing process details
#set(FLASH_VERBOSE_FLAG "-v")

add_custom_target(FLASH
        ${AVR_DUDE_EXECUTABLE} -p ${TARGET_CPU} -c stk500v2 -b115200 -P ${AVR_DUDE_PORT} ${FLASH_VERBOSE_FLAG} -F -D -U flash:w:${PROJECT_BINARY_DIR}/${PROJECT_NAME}:a
        DEPENDS ${PROJECT_NAME}
        COMMENT "Flash to ${TARGET_CPU}")