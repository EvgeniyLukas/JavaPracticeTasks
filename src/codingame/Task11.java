package codingame;

import java.util.Scanner;

public class Task11 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String variableName = in.nextLine();
    char[] chars = variableName.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == '_' && chars[i] < chars.length) {
        chars[i + 1] = Character.toUpperCase(chars[i + 1]);
      }
    }
    String replace = new String(chars).replace("_", "");
    System.out.println(replace);
  }
}
