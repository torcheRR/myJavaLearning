import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createFile();
        getFileInfo();
        readFile();
        writeFile();
        readFile();
    }





    public static void createFile(){
        File file =new File("/Users/berkayocer/Desktop/java/files/students.txt");
        try {
            if (file.createNewFile()){
                System.out.println("Dosya Oluşturuldu.");
            }
            else {
                System.out.println("Dosya Mevcut!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFileInfo(){
        File file= new File("/Users/berkayocer/Desktop/java/files/students.txt");
        if (file.exists()){
            System.out.println("Dosya adı: "+ file.getName());
            System.out.println("Dosya yolu: "+ file.getAbsoluteFile());
            System.out.println("Dosya okunabilirlik: "+file.canRead());
            System.out.println("Dosya yazılabilirlik: "+file.canWrite());
            System.out.println("Dosya Boyut: "+ file.length());
        }
    }

    public static void readFile(){
        File file=new File("/Users/berkayocer/Desktop/java/files/students.txt");
        try {
            Scanner reader=new Scanner(file);
            while (reader.hasNextLine()){
                    String line= reader.nextLine();
                    System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/berkayocer/Desktop/java/files/students.txt",true));
            writer.newLine();
            writer.write("Berkay");
            System.out.println("Dosyaya yazıldı!");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}