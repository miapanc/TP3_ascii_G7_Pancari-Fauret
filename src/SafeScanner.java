import java.util.Scanner;
import java.io.InputStream;

public class SafeScanner {
    Scanner scan;
    public SafeScanner(InputStream is){
        this.scan = new Scanner(is);
    }

    public int getINT(){
        int entree = this.scan.nextInt();
        return entree;
    }

    public int []getDimDepuisFichier(){
        String entree = this.scan.nextLine();
        int[] dimension = new int[2];
        dimension[0] = entree.charAt(0) - '0';
        dimension[1] = entree.charAt(2) - '0';
        return dimension;
    }

    public void fermerScanner(){
        this.scan.close();
    }
}
