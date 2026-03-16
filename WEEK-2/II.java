/*
Given a sorted array of positive integers, design an algorithm 
and implement it using a program to find three indices i, j, k such that 
arrli] + arr[j] = arr[k]. 
Input format: 
The first line contains number of test cases, T. For each test case, 
there will be two input lines. First line contains n (the size of array). 
Second line contains space-separated integers describing array. 
Output: 
The output will have T number of lines. 
For each test case T, print the value of i, j and k, if found else print "No 
sequence found". 
*/
import java.util.*;
public class II {
    public static boolean findSequence(ArrayList<Integer> array){
        boolean found=false;
        for(int k=array.size()-1;k>=2;k--){
            int i=0,j=k-1;
            while (i<j) {
                if(array.get(i)+array.get(j)<array.get(k)){
                    i++;
                }
                else if(array.get(i)+array.get(j)>array.get(k)){
                    j--;
                }
                else{
                    System.out.println((i+1)+" , "+(j+1)+" , "+(k+1));
                    found = true;
                    break;
                }
            }
        }
        return found;
    }
    public static void main(String[] args) {
        int tc;
        Scanner sc= new Scanner(System.in);
        tc=sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int cmp,n;
            ArrayList<Integer> array=new ArrayList<>();
            n=sc.nextInt();
            for (int j = 0; j < n; j++) {
                array.add(sc.nextInt());
            }
            if(!findSequence(array)) System.out.println("No Sequence Found");
        }
    }
}
