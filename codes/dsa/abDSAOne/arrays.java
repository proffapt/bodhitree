class Main{
	public static void main(String[] args){
		int[] arrayBM = {1, 1, 4, 6, 4, 1, 4, 4, 5, 4, 4};
		System.out.println(majorityElementBM(arrayBM));

		int[] arrayKaden = {-5, -4, 3, 2, -4, 4, 5, -3, 4, -1};
		System.out.println(maximumSumSubarrayKaden(arrayKaden));
	}
	// Maximum Sum Subarray
	/*
		TODO: Bruteforce method - O(N*N)
			It is a method which finds every possible case, and then checks which is the desired answer from them.

		Kaden's Algorithm
	*/
	static int[] maximumSumSubarrayKaden(int[] a){
		int[] sub_a = new int[a.length];
		return sub_a;
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
