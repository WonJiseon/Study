/* 주제: 다형성(polymorphism) - 다형적 변수
 * 
 */
package step08.ex06;



public class Exam64_1 {
  public static void main(String[] args) {
    B r = new B();
    
     r.m1();
     r.m2();
     
     r.m3();
  }
}

/*오버라이딩?
=> 상속받은 메소드를 "현재 클래스의 역할에 맞게" 재정의하는 것
*/