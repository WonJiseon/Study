/* 역할: 연락처 관리(등록Create/조회Read,Retrieve/변경Update/삭제Delete);CRUD
 => 예)
 [메인 > 연락처]
이름? 홍길동
전화? 010-2222-3333
이메일? hong@test.com
회사? 비트캠프
직위? 대리
계속 입력하시겠습니까?(y/n) y
이름? 임꺽정
전화? 010-2222-3334
이메일? leem@test.com
회사? 비트캠프
직위? 사원
계속 입력하시겠습니까?(y/n) n
[메인 > 연락처]
홍길동, 010-2222-3333, 비트캠프, 대리
임꺽정, 010-2222-3334, 비트캠프, 사원
 */
package step07.ex07;

import java.util.Scanner;

public class ContactController {
  static Scanner keyScanner;
  Contact[] contacts = new Contact[100];
  int i = 0;
  String contactName;
  public ContactController() {}

  public ContactController(String contactName) {
    this.contactName = contactName;
  }
  public void service() {
    while (true) {
      this.input();
      if(!(prompt()))
        break;
    }
    System.out.println("[메인 > 연락처]");
    this.printAll();
  }
  void input() {
    System.out.println("[메인 > 연락처]");
    Contact contact = new Contact();
    System.out.print("이름? ");
    contact.name = keyScanner.nextLine();
    System.out.print("전화? ");
    contact.phoneNum = keyScanner.nextLine();
    System.out.print("이메일? ");
    contact.email = keyScanner.nextLine();
    System.out.print("직위? ");
    contact.position = keyScanner.nextLine();
    this.contacts[this.i++] = contact;
  }
  static boolean prompt() {
    System.out.print("계속 입력하시겠습니까?(y/n) ");
    String answer = keyScanner.nextLine();
    if(answer.equals("n"))
      return false;
    return true;
  }
  void printAll() {
    for (int x = 0; x < this.i; x++) {
      System.out.printf("%s, %s, %s, %s, %s\n",
          this.contacts[x].name, this.contacts[x].phoneNum, this.contacts[x].email,
          this.contacts[x].company, this.contacts[x].position);
    }
  }
}

/*

 */