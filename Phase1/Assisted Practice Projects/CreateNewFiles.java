package Files;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
 
public class CreateNewFiles
{
    public static void main(String[] args) throws IOException
    {
        createFileUsingFileClass();
        createFileUsingFileOutputStreamClass();
        createFileIn_NIO();
    }
 
    private static void createFileUsingFileClass() throws IOException
    {
    	File file1= new File("C://temp22");
    	if(!file1.exists()) {
    		file1.mkdirs();
    	}
          File file = new File("C://temp22/Hello world5.txt");
          
          if (file.createNewFile()){
            System.out.println("File is created Successfully!");
          }else{
            System.out.println("File already exists.");
          }
           
          FileWriter writer = new FileWriter(file);
          writer.write("hai ");
          writer.close();
    }
 
    private static void createFileUsingFileOutputStreamClass() throws IOException
    {
        String data = "Test data 2";
        FileOutputStream out = new FileOutputStream("C://temp22/Hello world3.txt");
        out.write(data.getBytes());
        out.close();
    }
 
    private static void createFileIn_NIO()  throws IOException
    {
        String data = "Test data 3";
        Files.write(Paths.get("C://temp22/Hello world4.txt"), data.getBytes());
        List<String> lines = Arrays.asList("1st line", "2nd line");
       Files.write(Paths.get("file6.txt"),
                    lines,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
    }
}