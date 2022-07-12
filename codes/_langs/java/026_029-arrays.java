class Main{
	public static void main(String[] args){
		// valid declarations of arrays
		byte testArray1[];	
		byte[] testArray2;
		byte[] testArray3=new byte[5];
		byte[] testArray4;
		testArray4=new byte[5];	
		byte[] testArray5={1, 2, 3, 4, 5};
		System.out.println(testArray5.length);

		// array traversal using naive method
		for(int i=0; i<testArray5.length;i++)
			System.out.print(testArray5[i]+", ");
		System.out.printf("\b\b \n");
		// this is the for each loop traversal of array
		for(int i: testArray5) // means for each i in marks
			System.out.print(i+", ");
		System.out.printf("\b\b \n");

		// Multi-dimensional arrays
		int[][] flats={{101, 102, 103},
					   {201, 202, 203}};	
		for(int i=0; i<flats.length; i++) {
			for(int j=0; j<flats[i].length; j++)
				System.out.print(flats[i][j]+", ");
			System.out.printf("\b\b \n");
		}
		int[][] matrix=new int[3][4];

		// reversing the array
		int[] arr={1, 2, 3, 4};
		// reversing the array
		for(int i=0; i<arr.length/2; i++){
				arr[i]=arr[i]+arr[arr.length-1-i];
				arr[arr.length-1-i]=arr[i]-arr[arr.length-1-i];
				arr[i]=arr[i]-arr[arr.length-1-i];
		}
		// printing the array
		for(int i:arr)
			System.out.print(i+" ");
	}
}
