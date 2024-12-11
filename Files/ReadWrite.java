import java.io.*;

public class ReadWrite {
    public static void main(String[] args) {
        try {
            BufferedReader reader=new BufferedReader(new FileReader(new File("./Source.txt")));
            BufferedWriter writer=new BufferedWriter(new FileWriter(new File("./exmple.txt")));
            String line;
            while ((line=reader.readLine())!=null) {
                writer.append(line);
                writer.newLine();
                System.out.println(line);
            }
            writer.close();
            System.out.println("work Done");

        } catch (IOException e) {
            System.out.println("work Not Done");
        }
    }
    
}