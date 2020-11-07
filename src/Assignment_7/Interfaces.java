package Assignment_7;

interface Interface1
{
    void method1();
    void method2();
}

interface Interface2
{
    void method3();
    void method4();
}

interface Interface3
{
    void method5();
    void method6();
}

interface Interface4 extends Interface1, Interface2, Interface3 {
    void method7();
}

class ConcreteClass
{
    ConcreteClass()
    {
        System.out.println("concrete class");
    }
}

class child extends ConcreteClass implements Interface4
{
    @Override
    public void method1()
    {
        System.out.println("method1");
    }

    @Override
    public void method2()
    {
        System.out.println("method2");
    }

    @Override
    public void method3()
    {
        System.out.println("method3");
    }

    @Override
    public void method4()
    {
        System.out.println("method4");
    }

    @Override
    public void method5()
    {
        System.out.println("method5");
    }

    @Override
    public void method6()
    {
        System.out.println("method6");
    }

    @Override
    public void method7()
    {
        System.out.println("method7");
    }

    void getmethod1(Interface1 obj)
    {
        obj.method1();
        obj.method2();
    }

    void getmethod2(Interface2 obj)
    {
        obj.method3();
        obj.method4();
    }

    void getmethod3(Interface3 obj)
    {
        obj.method5();
        obj.method6();
    }
    void getmethod4(Interface4 obj)
    {
        obj.method7();
    }
}

public class Interfaces
{
    public static void main(String[] args)
    {
        child obj=new child();
        obj.getmethod1(obj);
        obj.getmethod2(obj);
        obj.getmethod3(obj);
        obj.getmethod4(obj);
    }
}
