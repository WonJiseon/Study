package step08.ex06;

public class C extends B{
  public void  m1() {
    //오버라이딩: 상속 받은 메서드를 재정의한다.
    //=> 오버라이딩은 바로 위 클래스의 메소드를 재정의하는 것이 아니다.
    //   조상 중에 한 클래스에서 받아온 메소드를 재정의하는 것이다.
    System.out.println("C의 m1() 호출..."); 
  } public void  m2() {

    System.out.println("C의 m2() 호출..."); 
  }
  public void m4() {
    System.out.println("---------------------------------");
    //1) m1(), m2() 호출
    this.m1();
    this.m2();
    
    //2) 재정의하기 전의 m2() 호출하는 방법
    super.m2();
    super.m1();
    //3) 재정의하기 전,전의 m2() 호출하는 방법 ==> 없다!
    //super.super.m2(); //컴파일오류!
    
    //4) 부모 클래스 B가 재정의하기 전의 m3() 호출하는 방법 ==> 없다!
    //   => 오직 자기가 재정의한 메서드에 대해서만 적용할 수 있다.
    //   => 따라서 다음명령은 this.m3()와 같다.
    super.m3(); // A의 m3()? NO! B의 m3()이다. 자기가 재정의한 메서드가 아니다.
    
    System.out.println("---------------------------------");
  }
  
}