class Main{
	/*
		3 steps to recursion
			- Find the relation between ultimate problem and the
			sub-problem just before it. This relation is known as the `recursive relation`.
			- Generalize the relation.
			- Then write the base case.
	*/
	public static void main(String[] args){
		System.out.println(jProblem(5, 3));
	}

	// Josephus Problem
	static int jProblem(int n, int k){
		if (n==1){
			return 0; // Indexing starts from 0
		}
		return (jProblem(n-1, k) + k) % n;
	}
	// Number of paths to reach from one end to other end in a nxm matrix
	static int waysInNMmatrix(int n, int m){
		if (n==1 || m==1){
			return 1;
		}
		return waysInNMmatrix(n-1, m) + waysInNMmatrix(n, m-1);
	}
	static int rpow(int a, int b){
		if (b==0){
			return 1;
		}
		return a * rpow(a, b-1);
	}
	static int nsum(int n){
		// Base condition
		if (n==1){
			return 1;
		}
		return n + nsum(n-1); // Recursive relation
	}
}
