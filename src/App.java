import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
  public static Integer findSecondSmallest(Integer[] arr){
    if(arr.length <=1){
    return null;
    }
    Arrays.sort(arr);
    return arr[1];


} 
  
public static Integer secondSmallest2(Integer[] arr){
  int smallest = Integer.MAX_VALUE;
  int secondSmallest = Integer.MAX_VALUE;
  for ( int i = 0 ; i < arr.length;i++){
    int current = arr[i];
    if (current< smallest){
      secondSmallest = smallest;
      smallest = current;
    }
    else if (current < secondSmallest && current != smallest){
      secondSmallest = current;
    }
   
  }
  return secondSmallest;
}
  public static void main(String[] args) {
    Integer[] arr = new Integer[] {1,2,3,4,5};
    System.out.println(findSecondSmallest(arr));
    Integer[] arr1 = new Integer[] { 123, 44, 567, 2356,124 };
    System.out.println(findSecondSmallest(arr1));
  }
}