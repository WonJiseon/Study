package step07.ex07;

import java.util.Scanner;
public class BoardController {
  static Scanner keyScanner = new Scanner(System.in);
  Board[] boards = new Board[100];
  int i = 0;
  String boardName;

  public void BoardController() {}
  public void BoardController(String boardName) {
    this.boardName = boardName;
  }

  void service() {
    while (true) {
      System.out.printf("[메인 > %s]\n", this.boardName);
      this.input();
      if (!(prompt()))
        break;
    }
    System.out.printf("[메인 > %s]\n", this.boardName);
    this.printAll();
  }

   void printAll() {
     for (int x = 0; x < this.i; x++) {
       System.out.printf("%d %s %s %s %s %d\n",
        boards[x].no,
        boards[x].title,
        boards[x].contents,
        boards[x].writer,
        boards[x].createdDate,
        boards[x].viewCount);
      }
  }

  static boolean prompt() {
    System.out.print("계속 입력하시겠습니까?(y/N) ");
    String answer = keyScanner.nextLine();
    if (answer.equals("N") || answer.equals("") || answer.equals("n")) {
      return false;
    }
    return true;
  }

  void input() {
    Board board = new Board();
    System.out.print("제목? ");
    board.title = keyScanner.nextLine();
    System.out.print("내용? ");
    board.contents = keyScanner.nextLine();
    System.out.print("암호? ");
    board.password = keyScanner.nextLine();
  }
}
