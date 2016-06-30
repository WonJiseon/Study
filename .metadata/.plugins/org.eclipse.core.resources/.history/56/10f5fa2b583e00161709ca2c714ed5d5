import java.util.Scanner;

public class Test47 {
  public static void main(String[] args) throws Exception {
    Scanner keyScanner = new Scanner(System.in);
    System.out.print("밑변의 길이는? ");
    int len = Integer.parseInt(keyScanner.nextLine());
    int starSize = 1, i = 0, spaceSize = len / 2;
        
    while(starSize <= len + 1) {
      i = 0;
      while(i < spaceSize) {
      System.out.print(" ");
      i++;
      }
      spaceSize--;
      i = 0;
      while(i < starSize) {
        System.out.print("*");
        i++;
      }
      System.out.println();
      starSize += 2;
      keyScanner.close();
    }
  }
}
