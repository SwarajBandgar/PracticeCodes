
class Multi
{
    public static void main(String Arg[])
    {
      // Arr is 2 Dimensional Array which contains 3 One Dimentional
      //Array each One Dimensional Array Contains 4 Elements,
      // each element is of type integer

      //    Allowed in C&C++
      //    int Arr[3][4] = {{10,20,30,40},{50,60,70,80},{90,100,110,120}};

      // Allowed in JAva only
      int Arr[][] = {{10,20,30,40},{50,60,70,80},{90,100,110,120}};

      System.out.println(Arr.length);     //3
      System.out.println(Arr[0].length);  //4
    }
}
