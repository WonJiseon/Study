package step08.ex05;

public class Motor {
  int cc;
  String maker;
  
  {
    System.out.println("Motor 인스턴스 블록...");
  }
  
  public Motor() {
    //1) super(); //<= 수퍼 클래스의 기본 생성자를 호출하는 명령이 숨겨져 있다.
    //2) 현재 클래스의 인스턴스 블록 호출
    //3) 생성자 코드 실행
    System.out.println("Motor() 생성자 호출됨");

  }
}