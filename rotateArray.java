import java.util.*;

public class rotateArray{
    static void swap(int [] arr, int i, int j){
        int temp =  arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static void reverse(int [] arr, int i, int j){
        
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void rotateInPlace(int [] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);

    }

    static int [] rotate(int [] arr, int k) {
        int n = arr.length;
        int j=0;
        int [] ans = new int [n];
        int pos = n - k;
        k = k % n;
        for(int i = 0; i < k; i++) {
            ans[i] = arr[pos];
            pos++;
        }

        for(int i= k; i < n; i++) {
            ans[i] = arr[j++];
        
        }
        return ans;
    }

    static void display(int [] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k;
        System.out.print("Enter the number of rotation: ");
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        // int [] ans = rotate(arr,k);
        // rotateInPlace(arr, k);
        System.out.print("Array after " + k + " rotation: ");
        // display(ans);
        rotateInPlace(arr, k);
        display(arr);
    }
}