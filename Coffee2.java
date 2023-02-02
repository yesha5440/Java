import java.util.Scanner;

public class Coffee2 {

    public static void main(String[] args) {

        int a, b;
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter value A ;");
        a = Sc.nextInt();
        System.out.print("Enter value B ;");
        b = Sc.nextInt();

        if (a > b) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }

    }
}
