#include <stdio.h>

int do_something(char *);

int main() {
    printf("Hello, World!\n");

    char *my_string = "Maschendrahtzaun";

    int result = do_something(my_string);

    printf("Result ist: %d", result);
    return 0;
}

int do_something(char *somwthing) {
    return printf("Sonething is: %s!", somwthing);
}
