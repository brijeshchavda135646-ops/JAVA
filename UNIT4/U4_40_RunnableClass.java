//40. Write a java program to create a thread using Runnable class.

class MyRunnable implements Runnable
{
    public void run()
    {
        System.out.println("Thread is running");
    }
}

public class U4_40_RunnableClass
{
    public static void main(String args[])
    {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}
