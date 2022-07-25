package codingame;

import java.util.Scanner;

public class Task39 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int count = 0;
    while (n > 0) {
      if (n - 25 >= 0) {
        count++;
        n -= 25;
      } else if (n - 10 >= 0) {
        n -= 10;
        count++;
      } else if (n - 5 >= 0) {
        n -= 5;
        count++;
      } else {
        //n -= 1;
        //count++;
      }
    }
    System.out.println(count);

  }
}
