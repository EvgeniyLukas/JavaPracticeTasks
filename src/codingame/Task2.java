package codingame;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String sum = in.next();
    String sum1 = sum.replace("+", "");
    char[] chars = sum1.toCharArray();
    Arrays.sort(chars);
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < chars.length; i++) {
      if (i < chars.length - 1) {
        stringBuilder.append(chars[i]).append("+");
      } else {
        stringBuilder.append(chars[i]);
      }
    }
    System.out.println(stringBuilder);
  }
}
