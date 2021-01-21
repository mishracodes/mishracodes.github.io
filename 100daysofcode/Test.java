/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Test
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        int[][] arr=new int[t][2];
        int i=0;
        while(i<t){
            sc.nextLine();
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
           
            i++;
        }
        int a=0,b=0;
        int aDiff=0,bDiff=0;
        for(int[] ab:arr){
            if(ab[0]>ab[1]){
                a++;
                b--;
                int diff=Math.abs(ab[0]-ab[1]);
                if(aDiff<diff)
                aDiff=diff;
            }
            else if(ab[0]<ab[1]){
                a--;
                b++;
                int diff=Math.abs(ab[0]-ab[1]);
                if(bDiff<diff)
                bDiff=diff;
            }
            
        }
        if(a>b)
        System.out.println(1+" "+aDiff);
        else
        System.out.println(2+" "+bDiff);

    }
}
