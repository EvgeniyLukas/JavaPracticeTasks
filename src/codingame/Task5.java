package codingame;

import java.util.Scanner;

public class Task5 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int numerator = in.nextInt();
    int denominator = in.nextInt();
    for (int i = 1; i < numerator; i++) {
      if (numerator % i == 0 && denominator % i == 0) {
        numerator = numerator / i;
        denominator = denominator / i;
      }
    }
    System.out.println(numerator + "/" + denominator);
  }
}
