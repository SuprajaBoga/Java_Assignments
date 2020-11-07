package Assignment_7;

public class CycleMain
{
    public static void main(String[] args)
    {
        Cycle[] cycle=new Cycle[3];
        cycle[0]=new unicycle();
        cycle[1]=new bicycle();
        cycle[2]=new tricycle();

       /*error because no balance() method in cycle class
        for(Cycle obj:cycle)
            obj.balance();*/

        //downcasting to subclass methods
        ((unicycle)cycle[0]).balance();
        ((bicycle)cycle[1]).balance();
        //((tricycle)cycle[2]).balance();  error because no balance() in tricycle
    }
}
class Cycle
{
    Cycle()
    {
        System.out.println("cycle class");
    }
}
class unicycle extends Cycle
{
   unicycle()
    {
        System.out.println("unicycle class");
    }
     void balance()
     {
         System.out.println("unicycle method");
     }
}
class bicycle extends Cycle
{
    bicycle()
    {
        System.out.println("bicycle class");
    }
    void balance()
    {
        System.out.println("bicycle method");
    }
}
class tricycle extends Cycle
{
    tricycle()
    {
        System.out.println("tricycle class");
    }
}
