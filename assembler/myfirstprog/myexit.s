# My first program
.globl _start
.section .data
.section .text
_start:
   movq $60, %rax

   movq %rax, %rdi
   syscall
