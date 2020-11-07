package Assignment_5.supraja.data;
public class data {
    int a;
    char b;

    public void printglobal()
    {
        System.out.println("a "+a);
        System.out.println("b "+b);
    }

    public void printlocal() {
        int c;
        int d;
        //java doesn't work on local variables which are not-initialised
        //System.out.println(c+" "+d);
    }
}