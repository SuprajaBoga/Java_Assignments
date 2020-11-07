package Assignment_7;

interface Cycles
{
     void cycletype();
}

class Unicycle implements Cycles
{
    Unicycle()
    {
        System.out.println("unicycle class");
    }
    public void cycletype()
    {
        System.out.println("unicycle method");
    }

}class Bicycle implements Cycles
{
    Bicycle()
    {
        System.out.println("bicycle class");
    }
    public void cycletype()
    {
        System.out.println("bicycle method");
    }

}

class Tricycle implements Cycles
{
    Tricycle()
    {
        System.out.println("tricycle class");
    }
    public void cycletype()
    {
        System.out.println("tricycle method");
    }

}

class UnicycleFactory
{
    public static Unicycle getunicycle()
    {
        return new Unicycle();
    }
}

class BicycleFactory
{
    public static Bicycle getbicycle()
    {
        return new Bicycle();
    }
}

class TricycleFactory
{
    public static Tricycle gettricycle()
    {
        return new Tricycle();
    }
}

public class CycleFactory
{
    public static void main(String[] args)
    {
        Cycles unicycle=UnicycleFactory.getunicycle();
        unicycle.cycletype();
        Cycles bicycle=BicycleFactory.getbicycle();
        bicycle.cycletype();
        Cycles tricycle=TricycleFactory.gettricycle();
        tricycle.cycletype();
    }

}
