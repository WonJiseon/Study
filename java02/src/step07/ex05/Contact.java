/* 역할: 값 객체(VO; Value Object)
 * 
 */
package step07.ex05;

public class Contact {
  String name;
  String phoneNum;
  String email;
  String company;
  String position;

  public Contact() {
    this.name = "홍길동";
    this.phoneNum = "010-2222-3333";
    this.email = "hong@test.com";
    this.company = "비트캠프";
    this.position = "사원";
  }
}
