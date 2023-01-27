import java.util.*;

public class BeautifulMatrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[][] = new int[5][5];
        int r=0,c=0,a=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                a=sc.nextInt();
                if(a==1){
                    r=i;
                    c=j;
                }
            }
        }
        System.out.print(Math.abs(2-r)+Math.abs(2-c));
        sc.close();
    }
}
