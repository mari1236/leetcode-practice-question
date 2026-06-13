package Phase1;

public class SumofEachSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {10, 20, 30, 40};
		int len = array.length;
		
		
		for(int i=0;i<len;i++) {
			
			for(int j=i;j<len;j++) {
				int sum=0;
				
				for(int k=i;k<=j;k++) {
					sum = sum + array[k];
					
				}
				System.out.println("Sum: " +sum);
			}
		}

	}

}
