//42. Write a java program to create two threads and make them Synchronized (Thread Safe).

class Table
{
    synchronized void printTable(int n)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(n*i);
        }
    }
}

class Thread1 extends Thread
{
    Table t;

    Thread1(Table t)
    {
        this.t = t;
    }

    public void run()
    {
        t.printTable(2);
    }
}

class Thread2 extends Thread
{
    Table t;

    Thread2(Table t)
    {
        this.t = t;
    }

    public void run()
    {
        t.printTable(5);
    }
}

public class U4_42_Synchronized
{
    public static void main(String args[])
    {
        Table t = new Table();

        Thread1 t1 = new Thread1(t);
        Thread2 t2 = new Thread2(t);

        t1.start();
        t2.start();
    }
}
