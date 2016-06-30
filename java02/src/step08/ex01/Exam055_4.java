/* 주제: 상속 적용후
 * => 프로젝트: 헬스클럽 관리 시스템
 * => 사용자 정보에 전화번호와 키, 몸무게,가입일을 추가해야한다.
 * => 해결책? 
      기존 User 클래스를 복제하여 새 클래스를 만들기로 함
         
 */
package step08.ex01;

public class Exam055_4 {

  public static void main(String[] args) {
    Student2 u1 = new Student2();
    
    u1.name = "홍길동";
    u1.email = "hong@test.com";
    u1.password = "1111";
    u1.tel = "111-1111";
    u1.working = true;
    u1.company = "오호라주식회사";
    u1.position = "대리";
  }
}
