/* 주제: 상속 적용 후
 * => 프로젝트: 블로그 만들기
 * => 사용자의 이름과 이메일, 암호만 필요하다.
 */
package step08.ex02;

public class Exam056_4 {

  public static void main(String[] args) {
    Student2 u1 = new Student2();

    u1.name = "홍길동";
    u1.email = "hong@test.com";
    u1.password = "1111";
    u1.tel = "111-1111";
    u1.company = "오호라주식회사";
    u1.position = "대리";
  }
}