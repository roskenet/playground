# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.27

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Disable VCS-based implicit rules.
% : %,v

# Disable VCS-based implicit rules.
% : RCS/%

# Disable VCS-based implicit rules.
% : RCS/%,v

# Disable VCS-based implicit rules.
% : SCCS/s.%

# Disable VCS-based implicit rules.
% : s.%

.SUFFIXES: .hpux_make_needs_suffix_list

# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/felix/Workspaces/playground/arduino/blink_cmake

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/felix/Workspaces/playground/arduino/blink_cmake/release

# Utility rule file for upload-blink.

# Include any custom commands dependencies for this target.
include CMakeFiles/upload-blink.dir/compiler_depend.make

# Include the progress variables for this target.
include CMakeFiles/upload-blink.dir/progress.make

CMakeFiles/upload-blink:
	/usr/bin/avrdude -C/etc/avrdude.conf -pattiny461 -cstk500v2 -P/dev/ttyACM0 -b9600 -D -Uflash:w:blink.hex:i

upload-blink: CMakeFiles/upload-blink
upload-blink: CMakeFiles/upload-blink.dir/build.make
.PHONY : upload-blink

# Rule to build all files generated by this target.
CMakeFiles/upload-blink.dir/build: upload-blink
.PHONY : CMakeFiles/upload-blink.dir/build

CMakeFiles/upload-blink.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/upload-blink.dir/cmake_clean.cmake
.PHONY : CMakeFiles/upload-blink.dir/clean

CMakeFiles/upload-blink.dir/depend:
	cd /home/felix/Workspaces/playground/arduino/blink_cmake/release && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/felix/Workspaces/playground/arduino/blink_cmake /home/felix/Workspaces/playground/arduino/blink_cmake /home/felix/Workspaces/playground/arduino/blink_cmake/release /home/felix/Workspaces/playground/arduino/blink_cmake/release /home/felix/Workspaces/playground/arduino/blink_cmake/release/CMakeFiles/upload-blink.dir/DependInfo.cmake "--color=$(COLOR)"
.PHONY : CMakeFiles/upload-blink.dir/depend

