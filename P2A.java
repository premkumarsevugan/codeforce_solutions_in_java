import java.util.*;

public class P2A {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedHashMap<String,Integer> lh=new LinkedHashMap<String,Integer>();
        for(int i=0;i<n;i++){
            String ts=sc.next();
            int ti=sc.nextInt();
            lh.put(ts,ti);
        }
        // System.out.println(lh);
        int max=0;
        String res="";

        for(Map.Entry<String,Integer> me : lh.entrySet()){
            if(me.getValue()>max){
                max=me.getValue();
                res=me.getKey();
            }
        }
        System.out.println(res);
    }
}
