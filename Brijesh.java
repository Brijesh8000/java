class  Area{
    static void Fun1()
    {
        System.out.println("Area1");
    }
    static  void Fun2()
    {
        System.out.println("Area2");
    }
    static void  Fun3()
    {
        System.out.println("Area3");
    }
}
class Brijesh{
    static void Fun1()
    {
        System.out.println("Fun1");
    }
    static  void Fun2()
    {
        System.out.println("Fun2");
    }
    static void  Fun3()
    {
        System.out.println("Fun3");
    }
   public static void main(String []args)
   {
       System.out.println("Hello");
       Fun1();
       Fun3();
       Area.Fun1();
   }
}
