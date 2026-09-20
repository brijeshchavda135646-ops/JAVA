//21. Write a java program to demonstrate encapsulation.

class Student
{
    private int rollno;
    private String name;

    public void setData(int r,String n)
    {
        rollno = r;
        name = n;
    }

    public void display()
    {
        System.out.println("Roll No : " + rollno);
        System.out.println("Name : " + name);
    }
}

public class U2_21_Encapsulation
{
    public static void main(String args[])
    {
        Student s = new Student();
        s.setData(1,"Mihir");
        s.display();
    }
}
