package codingame;


import java.util.Scanner;

public class Task23 {

  class Solution {

    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int x1 = in.nextInt();
      int y1 = in.nextInt();
      int x2 = in.nextInt();
      int y2 = in.nextInt();

      double res1 = (double) (x1 + x2) / 2;
      if (res1 * 10 % 10 == 0) {
        System.out.print((int) res1);
      } else {
        System.out.print(res1);
      }
      System.out.print(" ");
      double res2 = (double) (y1 + y2) / 2;
      if (res2 * 10 % 10 == 0) {
        System.out.print((int) res2);
      } else {
        System.out.print(res2);

      }
    }
  }
}
