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
CMAKE_COMMAND = /home/felix/Packages/JetBrains/clion/bin/cmake/linux/x64/bin/cmake

# The command to remove a file.
RM = /home/felix/Packages/JetBrains/clion/bin/cmake/linux/x64/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/felix/Workspaces/playground/c/learning_c

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/felix/Workspaces/playground/c/learning_c/cmake-build-release

# Include any dependencies generated for this target.
include CMakeFiles/learning_c.dir/depend.make
# Include any dependencies generated by the compiler for this target.
include CMakeFiles/learning_c.dir/compiler_depend.make

# Include the progress variables for this target.
include CMakeFiles/learning_c.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/learning_c.dir/flags.make

CMakeFiles/learning_c.dir/main.c.o: CMakeFiles/learning_c.dir/flags.make
CMakeFiles/learning_c.dir/main.c.o: /home/felix/Workspaces/playground/c/learning_c/main.c
CMakeFiles/learning_c.dir/main.c.o: CMakeFiles/learning_c.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green --progress-dir=/home/felix/Workspaces/playground/c/learning_c/cmake-build-release/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/learning_c.dir/main.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -MD -MT CMakeFiles/learning_c.dir/main.c.o -MF CMakeFiles/learning_c.dir/main.c.o.d -o CMakeFiles/learning_c.dir/main.c.o -c /home/felix/Workspaces/playground/c/learning_c/main.c

CMakeFiles/learning_c.dir/main.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green "Preprocessing C source to CMakeFiles/learning_c.dir/main.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/felix/Workspaces/playground/c/learning_c/main.c > CMakeFiles/learning_c.dir/main.c.i

CMakeFiles/learning_c.dir/main.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green "Compiling C source to assembly CMakeFiles/learning_c.dir/main.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/felix/Workspaces/playground/c/learning_c/main.c -o CMakeFiles/learning_c.dir/main.c.s

# Object files for target learning_c
learning_c_OBJECTS = \
"CMakeFiles/learning_c.dir/main.c.o"

# External object files for target learning_c
learning_c_EXTERNAL_OBJECTS =

learning_c: CMakeFiles/learning_c.dir/main.c.o
learning_c: CMakeFiles/learning_c.dir/build.make
learning_c: CMakeFiles/learning_c.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green --bold --progress-dir=/home/felix/Workspaces/playground/c/learning_c/cmake-build-release/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable learning_c"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/learning_c.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/learning_c.dir/build: learning_c
.PHONY : CMakeFiles/learning_c.dir/build

CMakeFiles/learning_c.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/learning_c.dir/cmake_clean.cmake
.PHONY : CMakeFiles/learning_c.dir/clean

CMakeFiles/learning_c.dir/depend:
	cd /home/felix/Workspaces/playground/c/learning_c/cmake-build-release && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/felix/Workspaces/playground/c/learning_c /home/felix/Workspaces/playground/c/learning_c /home/felix/Workspaces/playground/c/learning_c/cmake-build-release /home/felix/Workspaces/playground/c/learning_c/cmake-build-release /home/felix/Workspaces/playground/c/learning_c/cmake-build-release/CMakeFiles/learning_c.dir/DependInfo.cmake "--color=$(COLOR)"
.PHONY : CMakeFiles/learning_c.dir/depend

