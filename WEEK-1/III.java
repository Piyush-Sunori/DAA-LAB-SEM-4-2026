/*Given an already sorted array of positive integers, design an 
algorithm and implement it using a program to find whether a given key 
element is present in the sorted array or not. For an array arr[n], search 
at the indexes arr[0], arr[2], arr[4],. ,arr[2k] and so on. Once the interval 
(arr[2k] < 
key < arr[ 2k+1] ) is found, perform a linear search operation from the 
index 2k to find the element key. (Complexity < O(n), where n is the 
number of elements need to be scanned for searching): Jump Search */
import java.util.*;
import java.lang.Math;
public class III {
    public static int cmp=0;
    public static int linearSearch(ArrayList<Integer> array,int key,int st,int en){
        for(int i=st;i<=en;i++){
            cmp++;
            if(array.get(i)==key){
                return i;
            }
        }
        return -1;
    }
    public static int jumpSearch(ArrayList <Integer> array,int key,int curr,int next){
        if (curr>array.size()) {
            return -1;
        }
        cmp++;
        if(array.get(Math.min(next, array.size())-1)>=key){
            return linearSearch(array, key, curr, next);
        }
        else{
            if(next>=array.size()) return -1;
            return jumpSearch(array, key, next, next+2);
        }
    }
    public static void main(String args[]){
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
            
            if(jumpSearch(array, key, 0, 2)==-1){
                System.out.println("NotPresent "+cmp);
            }else{
                System.out.println("Present "+cmp);
            }
        }
    }   
}
