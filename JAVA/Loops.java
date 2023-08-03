
class Loops
{
    public static void main(String arg[])
    {
      int Arr[] = {10,20,30,40};
      int iCnt = 0;

      System.out.println("Transversal of Array using For Loop ");
      for(iCnt = 0; iCnt < Arr.length; iCnt++) // Same in C,C++,Java
      {
        System.out.println(Arr[iCnt]);
      }

      System.out.println("Transversal of Array using While Loop ");
      iCnt = 0;
      while(iCnt < Arr.length)  // Same in C,C++,Java
      {
        System.out.println(Arr[iCnt]);
        iCnt++;
      }

      System.out.println("Transversal of Array using Do While Loop ");
      iCnt = 0;
      do  // Same in C,C++,Java
      {
        System.out.println(Arr[iCnt]);
        iCnt++;
       }while(iCnt < Arr.length);

       System.out.println("Transversal of Array using for-each Loop ");
       iCnt=0;
       for(int iNo : Arr) // Same in Java
       {
         System.out.println(iNo);
       }
    }
}
