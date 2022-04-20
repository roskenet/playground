#include <stdio.h>
#include <stdbool.h>
#include "mykillerfunc.h"

int main() {

    int doSomething = do_something(42);
    
    printf("Hello, World!\nmy_bool is: %d\n", doSomething);

    do_something_else();

    return 0;
}
