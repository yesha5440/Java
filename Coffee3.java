import java.util.Scanner;

public class Coffee3 {

    public static void main(String[] args) {

        int a;
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter value A :");
        a = Sc.nextInt();

        if (a > 0) {
            System.out.println("Pos");
        } else if (a > 0) {
            System.out.println("Neg");
        } else {
            System.out.println("Zero");
        }

    }

}
