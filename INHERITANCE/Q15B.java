interface A{
    void meth1();
    void meth2();
}
class MyClass implements A{
    @Override
    public void meth1(){
        System.out.println("Method 1 implemented");
    }
    @Override
    public void meth2(){
        System.out.println("Method 2 implemented");
    }
}
public class Q15B {
    public static void main(String[] args){
        MyClass obj=new MyClass();
        obj.meth1();
        obj.meth2();
    }
}
