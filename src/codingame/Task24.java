package codingame;

import java.util.Scanner;

public class Task24 {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String message = in.nextLine();
    String[] split = message.split("[ ]");
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < split.length; i++) {
      if(split[i].length()%2!=0) {
        builder.append(split[i].substring(split[i].length() / 2, split[i].length() / 2 + 1));
      }else {
        builder.append(split[i].substring(split[i].length() / 2, split[i].length() / 2 -1));
      }
    }
    System.out.println(builder);
  }
}
