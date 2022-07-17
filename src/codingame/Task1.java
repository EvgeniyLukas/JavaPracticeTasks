package codingame;

import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      StringBuilder str = new StringBuilder(String.valueOf(n));
      str.reverse();
      n = n - Integer.parseInt(str.toString());

      System.out.println(n);
    }
  }

