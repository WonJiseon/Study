
public class Test49 {
  public static void main(String[] args) throws Exception {
    int[] arr = {3, 6, 8, 4, 12, 1, 9, 7};
    int i= 0, temp;
    int end = arr.length - 1;

    while (end >= 1){
      i = 0;
      while (i < end) {
        if (arr[i] > arr[i + 1]) {
          temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
        }
        i++;
      }
      end--;
    }

    i = 0;
    while (i < arr.length) {
      System.out.print(arr[i] + " ");
      i++;
    }
    System.out.println();
  }
}
