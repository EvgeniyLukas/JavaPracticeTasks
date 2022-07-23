package codingame;

import java.util.Scanner;

public class Task35 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String myString = in.nextLine();
    char[] chars = myString.toUpperCase().toCharArray();
    int ascii = 0;
    for (char aChar : chars) {
      ascii += aChar;
    }
    System.out.println((char) (ascii / chars.length));
  }
}
