#include <stdio.h>

#include <string.h>

int foo(void) {
  char bar[128];
  char *baz = &bar[0];
  baz[127] = 0;
  return strlen(baz);
}
int main()
{
    printf("Hello World\n");
    
    int n = foo();
    
    printf("%d",n);

    return 0;
}
