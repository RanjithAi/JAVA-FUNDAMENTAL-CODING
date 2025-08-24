public class q40 {
    void add(int a,int b)
    {
       System.out.println(a+b);
    }
    void sub(int a,int b)
    {
        System.out.println(a-b);
    }
    void mul(int a,int b)
    {
        System.out.println(a*b);
    }
    void div(int a,int b)
    {
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        q40 obj = new q40();
        obj.add(10,1);
        obj.sub(10,2);
        obj.mul(10,3);
        obj.div(10,4);
    }
}
