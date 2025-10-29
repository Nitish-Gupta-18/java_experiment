// Base class
class A extends Exception {
    void display() throws A {
        throw new A();
    }
}

// Derived class B inherits from A
class B extends A {
    @Override
    void display() throws B {
        throw new B();
    }
}

// Derived class C inherits from B
class C extends B {
    @Override
    void display() throws C {
        throw new C();
    }
}

public class  Exp8_Q2 {
    public static void main(String[] args) {
          System.out.println("nitish gupta,24csu330");
        try {    
            // Upcast C to A
            A obj = new C();
            obj.display();  // This will throw C type exception
        } 
        catch (C e) {
            System.out.println("Caught Exception from class C");
        } 
        catch (B e) {
            System.out.println("Caught Exception from class B");
        } 
        catch (A e) {
            System.out.println("Caught Exception from class A");
        }
    }
}