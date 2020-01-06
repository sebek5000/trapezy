import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int m = -1;

        Integrate integrate =null;
        while(m < 0 ){
            System.out.println("Podaj wartość m.");
            try {
                Scanner S=new Scanner(System.in);
                m=S.nextInt();
                System.out.println(m);

                integrate = new Integrate(m);
            } catch (WrongArgumentException | InputMismatchException e) {
                System.out.println("Niepoprawne dane wejściowe, spróbuj ponownie.");
                m=-5000;
            }
        }


            long start = System.currentTimeMillis();
            System.out.println(integrate.calculate2());
            System.out.println("n2 zajęło ms: ");
            System.out.println( (System.currentTimeMillis() - start));
            start = System.currentTimeMillis();
            System.out.println(integrate.calculate4());
            System.out.println("n4 zajęło ms: ");
            System.out.println( (System.currentTimeMillis() - start));
    }
}
