public class main{

  public static void main (String ... args){
    int[] numberList = {1,0,0,0,0,0,0,0,0,0,0,0,0};
    System.out.print(numberList[0] + ", ");
    for (int i = 0; i < numberList.length - 1; i++) {
      if(i == 1) {
        numberList[1] = 1;
        System.out.print(numberList[1] + ", ");
      }
      else if (i > 1 && i < numberList.length - 2){
        numberList[i] = numberList[i - 1] + numberList[i - 2];
        System.out.print(numberList[i] + ", ");
      }

      if(i == numberList.length - 2){
        numberList[i] = numberList[i - 1] + numberList[i - 2];
        System.out.println(numberList[i]);
      }
    }
  }
}
