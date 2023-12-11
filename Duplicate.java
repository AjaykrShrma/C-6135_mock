public class Duplicate {
    public static int removeDupElmnt(int[] arr, int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        // Changing original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main (String[] args) {
        int arr[] = {10,20,20,3,3,40,50,50,68};
        int n = arr.length;
        System.out.println("Before removing any element");
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println(" ");
        n = removeDupElmnt(arr, n);
        //printing array elements
        System.out.println("After removing  duplicate element");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}
/*
Before removing any element
10 20 20 3 3 40 50 50 68  
After removing  duplicate element
10 20 3 40 50 68 
*/
