import java.util.*;

public class triarea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // System.in 

        int tal1 = sc.nextInt();
        int tal2 = sc.nextInt();

        sc.close();
        
        Double svar = ((tal1 * tal2) / 2.0);

        System.out.println(svar);
    }
    
}
