# My first program
.globl _start
.section .text
_start:

exit:
   movq $42, %rdi
   movq $60, %rax 
   syscall
