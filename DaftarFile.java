import java.io.File;

public class DaftarFile {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Lenovo\\Documents\\LAB PEMLAN\\TUGAS 9 LAB"); 

        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        System.out.println(file.getName());
                    }
                }
            }
        } else {
            System.out.println("Direktori tidak ditemukan atau bukan direktori.");
        }
    }
}
