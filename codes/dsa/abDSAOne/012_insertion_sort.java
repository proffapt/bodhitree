// Logic samajh lo,
// Code karne ke liye koi bhi ek case pakad lo aur usse 
// solve kardo
class Main {
  public static void main(String[] args) {
    int[] a = {8, 4, 1, 5, 9, 2};
    for (int i : insertionSort(a)) {
      System.out.print(i+" ");
    }
  }

  // O(n^2)
  // Less comparisons from bubble sort
  // A bit optimised than bubble sort
  public static int[] insertionSort(int[] a){
    int n = a.length;
    // We insert the element from unsorted array into sorted array that is why index starts from 1
    // The key keeps on moving left, until it finds it's position
    for (int i = 1; i <= n-1; i++) {
      int key = a[i];
      for (int j = i-1; j >= 0; j--) {
        if (key < a[j]) {
          a[j+1] = a[j];
          a[j] = key;
        } else {
          break;
        }
      }
    }
    return a;
  }
}
