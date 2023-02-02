import java.util.Scanner;

public class Coffee4 {

    public static void main(String[] args) {

        int a, b, c;
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter value A :");
        a = Sc.nextInt();
        System.out.print("Enter value B :");
        b = Sc.nextInt();
        System.out.print("Enter value C :");
        c = Sc.nextInt();

        if (a < b) {
            if (a < c) {
                System.out.println("A");
            } else {
                System.out.println("C");
            }
        } else {
            if (b < c) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        }
    }

}
