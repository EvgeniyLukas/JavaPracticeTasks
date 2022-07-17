package codingame;

import java.util.Scanner;

public class Task10 {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    String[] plus = s.split("[-]");
    String[] minus = s.split("[+]");
    System.out.println(plus.length - minus.length);
  }
}
