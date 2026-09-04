class Solution {
    public int fib(int n) {
        if(n==0)
        return 0;
        else if(n==1)
return 1;
        int c;
        int a=0;
        int b=1;
        for(int i=0;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c; 
        }
        return a;
    }
}