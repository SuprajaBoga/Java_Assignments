package Assignment_5.supraja.singleton;

public class singleton
{
    String str;
    public singleton(String str)
    {
       this.str=str;
    }
    public static singleton staticmethod(String str)
    {
        singleton obj=new singleton(str);
        return obj;
    }
    public void nonstaticmethod()
    {
        System.out.println(str);
    }
}
