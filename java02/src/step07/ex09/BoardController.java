package step07.ex09;

import java.util.*;

public class BoardController {
  static Scanner keyScanner;
  String boardName;
  BoardDao boardDao = new BoardDao();
  
  public BoardController() {}
  
  public BoardController(String boardName) {
    this.boardName = boardName;
  }
  
  public void service() {
    String command;
    
    label1: while(true) {
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
      dafault:
        System.out.println("사용할 수 없는 명령입니다.");
      }
    }
  }
  void add() {
    Board board = new Board();
    System.out.print("제목? ");
    board.title = keyScanner.nextLine();
    System.out.print("내용? ");
    board.contents = keyScanner.nextLine();
    System.out.print("암호? ");
    board.password = keyScanner.nextLine();
    
    boardDao.insert(board);
  }
  
  void list() {
    Board[] boards = boardDao.selectList();
    for (int i = 0; i < boards.length; i++) {
      System.out.printf("%d, %s, %s, %s, %s, %d\n",
          i,
          boards[i].title,
          boards[i].writer,
          boards[i].createdDate,
          boards[i].viewCount);
    }
  }
  
  static boolean prompt() {
    System.out.print("계속 입력하시겠습니까?(y/N) ");
    String answer = keyScanner.nextLine();
    if(answer.equals("n") || answer.equals("") || answer.equals("N"))
      return false;
    return true;
  }
  
  void datail() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());
    
    Board board = boardDao.selectOne(no);
    
    if (board == null) {
      System.out.println("해당 게시물이 없습니다.");
    }
    System.out.printf("제목: %s\n", board.title);
    System.out.printf("내용: %s\n", board.contents);
    System.out.printf("작성자: %s\n", board.writer);
    System.out.printf("등록일: %s\n", board.createdDate);
    System.out.printf("조회수: %s\n", board.viewCount);
  }
  
}