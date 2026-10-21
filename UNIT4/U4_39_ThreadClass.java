//39. Write a java program to create a thread using Thread Class.

class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Thread is running");
    }
}

public class U4_39_ThreadClass
{
    public static void main(String args[])
    {
        MyThread t = new MyThread();
        t.start();
    }
}
