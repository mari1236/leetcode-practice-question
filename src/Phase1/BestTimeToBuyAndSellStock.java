package Phase1;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] prices = {7,1,5,3,6,4};
		int minPrices = prices[0];
		int maxProfit = 0;
		
		for(int i=1;i<prices.length;i++) {
			
			if(prices[i] < minPrices) {
				minPrices = prices[i];
			}
			
			int profitToday = prices[i] - minPrices;
			
			if(maxProfit < profitToday) {
				maxProfit = profitToday;
			}
		}
		System.out.println("profit today"+maxProfit);
	}

}
