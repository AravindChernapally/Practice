package logical;

public class All {

	static public void secondLargestNumberInAnArray(int array[], int highestplaceValue) {
	      int temp, size;	      
	      size = array.length;
	      
	      if (size < 2)
	      {
	        System.out.printf(" Invalid Input ");
	        return;
	      }

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("Third second largest number is:: "+array[size-highestplaceValue]);
	   }
	
	static void swapWithoutThirdVaraible(int a, int b) {
		 a= a+b;
		 b= a-b;
		 a =a-b;
		 System.out.println(" a ="+a + ","+ "b="+b);
		
	}
		
}
