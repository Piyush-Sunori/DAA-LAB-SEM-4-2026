    /*
Given an array of nonnegative integers, design an algorithm and 
a program to count the number of pairs of integers such that their 
difference is equal to a given key, K. 
*/

import java.util.*;
public class III {
    public static int findDiff(ArrayList<Integer> array,int key){
        int pair=0;
        for(int i=0;i<array.size();i++){
            for (int j=i+1;j<array.size();j++){
                if(array.get(i)-array.get(j)==key || array.get(j)-array.get(i)==key) pair++;
            }
        }
        return pair;

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
            int key=sc.nextInt();
            int pair=findDiff(array, key);
            if(pair==0){
               System.out.println("Not Found"); 
            }
            else{
                System.out.println(pair);
            }
        }
	}
}
