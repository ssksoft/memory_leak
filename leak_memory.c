#include <stdio.h>
#include <stdlib.h>
#include <memory.h>

int leak_memory()
{
    printf("hello_leak\n");
    int i;
    char *p;
    //  メモリを生成（開放しない）
    p = (char *)malloc(sizeof(char) * 10000);
}