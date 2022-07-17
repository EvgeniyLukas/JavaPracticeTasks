package codingame;

import java.util.Scanner;

public class Task8 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    int res = 0;
    for (int i = 0; i < number; i++) {
      if (number % i == 0) {
        res = i * i;
      }
    }

    System.out.println(res);
  }
}
