package codingame;

import java.util.Scanner;

public class Task4 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String DNA = in.next();
    char[] chars = DNA.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == 'A') {
        chars[i] = 'T';
      } else if (chars[i] == 'C') {
        chars[i] = 'G';
      } else if ((chars[i] == 'T')) {
        chars[i] = 'A';
      } else if ((chars[i] == 'G')) {
        chars[i] = 'C';
      }
    }
    System.out.println(new String(chars));
  }
}
