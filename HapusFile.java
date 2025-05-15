import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Lenovo\\Documents\\LAB PEMLAN\\TulisFile1"); 

        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        file.delete();
                    }
                }
            }
            boolean success = folder.delete();
            if (success) {
                System.out.println("Direktori dan file berhasil dihapus.");
            } else {
                System.out.println("Gagal menghapus direktori.");
            }
        } else {
            System.out.println("Direktori tidak ditemukan.");
        }
    }
}
