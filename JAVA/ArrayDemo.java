
class ArrayDemo
{
    public static void main(String Arg[])
    {
      // Ways of creating Single Dimensional Array
        int Arr1[] = {10,20,30,40};
      //  int Arr2[4] = {10,20,30,40}; Explicit Size is Not Allowed
        int Arr3[] = new int[4];     //Dynamic memory Allocation
        Arr3[0] = 10;
        Arr3[1] = 20;
        Arr3[2] = 30;
        Arr3[3] = 40;

        int Arr4[] = new int[]{10,20,30,40}; //Dynamical memory allocation with initialisation list
    }
}
