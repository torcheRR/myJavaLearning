import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        BufferedReader reader = null;
        int total = 0;

        try {
            reader = new BufferedReader(new FileReader("/Users/berkayocer/Desktop/java/javaReadingFileDemo/javaReadingFileDemo/src/src/sayilar.txt"));

            for(String line = null; (line = reader.readLine()) != null; total += Integer.valueOf(line)) {
            }

            System.out.println("Total= " + total);
        } catch (FileNotFoundException var13) {
            throw new RuntimeException(var13);
        } catch (Exception var14) {
            var14.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception var12) {
            }

        }

    }
}