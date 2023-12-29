class Brijesh
{
    int x;
    int y;
    void Fun1()
    {
        System.out.println("Function 1: ");
    }
    void Fun2()
    {
        System.out.println("Function 2 :");
    }
    void Fun3()
    {
        System.out.println("Function 3 :");
    }
}

class  NonStaticFun
{
    public static void main(String []arg)
    {
        System.out.println("Hello Main");
        Brijesh B1= new Brijesh();
        B1.Fun3();
        B1.Fun1();
        B1.y=4;
        System.out.println(B1.y);
        System.out.println(B1.x);
    }
}