#include <stdio.h>
#include <stdlib.h>
#include <memory.h>

int main(int argc, char **args)
{
    int i;
    char *p;
    while (1)
    {
        //  メモリを生成（開放しない）
        p = (char *)malloc(sizeof(char) * 10000);
    }
}