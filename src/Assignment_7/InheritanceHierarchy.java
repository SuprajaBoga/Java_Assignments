package Assignment_7;

class InheritanceHierarchy {
    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[1] = new Gerbil();
        rodent[2] = new Hamster();
        for (Rodent obj : rodent) {
            obj.displayname();
        }
    }
}
    abstract class Rodent
    {
        Rodent()
        {
            System.out.println("rodent class");
        }
        abstract void displayname();
    }

    class Mouse extends Rodent
    {
        Mouse()
        {
            System.out.println("Mouse class");
        }
        @Override
        void displayname()
        {
            System.out.println("name is Mouse");
        }
    }

    class Gerbil extends Rodent
    {
        Gerbil()
        {
            System.out.println("Gerbil class");
        }
        @Override
        void displayname()
        {
            System.out.println("name is Gerbil");
        }
    }

    class Hamster extends Rodent
    {
        Hamster()
        {
            System.out.println("Hamster class");
        }
        @Override
        void displayname()
        {
            System.out.println("name is Haster");
        }
    }

