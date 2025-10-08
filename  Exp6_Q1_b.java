interface A {
    void show();
}
interface B extends A {
    void display();
}
class MyClass implements B {
    public void show() {
        System.out.println("Show method from interface A");
    }

    public void display() {
        System.out.println("Display method from interface B");
    }
}
public class Exp6_Q1_b {
    public static void main(String[] args) {
       System.out.println("Nitish Gupta, 24csu330");
        MyClass obj = new MyClass();
        obj.show();
        obj.display();
    }
}