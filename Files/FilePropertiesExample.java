import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePropertiesExample {
    public static void main(String[] args) {
        File file = new File("./exmple.txt");

        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("File Path: " + file.getAbsolutePath());
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File Size: " + file.length() + " bytes");
        } else {
            try {
                file.createNewFile();
                FileWriter writer=new FileWriter(file);
                String data="this the data going to write in your file";
                writer.write(data);
                writer.close();
            } catch (IOException e) {
                System.out.println("error occurs");
            }
        }
    }
}
