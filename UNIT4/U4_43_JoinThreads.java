//43. Write a java program to join two threads which perform loop operations.

class Loop1 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread 1 : " + i);
        }
    }
}

class Loop2 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread 2 : " + i);
        }
    }
}

public class U4_43_JoinThreads
{
    public static void main(String args[]) throws Exception
    {
        Loop1 t1 = new Loop1();
        Loop2 t2 = new Loop2();

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        System.out.println("Both threads completed");
    }
}
