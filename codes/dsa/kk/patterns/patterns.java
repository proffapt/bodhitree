class Main{
	public static void main(String[] args){
		pattern31(3);
	}
	static void pattern31(int n){
		for(int i=0; i<=2*n; i++){
			for(int j=0; j<=2*n; j++){
				// Minimum distance of the cell from the boundaries
				int data = Math.max(Math.max(i-n, j-n), Math.max(n-i, n-j))+1;
				System.out.print(data+" ");
			}
			System.out.println();
		}
	}
	static void pattern17(int n){
		for(int i=1; i<=2*n-1; i++){
			int spaces = i<n ? n-i : i-n;
			for(int j=1; j<=spaces; j++){
				System.out.print(" ");
			}
			int col = i<=n ? 2*i-1 : 2*(2*n-i)-1;
			for(int j=1; j<=col; j++){
				int data = i<=n ? (i>j ? i-j+1 : j-i+1) : i-2*(i-n)>j ? i-2*(i-n)-j+1 : j-i+1+2*(i-n);
				System.out.print(data);
			}
			System.out.println();
		}
	}
	static void pattern30(int n){
		for(int i=1; i<=n; i++){
			int spaces = n - i;
			for(int j=1; j<=spaces; j++){
				System.out.print(" ");
			}
			int col = 2*i-1;
			for(int j=1; j<=col; j++){
				int data = i>=j ? i-j+1 : j-i+1;
				System.out.print(data);
			}
			System.out.println();
		}
	}
	static void pattern28(int n){
		for(int i=1; i<=2*n-1; i++){
			int spaces = i<n ? n-i: i-n;
			for(int j=1; j<=spaces; j++){
				System.out.print(" ");
			}
			int col = i<n ? i : 2*n-i;
			for(int j=1; j<=col; j++){
				System.out.print("* ");
			}
			System.out.printf("\b \n");
		}
	}
	static void pattern5(int n){
		System.out.println("Pattern 5");
		for(int i=1; i<=2*n-1; i++){
			int col = i < n ? i : 2*n-i;
			for(int j=1; j<=col; j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
	static void pattern4(int n){
		System.out.println("Pattern 4");
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	static void pattern3(int n){
		System.out.println("Pattern 3");
		for(int i=1; i<=n; i++){
			for(int j=n; j>=i; j--){
				System.out.print('*');
			}
			System.out.println();
		}
	}
	static void pattern2(int n){
		System.out.println("Pattern 2");
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
	static void pattern1(int n){
		System.out.println("Pattern 1");
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
