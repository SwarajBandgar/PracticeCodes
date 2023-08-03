import java.util.*

class AgeInvalidException extends Exception
{


}

class UserDefined
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter your Age ");
        int iAge = sobj.nextInt();

        try
        {
            if(iAge < 15)
            {
              throw age AgeInvalidException("Your Age is less then 15");
            }
            else
            {
              System.out.println("Age is Valid");
            }
        }
        catch(AgeInvalidException obj)
        {
          System.out.println(obj);
        }
    }
}
