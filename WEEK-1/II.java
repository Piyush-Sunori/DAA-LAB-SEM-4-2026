/*Given an already sorted array of positive integers, design an 
algorithm and implement it using a program to find whether given key 
element is present in the array or not. Also, find total number of 
comparisons for each input case. (Time Complexity = O(nlogn), where 
n is the size of input). */
import java.util.*;
public class II {
    static int cmp=0;
    
    public static int binarySearch(ArrayList<Integer> array,int key,int l,int r){
        int mid=l+(r-l)/2;
        if(l>r){
            return -1;
        }
        cmp++;
        if(key==array.get(mid)) return cmp;
        else if (key<array.get(mid)) {
             return binarySearch(array, key, l, mid-1);
        }
        else{
            return binarySearch(array, key, mid+1, r);
        }
    }
    public static void main(String[] args) {
        int tc;
        Scanner sc= new Scanner(System.in);
        tc=sc.nextInt();
        for (int i = 0; i < tc; i++) {
            cmp=0;
            int n;
            ArrayList<Integer> array=new ArrayList<>();
            n=sc.nextInt();
            for (int j = 0; j < n; j++) {
                array.add(sc.nextInt());
            }
            int key=sc.nextInt();
            
            if(binarySearch(array, key, 0, n-1)==-1){
                System.out.println("NotPresent "+cmp);
            }else{
                System.out.println("Present "+cmp);
            }
        }
    }
}
