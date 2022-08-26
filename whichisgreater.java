
import java.util.Scanner;

public class whichisgreater {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tal1 = sc.nextInt();
        int tal2 = sc.nextInt();

        sc.close();

        if (tal1 <= tal2) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }

       
    }
}
