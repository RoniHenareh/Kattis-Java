import java.util.Locale;
import java.util.Scanner;

public class qaly {

    public static void main(String[] args) throws Exception {

        // useLocale(Locale.US); för (.) och (,) olika i olika länder
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int n = sc.nextInt();

        sc.close();

        Double summa = 0.0;
        for (int i=0; i<n; i++) {

            Double tal1 = sc.nextDouble();
            Double tal2 = sc.nextDouble();

            summa += (tal1*tal2);
        }

        System.out.println(summa);

    }

}
