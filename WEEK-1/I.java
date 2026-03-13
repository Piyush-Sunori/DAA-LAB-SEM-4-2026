/*l. 
Given an array of nonnegative integers, design a linear algorithm 
and implement it using a program to find whether given key element is 
present in the array or not. Also, find total number of comparisons for 
each input case. (Time Complexity = O(n), where n is the size of input) 
Sample 1/0O Problem - 1: 
Input:                                      Output: 
3 
8                                           
34 35 65 31 25 89 64 30 
89                                          Present 6 
5
977 354 244 546 355 
244                                         Present 3 
6 
2364 13 67 43 56 
63                                          NotPresent 6 
*/
import java.util.*;
public class I{
    public static int linearSearch(ArrayList<Integer> array,int key){
        int ctr=0;
        for(int i:array){
            ctr++;
            if(i==key){
                return ctr;
            }
        }
        return -1;
    }
    public static void main(String[] args){
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
            int key=sc.nextInt();
            cmp=linearSearch(array, key);
            if(cmp==-1){
                System.out.println("NotPresent "+n);
            }else{
                System.out.println("Present "+cmp);
            }
        }
    }
}