class Main {
  public static void main(String[] args) {
    int[] a = {9, 4, 7, 6, 3, 1, 5};
    for (int i : mergeSort(a, 0, a.length-1))
      System.out.print(i+" ");
  }

  // O(n*logn)
  public static int[] mergeSort(int[] a, int l, int h) {
    if (l<h) {
      int mid = (l+h)/2;
      mergeSort(a, l, mid);
      mergeSort(a, mid+1, h);
      merge(a, l, mid, h);
    }
    return a;
  }

  public static void merge(int[] a, int l, int mid, int h) {
    int i=l, j=mid+1, k=l;
    // k=l because for all array we want the beginning, and l is that beginning
    int[] b = new int[a.length];
    
    while (i<=mid && j<=h)
      if (a[i] < a[j]) b[k++] = a[i++];
      else b[k++] = a[j++];
    
    // Copying rest of the remaining array
    while (j<=h) b[k++] = a[j++];
    while(i<=mid) b[k++] = a[i++];
    
    // Copying b into a
    for (int t = l; t <= h; t++) a[t]=b[t];
  }  
}
