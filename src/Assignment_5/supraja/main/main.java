package Assignment_5.supraja.main;

import Assignment_5.supraja.singleton.singleton;
import Assignment_5.supraja.data.data;

public class main
{
    public static void main(String[] args)
    {
        data obj1=new data();
        obj1.printglobal();
        //error occurs
        obj1.printlocal();

        singleton obj=singleton.staticmethod("supraja");
        obj.nonstaticmethod();
    }
}
