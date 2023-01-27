import java.util.*;
public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int minValue=1000;
        int minIndex=0,maxIndex=0,maxValue=0;

        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            if(temp>maxValue){
                maxValue=temp;
                maxIndex=i;
            }
            if(temp<=minValue){
                minValue=temp;
                minIndex=i;
            }
        }
        if(maxIndex>minIndex){
            System.out.println((maxIndex-1)+(n-minIndex)-1);

        }
        else{
            System.out.println((maxIndex-1)+(n-minIndex));

        }
    }
}
