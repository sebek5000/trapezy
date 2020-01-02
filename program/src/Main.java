import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.sqrt;

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

        System.out.println(integrate.calculate2());
        System.out.println(integrate.calculate4());
        //System.out.println(sqrt(3)/3 + 5.0/18);
        System.out.println(0.855072972231874388846275415617283738591949597481249266597);

    }
}
