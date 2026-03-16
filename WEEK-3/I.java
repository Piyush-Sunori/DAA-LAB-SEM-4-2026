/*
Given an unsorted array of integers, design an algorithm and a 
program to sort the array using insertion sort. Your program should be 
able to find number of comparisons and shifts ( shifts - total number of 
times the array elements are shifted from their place) required for 
sorting the array. 
*/
import java.util.*;

public class I {
    public static void insertionSort(ArrayList<Integer> array){
        int comp=0,shift=0;
        for (int i = 1; i < array.size(); i++) {
            int key=array.get(i);
            int j=i-1;
            while (j>=0 && array.get(j)>key) {
                comp++;
                array.set(j+1, array.get(j));
                shift++;
                j--;
            }
            array.set(j+1, key);
            shift++;
        }
        System.out.println(array + " "+ comp+" "+ shift);

    }
    public static void main(String[] args) {
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
            insertionSort(array);
        }
        sc.close();
    }
}
