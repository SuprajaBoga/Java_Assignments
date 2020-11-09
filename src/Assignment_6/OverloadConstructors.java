package Assignment_6;

public class OverloadConstructors
{
    OverloadConstructors()
    {
        this("second constructor");
        System.out.println("first constructor");
    }
    OverloadConstructors(String str)
    {
        System.out.println(str);
    }
    public static void main(String[] args)
    {
        OverloadConstructors obj=new OverloadConstructors();
    }
}
