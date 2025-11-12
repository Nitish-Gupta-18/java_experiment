import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Exp9_Q4{
    public static void main(String[] args) {
        System.out.println("nitish gupta,24csu330");
        String filename = "students.txt";
        try {
            // Writing data using BufferedWriter
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            bw.write("1, John, 8.65, A\n");
            bw.write("2, Alice, 9.12, B\n");
            bw.write("3, Bob, 7.45, C\n");
            bw.close();

            // Reading data using BufferedReader
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            System.out.println("Student Records:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}