# makefile for hello.s
hello: hello.o
	ld hello.o -o hello
hello.o: hello.s
	as -g hello.s -o hello.o
clean:
	rm *.o hello
