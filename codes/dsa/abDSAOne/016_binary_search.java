// Binary search is used when:
//   - Array is sorted
//   - Allocation needs to be done in continuous fasion

class Main {
  public static void main(String[] args) {
    // Binary Search
    int[] a = {-4, -1, 3, 7, 10, 11};
    System.out.println(binarySearch(a, 7));
    System.out.println(binarySearch(a, -9));
    
    // Q1 - Searching an element in infinite array (length is unknown)
    int[] c = {2, 4, 5, 6, 7, 23, 55, 66, 77, 78, 79, 91, 110, 222, 444, 556, 789, 999};
    System.out.println(qONE(c, 789));

    // Q2 - Searching an element in sorted & rotated array
    int[] b={50, 60, 70, 80, 90, 20, 30};
    System.out.println(qTWO(b, 30));
    System.out.println(qTWO(b, 50));
    System.out.println(qTWO(b, 9));

    // Q3 - index value = number of pages in the book 
    int[] c = {10, 10, 20, 30};
    // k = number of students
    int k = 2;
    System.out.println(qTHREE(d, k));
  }

  // Q3 - Allocate minimum Pages
  // Minimise the maximum number of pages read by a student
  // Consraints
  // 1. Allocation should be in continuous fashion
  // 2. Individual book can't be broken further
  // Bruteforce Method - O(2^n)
  // This method - O(n*logn)
  public static int qTHREE(int[] a, int k) {
    
  }

  // Searching an element in sorted & rotated array
  // O(logn)
  public static int qTWO(int[] a, int key) {
    int l=0, h=a.length-1;
    while (l<=h) {
      int mid = (l+h)/2;

      if (a[mid] == key)
        return l;
      else if (a[mid] > a[l])
        if (a[l]<=key && a[mid]>key)
          h = mid-1;
        else
          l = mid+1;
      else  // if left is not sorted then right is for sure
        if (a[h]>=key && a[mid]<key)
          l = mid+1;
        else
          h = mid-1;
    }
    return -1;
  }

  // Searching an element in infinite array (length is unknown)
  public static int qONE(int[] a, int key) {
    int l=0, h=1;
    
    while (a[h] < key) {
      l = h;
      h *= 2;
      
    }
    
    if (a[h] == key)
      return h;
    else {
      while (l <= h) {
        int mid = (l+h)/2;
        
        if (a[mid] == key)
          return l;
        else if (a[mid] < key)
          l = mid+1;
        else 
          h = mid-1;
      }
    }
    return -1;
  }

  // Searching in sorted array - Binary Search
  // HUUUUUUUUUUGE optimisation
  // Iterative > Recursive
  // Always, because recursion uses auxilliary space
  // Recursive is slower than Iterative.
  // O(Log2(n))
  public static int binarySearch(int[] a, int key) {
    int l=0, h=a.length-1;
    while (l <= h) {
      int mid = (l+h)/2;
      
      if (a[mid] == key)
        return l;
      else if (a[mid] < key)
        l = mid+1;
      else 
        h = mid-1;
    }
    return -1;
  }
}
