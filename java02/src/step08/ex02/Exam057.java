/* 주제: 상속 적용 후
 * => 프로젝트: 블로그 만들기
 * => 사용자의 이름과 이메일, 암호만 필요하다.
 */
package step08.ex02;

public class Exam057 {

  public static void main(String[] args) {
    // 스태틱 변수와 인스턴스 변수는 0으로 자동 초기화 된다.
    System.out.printf("A.var1 = %d\n", A.var1);
    System.out.printf("B.var3 = %d\n", B.var3);
    System.out.println("----------------------");
    
    B.m();
    System.out.printf("A.var1 = %d\n", A.var1);
    System.out.printf("B.var3 = %d\n", B.var3);
  }
}
