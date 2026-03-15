/*
l. Given a sorted array of positive integers containing few duplicate 
elements, design an algorithm and implement it using a program to find 
whether the given key element is present in the array or not. If present, 
then also find the number of copies of given key. (Time Complexity = 
O(log n))
*/
import java.util.*;

public class I {
    static int st =-1;
    public static void startInBinarySearch(ArrayList<Integer> array,int key,int l,int r){
        int mid=l+(r-l)/2;
        if(l>r){
            return;
        }
        if (array.get(mid)==key) {
            st= mid;
            startInBinarySearch(array, key, l, mid-1);
        }
        else if(array.get(mid)>key){
            startInBinarySearch(array, key, l, mid-1);
        }
        else{
            startInBinarySearch(array, key, mid+1, r);
        }
    }
    static int en =-1;
    public static void endInBinarySearch(ArrayList<Integer> array,int key,int l,int r){
        int mid=l+(r-l)/2;
        if(l>r){
            return;
        }
        if (array.get(mid)==key) {
            en= mid;
            endInBinarySearch(array, key, mid+1, r);
        }
        else if(array.get(mid)<key){
            endInBinarySearch(array, key, mid+1, r);
        }
        else{
            endInBinarySearch(array, key, l, mid-1);
        }
    }
    public static void main(String args[]){
        int tc;
        Scanner sc= new Scanner(System.in);
        tc=sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int n;
            ArrayList<Integer> array=new ArrayList<>();
            n=sc.nextInt();
            for (int j = 0; j < n; j++) {
                array.add(sc.nextInt());
            }
            int key=sc.nextInt();
            startInBinarySearch(array, key, 0,n-1);
            endInBinarySearch(array, key, 0, n-1);
            if(st==-1){
                System.err.println("Not present");
            }
            else{
                System.out.println("Present  "+ (en-st+1));
            }
        }

    }
}
