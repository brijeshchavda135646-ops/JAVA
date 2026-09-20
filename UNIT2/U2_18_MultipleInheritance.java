//18. Write a java program to use Multiple inheritance using interface.

interface Father
{
    void father();
}

interface Mother
{
    void mother();
}

public class U2_18_MultipleInheritance implements Father,Mother
{
    public void father()
    {
        System.out.println("Father method");
    }

    public void mother()
    {
        System.out.println("Mother method");
    }

    public static void main(String args[])
    {
        U2_18_MultipleInheritance obj = new U2_18_MultipleInheritance();
        obj.father();
        obj.mother();
    }
}
