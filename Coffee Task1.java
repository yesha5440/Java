public class Coffee Task1
{

    public static void main(String[] arge) {

        int a;
        char b;
        float c;
        double d;
        string e;
        long f;
        scanner sc = new scanner(system.in);

        System.out.print("Enter value A :");
        a = sc.nextInt();
        System.out.print("Enter value B :");
        b = sc.next().chartAt(0);
        System.out.print("Enter value C :");
        c = sc.nextFloat();
        System.out.print("Enter value D :");
        d = sc.nextDouble();
        System.out.print("Enter value E :");
        e = sc.nextLine();
        System.out.print("Enter value F :");
        f = sc.nextLong();

        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
        System.out.println("E = " + e);
        System.out.println("F = " + f);

    }

}
