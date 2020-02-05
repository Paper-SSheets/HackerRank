#include <stdio.h>

int main(int argc, char *argv[])
{
    int n;
    scanf("%d", &n);

    int width = n * 2 - 1;
    for (int i = 0; i < width; i++) {
        for (int j = 0; j < width; j++) {
            int min = i < j ? i : j;
            min = min < width - i ? min : width - i - 1;
            min = min < width - j - 1 ? min : width - j -1;
            printf("%d ", n - min);
        }
        printf("\n");
    }

    return 0;
}
