import java.util.Scanner;

public class LXS_11_Biggest_among_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if (a > b && a > c) {
      System.out.println("Biggest is " + a);
    } else if (b > a && b > c) {
      System.out.println("Biggest is " + b);
    } else if (c > a && c > b) {
      System.out.println("Biggest is " + c);
    } else {
      System.out.println("All are same");
    }
  }
}
