import java.io.File;
import java.io.IOException;
public class InputOutputOpertaions {
    public boolean checkFileExixtence()throws IOException{
        File file= new File("java.txt");
        System.out.println(file.exists());
        boolean newFileCreated = file.createNewFile();

        System.out.println(file.exists());
        return file.exists();
    }
    public long getFileLength()throws IOException {
        File file= new File("java1.txt");
        file.createNewFile();
        long fileLength = file.length();
        return fileLength;
    }
    public int getFileAdd()throws IOException{
        File file= new File("java2.txt");
        file.createNewFile();
        long fileAdd = file.length();
        return (int) fileAdd;

    }
    public static void main(String[] args) {
        InputOutputOpertaions fbo=new InputOutputOpertaions();
        try {
            System.out.println(fbo.getFileLength());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
