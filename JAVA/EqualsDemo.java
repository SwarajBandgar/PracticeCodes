class Demo
{
    public int iNo1;
    public int iNo2;

    public Demo(int a, int b)
    {
      iNo1 = a;
      iNo2 = b;
    }
}

class EqualsDemo
{
    public static void main(String a[])
    {
        String s1 = "Hello";
        String s2 = "Hello";

        Demo obj1 = new Demo(11,21);
        Demo obj2 = new Demo(11,21);

        System.out.println("Hashcode of s1 : "+s1.hashCode());
        System.out.println("Hashcode of s2 : "+s2.hashCode());

        if(s1.equals(s2))  // IF("Hello" == "Hello")
        {
            System.out.println("Objects are Same ");
        }
        else
        {
            System.out.println("Objects are Different ");
        }
        if(s1 == s2)     // if(1000 == 1000)
        {
            System.out.println("Objects are Same ");
        }
        else
        {
            System.out.println("Objects are Different ");
        }

    }
}
