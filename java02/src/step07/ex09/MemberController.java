
package step07.ex09;

import java.util.*;

public class MemberController {
  static Scanner keyScanner;
  MemberDao memberDao = new MemberDao();
  String memberName;

  public MemberController() {}

  public MemberController(String memberName) {
    this.memberName = memberName;
  }

  public  void service() {
    String command;

    label1: while (true) {
      System.out.printf("메인/%s> ", memberName);
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

  void list() {
    Member[] members = memberDao.selectList();
    for (int i = 0; i < members.length; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          i, 
          members[i].name, 
          members[i].email,
          members[i].password, 
          members[i].signedUpDate);
    }
  }

  static boolean prompt() {
    System.out.print("계속 입력하시겠습니까?(y/N) ");
    String answer = keyScanner.nextLine();
    if(answer.equals("n") || answer.equals("") || answer.equals("N"))
      return false;
    return true;
  }

  void add() {
    Member member = new Member();
    System.out.print("이름? ");
    member.name = keyScanner.nextLine();
    System.out.print("이메일? ");
    member.email = keyScanner.nextLine();
    System.out.print("암호? ");
    member.password = keyScanner.nextLine();
    System.out.print("가입일? ");
    member.signedUpDate = keyScanner.nextLine();
    memberDao.insert(member);
  }
  
  void detail() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());
    
    Member member = memberDao.selectOne(no);
    if (member == null) {
      System.out.println("해당 회원 정보가 없습니다.");
      return;
    }
    System.out.printf("이름: %s\n", member.name);
    System.out.printf("이메일: %s\n", member.email);
    System.out.printf("가입일: %s\n", member.signedUpDate);
  }
  
  void update() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());
    
    Member originMember = memberDao.selectOne(no);
    if (originMember == null) {
      System.out.println("해당 회원 정보가 없습니다.");
      return;
    }
    
    Member newMember = memberDao.selectOne(no);
    System.out.printf("이름(%s)?", originMember.name);
    newMember.name = keyScanner.nextLine();
    System.out.printf("이메일(%s)? ", originMember.email);
    newMember.email = keyScanner.nextLine();
    System.out.printf("암호(****)? ");
    newMember.password = keyScanner.nextLine();
    
    System.out.print("변경하시겠습니까?(Y/n) ");
    String answer = keyScanner.nextLine();
    if (answer.equals("y") || answer.equals("") || answer.equals("Y")) {
      memberDao.update(no, newMember);
      System.out.println("변경하였습니다");
    } else {
      System.out.println("변경 취소하였습니다.");
    }
  }

  void delete() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());

    System.out.print("삭제하시겠습니까?(Y/n) ");
    String answer = keyScanner.nextLine();
    if (answer.equals("y") || answer.equals("") || answer.equals("Y")) {
      int count = memberDao.delete(no);
      if (count > 0) {
        System.out.println("삭제하였습니다");
    } else {
      System.out.println("해당 게시물이 없습니다.");
    }
  } else {
      System.out.println("삭제 취소하였습니다.");
    }
  }
}



/*
 */