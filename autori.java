import java.util.*;

public class autori {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String namn = sc.next();

        sc.close();

        for (int i = 0; i<(namn.length()); i++) { // intressant, len i java!

            char c = namn.charAt(i); // intressant ger varje char
            //System.out.println(c);

            if (Character.isUpperCase(c)) { // intressant, kolla om stor bokstav
                System.out.print(c);
            }
            
        }

        System.out.print("\n");
        
    }
    
}
