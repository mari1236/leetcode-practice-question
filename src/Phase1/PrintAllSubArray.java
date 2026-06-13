package Phase1;

public class PrintAllSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1,2,3,4};
		int len = numbers.length;
		
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				System.out.print("[");
				for(int k=i;k<=j;k++) {
					System.out.print(numbers[k]);
					if(k < j) System.out.print(",");
				}
				System.out.println("]");
			}
		}

	}

}
