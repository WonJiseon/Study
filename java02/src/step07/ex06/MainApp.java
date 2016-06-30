package step07.ex06;

import java.util.Scanner;

public class MainApp {

  public static void main(String[] args) {
    Scanner keyScanner = new Scanner(System.in);
    BoardController.keyScanner = keyScanner;
    Board2Controller.keyScanner = keyScanner;
    Board3Controller.keyScanner = keyScanner;
    ContactController.keyScanner = keyScanner;
    
    label1:
    while (true) {
      System.out.println("----------------------------");
      System.out.println("[메뉴]");
      System.out.println("1. 공지 게시판");
      System.out.println("2. 영업부 게시판");
      System.out.println("3. 개발부 게시판");
      System.out.println("4. 연락처");
      System.out.println("0. 종료");
      System.out.println("----------------------------");
      System.out.print("메뉴 번호를 입력하세요>");
      String menuNo = keyScanner.nextLine();

      switch (menuNo) {
      case "1":
        BoardController.service();
        break;
      case "2":
        Board2Controller.service();
        break;
      case "3":
        Board3Controller.service();
      case "4":
        ContactController.service();
      case "0":
        break label1;
      default:
        System.out.println("해당 메뉴가 없습니다.");
      }
    }
    keyScanner.close();
  }
}
