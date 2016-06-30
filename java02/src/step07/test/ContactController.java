
package step07.test;

import java.util.Scanner;

public class ContactController {
  static Scanner keyScanner;
  Contact[] contacts = new Contact[100];
  int i = 0;

  public void service() {
    while (true) {
      this.Contact();
      if(!(prompt()))
        break;
    }
    this.printAll();
  }

  void Contact() {
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
