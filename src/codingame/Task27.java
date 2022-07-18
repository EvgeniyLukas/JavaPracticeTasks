package codingame;

import java.util.Scanner;

public class Task27 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String duration = in.next();
    String[] split = duration.split("[:]");
    int hour = Integer.parseInt(split[0]) * 60;
    int min = Integer.parseInt(split[1]);
    System.out.println(hour + min);
  }
}
