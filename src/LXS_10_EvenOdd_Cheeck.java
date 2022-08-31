import java.util.*;

public class LXS_10_EvenOdd_Cheeck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number : ");
    int a = sc.nextInt();
    if (a % 2 == 0 && a != 0) {
      System.out.println("Even");
    } else if (a % 2 != 0) {
      System.out.println("odd");
    } else {
      System.out.println("Zero");
    }
  }
}
