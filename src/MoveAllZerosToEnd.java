import java.util.Arrays;

public class MoveAllZerosToEnd {
  public static void moveZerosToEnd(int[] arr){
    int count = 0;
    for(int i = 0 ; i < arr.length; i++){
      if (arr[i]!=0){
          arr[count] = arr[i];
          count ++;
      }
    }
    while (count < arr.length) {
      arr[count] = 0;
      count ++;
    }


  }
  
  public static void main(String[] args) {
    int[] arr = new int[]{1,1,0,1,0,1,0,1};
    moveZerosToEnd(arr);;
    System.out.println(Arrays.toString(arr));
  }
}
