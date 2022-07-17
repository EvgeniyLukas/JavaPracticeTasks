package codingame;

import java.util.Scanner;

public class Task13 {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();

    if (in.hasNextLine()) {
      in.nextLine();
    }
    int count = 0;
    for (int i = 0; i < N; i++) {
      String ROW = in.nextLine();
      char[] chars = ROW.toCharArray();
      for (char r : chars) {
        if(Character.isDigit(r)){
          count++;
        }
      }
      System.out.println(count);
    }
  }
}

