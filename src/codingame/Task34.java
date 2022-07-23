package codingame;

import java.util.Scanner;

public class Task34 {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String DNA = in.nextLine();
    DNA = DNA.replace("T", "TTT");
    DNA = DNA.replace("A", "AA");
    DNA = DNA.replace("G", "");
    System.out.println(DNA);
  }
}
