class  Brijesh{
    int x;
    private  static int y;
    void Fun1()
    {
        y=22;

    }
    void Fun2(){
        System.out.println(y);
    }
    void Fun3()
    {
        y=45;
    }

}

class PrivateStatic
{
    public static void main(String []args)
    {
        Brijesh B1=new Brijesh();
        Brijesh B2=new Brijesh();

        B1.Fun1();
        B2.Fun3();
        B1.Fun2();

    }



}