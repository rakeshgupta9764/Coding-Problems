# first method:

void reverse(int first[], int second[])
{
    int i, len;
    for (i = 0 ; start[i]!='\0' ; i++);    len = i;
    for (i = 0; i<len; i++)   second[i] = first[n-i-1];
}


# second method:  in-place
#define SWAP(x, y)  int t; t=x;x=y;y=t;
void reverse(int first[])
{
    int i, len;
    for(i = 0; start[i]!='\0'; i++);    len = i;
    for(i = 0; i<n/2; i++)  SWAP(start[i], start[n-i-1])
}
