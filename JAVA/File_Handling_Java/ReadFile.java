import java.io.*;

class ReadFile
{
    public static void main(String a[]) throws Exception
    {
      FileInputStream fobj = new FileInputStream("Marvellous.txt");
      int i = 0;

      while((i = fobj.read()) != -1)
      {
        System.out.print((char)i); //print will read ni vertical format
      }
      System.out.println();
      fobj.close();
    }
}
