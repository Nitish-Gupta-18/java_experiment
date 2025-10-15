import exercises.java.Exp7Q1Demo;

public class Exp7Q2Main {
    public static void main(String[] args) {
        System.out.println("Accessing Exp7Q1Demo from outside the package");
        Exp7Q1Demo obj = new Exp7Q1Demo();
        obj.display();
    }
}