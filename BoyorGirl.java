import java.util.Scanner;

public class BoyorGirl {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=0;
        String s=sc.next();
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<s.length();i++){
            if(!sb.toString().contains(String.valueOf(s.charAt(i)))){
                count+=1;
                sb.append(String.valueOf(s.charAt(i)));
            }
        }
        // System.out.println(count + " "+ sb.toString());
        if(count%2==0){
            System.out.println("CHAT WITH HER!");

        }
        else{
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}
