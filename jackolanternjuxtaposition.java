import java.util.Scanner;

public class jackolanternjuxtaposition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int summa = 1;
        for (int i = 0; i<3; i++) {

            int tal = sc.nextInt();
            summa *= tal;

        }
        sc.close();

        System.out.println(summa);

    } 

}
