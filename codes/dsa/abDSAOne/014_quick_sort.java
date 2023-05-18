class Main {
 public static void main(String[] args) {
   int[] a = {4, 6, 2, 5, 7, 9, 1, 3};
   for (int i : quickSort(a, 0, a.length-1)) {
     System.out.print(i+" ");
   }
 } 

 // O(n^2)
 // O(n*logn) - Best case
 public static int[] quickSort(int[] a, int l, int h) {
   if (l<h) {
     int pivot = partition(a, l, h);
     quickSort(a, l, pivot-1);
     quickSort(a, pivot+1, h);
   }
   return a;
 }

 public static int partition(int[] a,int l,int h){
   int i=l, j=h;
   while (i<j){
     while (a[i] <= a[l]) i++;
     while (a[j] > a[l]) j--;

     if (i<j) {
       a[i] = a[i] ^ a[j];
       a[j] = a[i] ^ a[j];
       a[i] = a[i] ^ a[j];
     }
   }
   // Finally replacing small value(a[j]) and pivot(a[l])
   if (l != j) {
     a[j] = a[l] ^ a[j];
     a[l] = a[l] ^ a[j];
     a[j] = a[l] ^ a[j];
   }
   // If you see random 0's because of this swapping, 
   // or in general it is good practice to apply l!=j
   return j;
 }
}
