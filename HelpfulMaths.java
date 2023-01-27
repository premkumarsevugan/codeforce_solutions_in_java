import java.util.*;

public class HelpfulMaths {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String arr[] = sc.next().split("[+]");
        int iarr[]= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            // System.out.println(s);
            iarr[i]=Integer.valueOf(arr[i]);

        }
        Arrays.sort(iarr);
        if(iarr.length<1){
            System.out.print(iarr[0]);
            return;
        }
        else{
            System.out.print(iarr[0]);
        }
        
        for(int i=1;i<iarr.length;i++){
            System.out.print("+" + iarr[i]);
        }
    }
}
