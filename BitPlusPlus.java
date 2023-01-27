import java.util.*;

public class BitPlusPlus {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        String s="";
        sc.nextLine();
        for(int i=0;i<n;i++){
            s=sc.nextLine();
            if(s.contains("X++") || s.contains("++X")){
                x+=1;
            }
            if(s.contains("--X") || s.contains("X--")){
                x-=1;
            }
        }
        System.out.println(x);
        sc.close();
    }
}
