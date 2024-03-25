package dev.prathmesh.app;

public class A
{
    B b;
    public A()
    {
        System.out.println("This is class A");
    }

    public B getB()
    {
        return b;
    }

    public void setB(B b)
    {
        this.b = b;
    }

    public void printA()
    {
        System.out.println("This is printA");
        b.printB();
    }


}
