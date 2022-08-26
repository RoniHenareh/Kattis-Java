import java.util.Scanner;

public class jumbojavelin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int summa = 0;
        for (int i = 0; i<n; i++) {

            int tal = sc.nextInt();
            summa += tal;
        }
        sc.close();

        System.out.println(summa - n + 1);

    }
    
}
