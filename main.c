#include <stdio.h>
#include <windows.h>

typedef int (*FUNC)(void);

int main(int argc, char **args)
{
    HMODULE dll = LoadLibrary("leak_memory.dll");
    FUNC leak_memory = (FUNC)GetProcAddress(dll, "leak_memory");
    while (1)
    {
        leak_memory();
    }
}