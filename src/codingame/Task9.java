package codingame;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String S = in.nextLine();
    String[] split = S.split("[*+= ]");
    //System.out.println(Arrays.toString(split));
    int[]ints = new int[split.length];
    for (int i = 0; i < ints.length; i++) {
      ints[i] = Integer.parseInt(split[i]);
    }
    int res = (ints[2]-ints[1])/ints[0];
    System.out.println(res);
  }
}
