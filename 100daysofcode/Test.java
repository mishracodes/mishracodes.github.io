import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static void main (String[] args)
     {
         Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         sc.nextLine();
         while(t-->0){
             String str=sc.nextLine();
             int[] arr=new int[127];
             for(char ch:str.toCharArray()){
                 int index=(int)ch;
                 arr[index]++;
             }
             int sum=0;
             for(int i:arr){
                 sum+=i;
             }
             
             
             
             double sqrt=Math.sqrt(sum);   
             
             System.out.println((sqrt - Math.floor(sqrt)) == 0?1:0);
         }
         
     //code
     }
}