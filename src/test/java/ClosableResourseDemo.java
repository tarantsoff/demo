import java.io.*;

public class ClosableResourseDemo {

    public static void main(String[] args) throws IOException {

        String userHomeDir = System.getProperty("user.home");

        File file = new File(userHomeDir, "file.txt");
        try (InputStream inputStreamReader = new FileInputStream(file)){
                int read = inputStreamReader.read();
            while (read != -1) {
                System.out.println("read = " + read);
            }
        }

    }
}
