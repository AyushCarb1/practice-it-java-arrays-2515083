import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray {
  public static Object[] rotateRight(Object[] arr){
    Object[] result = new Object[arr.length];
    for(int i =0 ; i< arr.length;i++){
      result[(i+1)%arr.length] = arr[i];
      // System.out.println(arr[i]);
    }
      return result;
  }

  public static void main(String[] args) {
    Object[] arr = new Integer[] {1,2,3,4,5};
    for(int i = 0 ; i < arr.length;i++){
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    }
  } 
}
