/* 주제: 다형성(polymorphism) - 다형적 변수와 형변환
 * 
 */
package step08.ex06;



public class Exam63_3 {
  public static void main(String[] args) {
    Motor r1 = new Car();


    r1.cc= 100;
    r1.maker = "비트자동차";
    
    //r1.capacity = 200; // 컴파일 오류!
    /* 이유?
     * 컴파일러는 레퍼런스 타입의 항목만 사용할 수 있다.
     * 실제 해당 인스턴스 변수가 존재한다 하더라도 접근 불가능!
     */
    //r1이 실제 Car 인스턴스를 가리키는데
    //Car의 모든 기능을 사용하는 방법은 없는가? 있다!
    Car c = (Car)r1; //원래의 타입으로 형변환하여 사용하라!
    c.capacity = 200;
    
    // 단 거짓말 하지 말라!
    Motor r2 = new Motor();
    r2.cc = 100;
    r2.maker = "비트자동차";
    
    // Car 인스턴스가 아닌데, 컴파일러를 속이기 위해 거짓말하기.
    Car c2 = (Car)r2;
    c2.capacity = 300; // 컴파일러는 속일 수 있을지 모르지만
                       // 어차피 실행할 때 해당 변수가 없기 때문에
                       // 실행 오류 발생한다. => 부질없는 짓!
  } 
}
/* 다형적 변수의 용도?
 * => 서븥 클래스의 인스턴스도 가리킬 수 있기 때문에
 * 특정 개체를 다른 개체로 교체하기가 쉽다.
 * => 예)
 * Motor m = new Motor();
 * m = new Car(); // 다른 서브 타입의 인스턴스를 가리킬 수 있다.
 * m = new SUV(); // 다른 서브 타입의 인스턴스를 가리킬 수 있다.
 * => 기능 교체가 쉽다.
 */
 
