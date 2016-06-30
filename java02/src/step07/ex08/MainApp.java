package step07.ex08;

import java.util.Scanner;

public class MainApp {

  public static void main(String[] args) {
    Scanner keyScanner = new Scanner(System.in);
    BoardController.keyScanner = keyScanner;
    BoardController board1 = new BoardController("공지 게시판");
    BoardController board2 = new BoardController("영업부 게시판");
    BoardController board3 = new BoardController("개발부 게시판");
    ContactController.keyScanner = keyScanner;
    ContactController contact1 = new ContactController("직원 연락처");
    ContactController contact2 = new ContactController("고객 연락처");
    MemberController.keyScanner = keyScanner;
    MemberController member = new MemberController("회원");
    ProjectController.keyScanner = keyScanner;
    ProjectController project = new ProjectController("프로젝트");
    
    label1:
    while (true) {
      System.out.println("----------------------------");
      System.out.println("[메뉴]");
      System.out.println("1. 공지 게시판");
      System.out.println("2. 영업부 게시판");
      System.out.println("3. 개발부 게시판");
      System.out.println("4. 직원 연락처");
      System.out.println("5. 고객 연락처");
      System.out.println("6. 회원");
      System.out.println("7. 프로젝트");
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
      case "6":
        member.service();
      case "7":
        project.service();
      case "0":
        break label1;
      default:
        System.out.println("해당 메뉴가 없습니다.");
      }
    }
    keyScanner.close();
  } 
}