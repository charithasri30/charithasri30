class CountsetBits{
 public static void main(string[]args)
 {
   int n=9,count=0;
    while(n>0)
    {
     count=count+n&1;
     n>>1;
     system.out.println("No.of setbits in binary representation of 9 is" +count);
    }
 }