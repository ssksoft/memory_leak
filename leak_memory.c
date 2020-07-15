#include <stdio.h>
#include <stdlib.h>
#include <memory.h>

int leak_memory()
{
    printf("hello_leak\n");
    int i;
    char *p;
    //  ƒƒ‚ƒŠ‚ğ¶¬iŠJ•ú‚µ‚È‚¢j
    p = (char *)malloc(sizeof(char) * 10000);
}