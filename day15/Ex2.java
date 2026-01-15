import java.io.File;
import java.io.IOException;

class Ex2 {
    public static void main(String[] args) throws IOException {
        File f = new File("c:/abc.txt");
        f.createNewFile();
        /*
         * try
         * {
         * f.createNewFile();
         * }
         * catch(IOException e)
         * {
         * System.out.println("無新增權限");
         * e.printStackTrace();
         * }
         */

    }
}