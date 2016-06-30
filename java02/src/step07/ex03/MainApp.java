package step07.ex03;

import java.util.Scanner;

public class MainApp {
  public static void main(String[] args) {
    Scanner keyScanner = new Scanner(System.in);

    label1:
     while (true) {
       System.out.println("------------------------");
       System.out.println("[메뉴]");
       System.out.println("1. 게시판");
       System.out.println("2. 연락처");
       System.out.println("0. 종료");
       System.out.println("------------------------");

       System.out.print("번호를 입력하세요. ");
       String menuNo = keyScanner.nextLine();
      switch(menuNo) {
        case "1":
          System.out.println("게시판");
          break;
        case "2":
          System.out.println("연락처");
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
