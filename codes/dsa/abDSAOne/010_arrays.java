class Main{
	public static void main(String[] args){
		int[] arrayBM = {1, 1, 4, 6, 4, 1, 4, 4, 5, 4, 4};
		System.out.println(majorityElementBM(arrayBM));

		int[] arrayKadane = {-5, 4, 6, -3, 4, -1, 4};
		System.out.println(maximumSumSubarrayKadane(arrayKadane));

		int[] stockPriceI = {3, 1, 4, 8, 7, 2, 5};
		System.out.println(sbsSpaceI(stockPriceI));
		System.out.println(sbsConstSpaceI(stockPriceI));

		int[] stockPriceII = {5, 2, 6, 1, 4, 7, 3, 6};
		System.out.println(sbsIIMaxMin(stockPriceII));
		System.out.println(sbsIIMentos(stockPriceII));
	}
	// Stocks Buy & Sell - II
	/*
	   No limit on the number of times you (Buy & Sell).
	   You have to Sell after you buy.
	*/
	// Mentos method
	/*
	   If tomorrows price is greater than today's price, then take that difference and 
	   keep adding them to profit.
	   This won't give the timeline for when to buy and sell but will give the profit you can get at maximum.

	   5 2   6 1  4  7 3  6 
	   	  +4    +3 +3   +3
	
		Is similar to
	   5 2   6 1 4 7 3  6 
	   	  +4    +6   +3
	*/
	static int sbsIIMentos(int[] a){
		int profit=0;
		for (int i=0; i<a.length-1; i++){
			if (a[i]<a[i+1]) profit+=(a[i+1]-a[i]);
		}
		return profit;
	}
	// Buy stock at its local minima and sell at it's next local maxima
	static int sbsIIMaxMin(int[] a){
		int mProfit=0, lmin=-1, lmax=-1;
		for (int i=0; i<a.length; i++){
			// Finding the minima
			if (i == 0){
				if (a[i]<a[i+1]) lmin = a[i];
			} 
			// Can't select the last one as minima, then we won't be able to sell
			else if (i != a.length-1 && a[i]<a[i-1] && a[i]<a[i+1]) 
				lmin = a[i];

			// Finding the maxima
			if (lmin != -1) { // When the minima has been found already
				if (i == a.length -1) {
					if (a[i]>a[i-1]) lmax = a[i];
				}
				// Can't select the first one as minima, by then we wouldn't have bought it. 
				else if (i !=0 && a[i]>a[i-1] && a[i]>a[i+1]) lmax = a[i];
			}

			if (lmin != -1 && lmax != -1){
				System.out.println("Buy at "+lmin+" Sell at "+lmax);
				mProfit+=(lmax-lmin);
				lmax=-1; lmin=-1;
			}
		}
		return mProfit;
	}
	// Stocks Buy & Sell - I
	/*
	   When to Buy and Sell a stock in order to maximize profit given the daily stock price.
	   You have to first buy and then sell. And that too only once.

	   Obviously bruteforce is always a solution, O(N*N)
	*/
	// Using O(N), O(1) - Reverse approach as that from the method using space.
	static int sbsConstSpaceI(int[] a){
		int mProfit=0, min=a[0];
		for (int i:a){
			// if (i<min) min = i;
			min = Math.min(i, min); // The JAVA way
			int cProfit = i - min;
			// if (cProfit > mProfit) mProfit=cProfit;
			mProfit = Math.max(mProfit, cProfit); // The JAVA way
		}
		return mProfit;
	}
	// Using space - O(N), O(N) = (Space, Time)
	static int sbsSpaceI(int[] a){
		int mProfit=0;
		/*
		   This auxilliary_array contains the maximum value we can get from the index and ahead.
		*/
		int[] auxilliary_array = new int[a.length];
		for (int i=a.length-1, max=0; i>-1; i--){
			if(max<a[i]) max=a[i];
			auxilliary_array[i]=max;
		} // [8, 8, 8, 8, 7, 5, 5]
		for(int i=0; i<a.length; i++){
			if (auxilliary_array[i+1]<auxilliary_array[i]) break;
			int curr = auxilliary_array[i]-a[i];
			if (curr>mProfit) mProfit=curr;
		}
		return mProfit;
	}
	// Maximum Sum Subarray
	/*
		TODO: Bruteforce method - O(N*N)
			It is a method which finds every possible case, and then checks which is the desired answer from them.

		Kadane's Algorithm
	*/
	static int maximumSumSubarrayKadane(int[] a){
		int cSum=0, mSum=0;
		for (int i:a){
			cSum+=i;
			if (cSum>mSum) mSum=cSum;
			if (cSum<0) cSum=0;
		}
		return mSum;
	}
	// Mojority Element Poblem
	/*
		TODO: Try the Bruteforce method for this very same problem - O(N*N)
		TODO: Try the O(NlogN) approach
		TODO: Other methods didn't utilise the space much, so let's do it this time.
		   Whenever you are utilising space to get better run-time, it is going to be either of the following:
				- Hashmap
				- DP
		Results in Time: O(N), Space: O(N)

		Boyer-Moore's Majority Vote Algorithm
			To find such an element which is present more than 50% of the times as that of its size.
			O(N) without using extra space
	*/
	static int majorityElementBM(int[] a){
		int i_candi = a[0], i_count = 0;
		for (int i:a){
			if (i == i_candi) i_count++;
			else i_count--;

			if (i_count == 0){
				i_candi = i;
				i_count=1;
			}
		}

		// By now `i_candi` is the mode (occurs maximum number of times), but does it occur more than 50% of times to be Majority element?
		i_count=0;
		for (int i:a)
			if (i == i_candi)
				i_count++;

		if (i_count > a.length/2) return i_candi;
		else return -1;
	}
}
