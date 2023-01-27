import java.util.LinkedHashSet;
import java.util.Scanner;

public class HorseShoes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>(4);
        for(int i=0;i<4;i++){
            lh.add(sc.nextInt());
        }
        System.out.println(4-lh.size());
        
    }
}
