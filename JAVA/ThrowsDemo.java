class Arithematic
{
  public int Division(int A, int B) throws ArithematicException
  {
      int Ans = 0;
      Ans = A / B;
      return Ans;
  }
}

class ThrowsDemo
{
    public Static void main(String a[])
    {
       Scanner sobj = new Scanner(System.in);
       System.out.println("Enter First Number");
       int iNo1 = sobj.nextInt();
       System.out.println("Enter Second Number");
       int iNo2 = sobj.nextInt();

       Arithematic obj = new Arithematic();

       try
       {
          int Ret = aobj.Division(iNo1,iNo2);
          System.out.println("Division is : ",+Ret);
       }
       catch(ArithematicException obj)
       {
         System.out.println("Exception Occured")
         System.out.println(obj);
       }
    }
}
