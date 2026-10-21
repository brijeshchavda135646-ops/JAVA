//41. Write a java program to set Thread name and priority & test it.

public class U4_41_ThreadNamePriority extends Thread
{
    public void run()
    {
        System.out.println("Thread Name : " + Thread.currentThread().getName());
        System.out.println("Thread Priority : " + Thread.currentThread().getPriority());
    }

    public static void main(String args[])
    {
        U4_41_ThreadNamePriority t = new U4_41_ThreadNamePriority();

        t.setName("MyThread");
        t.setPriority(8);

        t.start();
    }
}
