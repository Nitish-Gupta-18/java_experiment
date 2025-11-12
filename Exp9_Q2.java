import java.io.File;

public class Exp9_Q2 {
    public static void main(String[] args) {
        System.out.println("nitish gupta,24csu330");
        File file = new File("example.txt"); // Change to your file path
        boolean readable = file.setReadable(true);
        boolean writable = file.setWritable(true);
        boolean executable = file.setExecutable(false);

        System.out.println("Readable: " + readable);
        System.out.println("Writable: " + writable);
        System.out.println("Executable: " + executable);
    }
}