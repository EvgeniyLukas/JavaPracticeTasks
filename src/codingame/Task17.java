package codingame;

import java.util.Scanner;

public class Task17 {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    if (in.hasNextLine()) {
      in.nextLine();
    }
    String data = in.nextLine();
    int prevData = Integer.parseInt(data);
    for (int i = 0; i < N; i++) {
      if (i ==0) {
        System.out.print(prevData + " ");
      }else {
        System.out.print(prevData + " ");
      }
    }
  }
}
