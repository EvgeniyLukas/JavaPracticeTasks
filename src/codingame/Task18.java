package codingame;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task18 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String W = in.next();
    Set<Character> characters = new HashSet<>();
    for (int i = 0; i < W.length(); i++) {
      characters.add(W.charAt(i));
    }
    System.out.println(characters.size());
  }
}
