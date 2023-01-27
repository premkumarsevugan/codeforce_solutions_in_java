import java.util.*;
public class Beautifulyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        String temp="";
        for(int i = y+1 ; i<9999;i++){
            temp=String.valueOf(i);
            if(temp.charAt(0) != temp.charAt(1) && temp.charAt(0) != temp.charAt(2) && temp.charAt(0) != temp.charAt(3) && temp.charAt(1) != temp.charAt(2) && temp.charAt(1) != temp.charAt(3) && temp.charAt(2) != temp.charAt(3)){
                break;
            }
        }
        System.out.println(temp);
        sc.close();
    }
}
