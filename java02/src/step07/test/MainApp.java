package step07.test;

import java.util.Scanner;

public class MainApp {
  public static void main(String[] args) {
    Scanner keyScanner = new Scanner(System.in);
    BoardController.keyScanner = keyScanner;
    BoardController boardController1 = new BoardController();
    BoardController boardController2 = new BoardController();
    BoardController boardController3 = new BoardController();
    ContactController.keyScanner = keyScanner;
    ContactController contactController1 = new ContactController();
    ContactController contactController2 = new ContactController();
    
    label1:
      while (true) { 
        System.out.println("------------------------");
        System.out.println("[메뉴]");
        System.out.println("1. 공지 게시판");
        System.out.println("2. 영업부 게시판");
        System.out.println("3. 개발부 게시판");
        System.out.println("4. 직원 연락처");
        System.out.println("5. 고객 연락처");
        System.out.println("0. 종료");
        System.out.println("------------------------");

        System.out.print("메뉴 번호를 입력하세요> ");
        String menuNo = keyScanner.nextLine();

        switch (menuNo) {
        case "1":
          boardController1.service();
          break;
        case "2":
          boardController2.service();
          break;
        case "3":
          boardController3.service();
          break;
        case "4":
          contactController1.service();
          break;
        case "5":
          contactController2.service();
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