public class Triangle {
  

  public static void printTriangle(Object arrObject[]){
    for (int i=0 ; i < arrObject.length;i ++){
      for (int j = 0; j<i;j++){
        System.out.print(arrObject[j]);
      }
      System.out.println();
    }
   
  }
  public static void main(String args[]){
    printTriangle(new Integer[] {1,2,3,4});
  }
}
