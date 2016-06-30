

public class Test46 {
  public static void main(String[] args) throws Exception {
    int num = Integer.parseInt(args[0]);
    int evenCount = 0, oddCount = 0;
    
    while (num > 0) {
      if (num % 2 == 0) 
        evenCount++;
      else
        oddCount++;
      num /= 10;
    }
    System.out.println("짝수: " + evenCount);
    System.out.println("홀수: " + oddCount);
  }
}
