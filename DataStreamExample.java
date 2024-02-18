import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataStreamExample {
   
    public static void main(String[] args) throws IOException {
        //buffered output stream can be used to write large amounts of data to a file
        BufferedOutputStream bos = null;
        //allows to write primitive Java data types to the output stream
        DataOutputStream dos = null;
        //write to a file
        try {
            bos = new BufferedOutputStream(new FileOutputStream("data.txt"));
            dos = new DataOutputStream(bos);
            dos.writeUTF("Hello World");
        } catch (IOException e) {
            System.out.println("Error writing to file : " + e);
        } finally {
            //close the stream
            dos.close();
        }
    }
}