import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int a = 10;
        System.out.println("a = " + a);
        double b = 22.0 / 7.0;
        System.out.printf("b = %.2f", b);

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Name = " + scan.nextLine());
        switch (scan.nextLine()) {
            case "Daniel":
                System.out.println("Good Morning");
                break;
            default:
                System.out.println("Good Afternoon");
                break;
        }
        int c = scan.nextInt();
        System.out.println("c = " + c);

        for (int i = 0; i < c; i++) {
            System.out.println("loop");
        }
    }
}
