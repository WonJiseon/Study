
public class Test48 {
  public static void main(String[] args) throws Exception {
    //int[] arr = {3, 6, 8, 4, 12, 1, 9, 7};
    int i = 1, j = 1;
    int sum = 0;
    
    while (i <= 100) {
        sum += i;
        i += j;
        j++;
    }
    System.out.println(sum);
  }
}