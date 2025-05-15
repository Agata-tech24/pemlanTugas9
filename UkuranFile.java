import java.io.File;

public class UkuranFile {
    public static void main(String[] args) {
        File file = new File("test.txt");

        if (file.exists()) {
            long bytes = file.length();
            if (bytes < 1024 * 1024) {
                double kb = bytes / 1024.0;
                System.out.printf("Ukuran file: %.2f KB%n", kb);
            } else {
                double mb = bytes / (1024.0 * 1024);
                System.out.printf("Ukuran file: %.2f MB%n", mb);
            }
        } else {
            System.out.println("File tidak ditemukan.");
        }
    }
}
