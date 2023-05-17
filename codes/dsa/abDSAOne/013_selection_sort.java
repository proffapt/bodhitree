class Main {
  public static void main(String[] args) {
    int[] a = {4, 1, 9, 2, 3, 6};
    for (int i : selectionSort(a)) {
      System.out.print(i+" ");
    }
  }
  
  // Here the sorted array is of lenght 0 initially, we build it from the unsorted array
  // by inserting the minimum element as key from the unsorted array to sorted array.
  // O(n^2)
  public static int[] selectionSort(int[] a){
    int n = a.length, k;
    for (int i = 0; i <= n-1; i++) {
      k = i;
      for (int j = i+1; j <= n-1; j++) {
        if (a[k] > a[j]) {
          k = j;
        }
      }

      // Change only when minimum is not the first element in the sorted array
      if (k != i) {
        a[i] = a[k] ^ a[i];
        a[k] = a[k] ^ a[i];
        a[i] = a[k] ^ a[i];
      }
    }
    return a;
  }
}
