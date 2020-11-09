package Assignment_6;

public class UninitialisedObjects
{
    UninitialisedObjects(String str)
    {
        System.out.println(str);
    }
    public static void main(String[] args)
    {
        //no output as only references are created
        UninitialisedObjects obj[]=new UninitialisedObjects[2];
    }
}
