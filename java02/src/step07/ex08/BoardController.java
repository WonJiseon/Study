
package step07.ex08;

import java.util.*;

public class BoardController {
  static Scanner keyScanner;
  Board[] boards = new Board[100];
  int i = 0;
  String boardName;

  public BoardController() {}

  public BoardController(String boardName) {
    this.boardName = boardName;
  }

  public  void service() {
    String command;

    label1: while (true) {
      System.out.printf("메인/%s> ", boardName);
      command = keyScanner.nextLine();

      switch (command) {
      case "main":
        break label1;
      case "add":
        this.add();
        break;
      case "list":
        this.list();
        break;
      case "detail":
        this.detail();
        break;
      case "update":
        this.update();
        break;
      case "delete":
        this.delete();
        break;
      default:
        System.out.println("사용할 수 없는 명령입니다.");
      }
    }
  }

  // 게시물을 출력하는 메서드
  void list() {
    for (int x = 0; x < this.i; x++) {
      //번호,제목,작성자,등록일,조회수
      System.out.printf("%d, %s, %s, %s, %d\n",
          x, this.boards[x].title, this.boards[x].writer,
          this.boards[x].createdDate, this.boards[x].viewCount);
    }
  }

  // 사용자에게 예/아니오를 묻는 메서드
  static boolean prompt() {
    System.out.print("계속 입력하시겠습니까?(y/N) ");
    String answer = keyScanner.nextLine();
    if(answer.equals("n") || answer.equals("") || answer.equals("N"))
      return false;
    return true;
  }

  // 게시물을 입력받아 인스턴스를 생성하는 메서드
  void add() {

    Board board = new Board();
    System.out.print("제목? ");
    board.title = keyScanner.nextLine();
    System.out.print("내용? ");
    board.contents = keyScanner.nextLine();
    System.out.print("암호? ");
    board.password = keyScanner.nextLine();
    this.boards[this.i++] = board;
  }
  void detail() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());

    if (no < 0 || no >= i) {
      System.out.println("해당 게시물이 없습니다.");
      return;
    }

    Board board = this.boards[no];
    System.out.printf("제목: %s\n", board.title);
    System.out.printf("내용: %s\n", board.contents);
    System.out.printf("작성자: %s\n", board.writer);
    System.out.printf("등록일: %s\n", board.createdDate);
    System.out.printf("조회수: %s\n", board.viewCount);
  }
  void update() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());

    if (no < 0 || no >= i) {
      System.out.println("해당 게시물이 없습니다.");
      return;
    }
    Board board = this.boards[no];
    System.out.printf("제목(%s)?", board.title);
    board.title = keyScanner.nextLine();
    System.out.printf("내용(%s)? ", board.contents);
    board.contents = keyScanner.nextLine();
  }

  void delete() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());

    if (no < 0 || no >= i) {
      System.out.println("해당 게시물이 없습니다.");
      return;
    }
    for (int x = no; x < this.i; x++) {
      this.boards[x] = this.boards[x + 1];
    }
    this.i--;
  }
}



/*
 */