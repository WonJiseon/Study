/* 주제: 레퍼런스 배열 연습 - 명령어들을 재사용하고 관리하기 좋게 블록으로 묶는다.
 => 예)
제목? aaaa
내용? bbbb
암호? 1111
계속 입력하시겠습니까?(y/n) y
제목? abab
내용? cccc
암호? 2222
계속 입력하시겠습니까?(y/n) n
1, aaaa, bbbb, 1111, 2016-06-22, 0
2, abab, cccc, 2222, 2016-06-22, 0
*/
package step07.ex04;

import java.util.*;

public class BoardController {
  // 여러 스태틱 메서드에서 사용할 변수는 static으로 선언.
  static Scanner keyScanner = new Scanner(System.in);

  public static void main(String[] args) {
    Board[] board = new Board[100];
    int i = 0;
    Board board;

    while (true) {
      board = inputBoard();
      boards[i++] = board;
      if (!(prompt))
        break;
    }
    System.out.println("[메인 > 게시판]");
    for (int x = 0; x < i; x ++) {
      printBoard(boards[x]);
    }
  }

  // 게시물을 출력하는 메서드
  static void printBoard(Board board) {
    System.out.printf("%d %s %s %s %s  %d\n",
    board.no,
    board.title,
    board.contents,
    board.writer,
    board.createdDate,
    board.viewCount);
  }

  // 사용자에게 예/아니오를 묻는 메서드
  static boolean prompt() {
    System.out.print("계속 입력하시겠습니까?(y/N) ");
    String answer = keyScanner.nextLine();
    if (answer.equals("N") || answer.equals("") || answer.equals("n"))
      return false;
    return true;
  }

  // 게시물을 입력받아 인스턴스를 생성하는 메서드
  static Board inputBoard() {
    System.out.println("[메인 > 게시판]");
    Board board = new Board();
    System.out.print("제목? ");
    board.title = keyScanner.nextLine();
    System.out.print("내용? ");
    board.contents = keyScanner.nextLine();
    System.out.print("작성자? ");
    board.writer = keyScanner.nextLine();
    System.out.print("암호? ");
    board.password = keyScanner.nextLine();
  }
}

/*
*/
