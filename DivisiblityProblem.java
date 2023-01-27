import java.util.Scanner;

class DivisiblityProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

while(t!=0){
	t--;
	int x=sc.nextInt();
    int y=sc.nextInt();
	
	if(x%y==0) 
	{
	System.out.println(0);
	}
	else {
	
	int w=x%y;
	
	System.out.println(y-w);;
	
	}
}
    }
}