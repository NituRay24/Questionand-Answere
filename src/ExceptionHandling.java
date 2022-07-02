import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class ExceptionHandling {
    public void checkInputOutputStreamDemo()throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("C:\\Users\\dell\\IdeaProjects");
            outputStream = new FileOutputStream("C:\\Users\\dell\\IdeaProjects");
            // make some operations with streams
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ExceptionHandling eh = new ExceptionHandling();
        eh.checkInputOutputStreamDemo();
    }


}
