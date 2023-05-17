class Main {
  public static void main(String[] args) {
    int[] a={4, 3, 7, 1, 5};
    for (int i: bubbleSort(a))
      System.out.print(i+" ");
    
    System.out.println();
    for (int i: adaptiveBubbleSort(a))
      System.out.print(i+" ");
  }

  // O(n^2)
  public static int[] bubbleSort(int[] a){
    for(int i=0; i<=a.length-2; i++){
      for(int j=0; j<=a.length-2-i; j++){
        if (a[j]>a[j+1]){
          a[j] = a[j]^a[j+1];
          a[j+1] = a[j]^a[j+1];
          a[j] = a[j]^a[j+1];
        }
      }
    }
    return a;
  }

  // Will stop whenever there is no swapping in a pass
  // Is applicable to in between pass also
  public static int[] adaptiveBubbleSort(int[] a){
    for(int i=0; i<=a.length-2; i++){
      boolean sorted = true;
      for(int j=0; j<=a.length-2-i; j++){
        if (a[j]>a[j+1]){
          sorted = false;
          a[j] = a[j]^a[j+1];
          a[j+1] = a[j]^a[j+1];
          a[j] = a[j]^a[j+1];
        }
      }
      if (sorted) break;
    }
    return a;
  }
}
