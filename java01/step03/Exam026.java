//주제: 같은 종류의 메모리를 여러 개 다루는 방법 - 배열을 가리키는 변수 선언

public class Exam026 {
  public static void main(String[] args) {
    // 방법1: C/C++ 언어에서도 사용하는 방법
    int scores[];

    // 방법2: 자바에서 주로 사용하는 방법
    int[] scores2;

    // 주의!
    // => 배열을 가리키는 변수는 메모리를 만드는 것이 아니다.
    //    그래서 그냥 사용할 수 없다.
    // => 배열 메모리를 별도로 준비한 후 그 메모리를 가켜야만
    //    변수를 사용할 수 있다.

    //scores2[1] = 20; // 컴파일 오류!

  }
}

/*






*/
