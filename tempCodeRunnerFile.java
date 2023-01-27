import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int en,ex,cc,mc;
        en=ex=cc=mc=0;
        for(int i=0;i<n;i++){
            ex=sc.nextInt();
            en=sc.nextInt();
            cc-=ex;
            cc+=en;

            if(cc>mc){
                mc=cc;
            }
        }
        System.out.println(mc);
        sc.close();
    }
}
