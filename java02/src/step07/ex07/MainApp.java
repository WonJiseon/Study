package step07.ex07;

import java.util.Scanner;

public class MainApp {

  public static void main(String[] args) {
    Scanner keyScanner = new Scanner(System.in);
    BoardController.keyScanner = keyScanner;
    BoardController board1 = new BoardController();
    board1.boardName = "공지 게시판";
    
    BoardController board2 = new BoardController();
    board2.boardName = "영업부 게시판";
    
    BoardController board3 = new BoardController();
    board3.boardName = "개발부 게시판";
    ContactController.keyScanner = keyScanner;
    ContactController contact1 = new ContactController();
    contact1.contactName = "직원 연락처";
    ContactController contact2 = new ContactController();
    contact2.contactName = "고객 연락처";
    
    label1:
    while (true) {
      System.out.println("----------------------------");
      System.out.println("[메뉴]");
      System.out.println("1. 공지 게시판");
      System.out.println("2. 영업부 게시판");
      System.out.println("3. 개발부 게시판");
      System.out.println("4. 직원 연락처");
      System.out.println("5. 고객 연락처");
      System.out.println("0. 종료");
      System.out.println("----------------------------");
      System.out.print("메뉴 번호를 입력하세요>");
      String menuNo = keyScanner.nextLine();

      switch (menuNo) {
      case "1":
        board1.service();
        break;
      case "2":
        board2.service();
        break;
      case "3":
        board3.service();
        break;
      case "4":
        contact1.service();
        break;
      case "5":
        contact2.service();
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