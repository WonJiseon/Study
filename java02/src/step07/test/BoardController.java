package step07.test;
import java.util.Scanner;

public class BoardController {
  static Scanner keyScanner;
  Board[] boards = new Board[100];
  int i = 0;

  public void service() {
    while (true) {
      this.Board();
      if (!prompt())
        break;
    }

    this.printAll();

  }

  void printAll() {
    for (int x = 0; x < this.i; x++) {
      System.out.printf("%d, %s, %s, %s, %d\n",
          this.boards[x].no, this.boards[x].title, this.boards[x].writer,
          this.boards[x].createdDate, this.boards[x].viewCount);
    }
  }

    static boolean prompt() {
      System.out.print("계속 입력하시겠습니까?(y/n) ");
      String answer = keyScanner.nextLine();
      if (answer.equals("n"))
        return false;
      return true;
    }

    void Board() {
      Board board = new Board();
      System.out.print("제목? ");
      board.title = keyScanner.nextLine();
      System.out.print("내용? ");
      board.contents = keyScanner.nextLine();
      System.out.print("암호? ");
      board.password = keyScanner.nextLine();
      this.boards[this.i++] = board;
    }
  }

  /*
   */