import java.util.*;
public class Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String lower=s.toLowerCase();
        String upper=s.toUpperCase();
        int l=0,u=0;
        for(int i=0;i<s.length();i++){
            if(s.toCharArray()[i] == lower.toCharArray()[i]){
                l+=1;
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.toCharArray()[i] == upper.toCharArray()[i]){
                u+=1;
            }
        }
        if(l>=u){
            System.out.println(s.toLowerCase());
        }
        else{
            System.out.println(s.toUpperCase());
        }
        sc.close();
    }
}
