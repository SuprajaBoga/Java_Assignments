package Assignment_6;

public class InitialisedObjects
{
    InitialisedObjects(String str)
    {
        System.out.println(str);
    }
    public static void main(String[] args)
    {
        //no output as only references are created
        InitialisedObjects obj[]=new InitialisedObjects[2];
        for(int i=0;i<2;i++)
        {
            obj[i]=new InitialisedObjects("Hi");
        }
    }
}
