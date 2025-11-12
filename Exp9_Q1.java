import java.io.File;

public class Exp9_Q1 {
    public static void main(String[] args) {
        System.out.println("nitish gupta,24csu330");
        File file = new File("example.txt"); // Change to your file or directory path
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("It is a file.");
            } else if (file.isDirectory()) {
                System.out.println("It is a directory.");
            }
        } else {
            System.out.println("File/Directory does not exist.");
        }
    }
}