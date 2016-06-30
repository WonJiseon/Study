package step07.ex05;

import java.util.Scanner;

public class MainApp {

  public static void main(String[] args) {
    Scanner keyScanner = new Scanner(System.in);
    BoardController.keyScanner = keyScanner;
    ContactController.keyScanner = keyScanner;
    
    label1:
    while (true) {
      System.out.println("----------------------------");
      System.out.println("[메뉴]");
      System.out.println("1. 게시판");
      System.out.println("2. 연락처");
      System.out.println("0. 종료");
      System.out.println("----------------------------");
      System.out.print("메뉴 번호를 입력하세요>");
      String menuNo = keyScanner.nextLine();

      switch (menuNo) {
      case "1":
        BoardController.service();
        break;
      case "2":
        ContactController.service();
        break;
      case "0":
        break label1;
      default:
        System.out.println("해당 메뉴가 없습니다.");
      }
    }
    keyScanner.close();
  }
}
