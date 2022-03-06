import java.util.Scanner;
public class at {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		for(;;){

			if(a<=1000||a>=1){
				break;
			}else{
				
				a = sc.nextInt();
			}
		}
		int b = sc.nextInt();
		for(;;){

			if(b<=1000||b>=1){
				break;
			}else{
				
				b = sc.nextInt();
			}
		}
		int c = sc.nextInt();
		for(;;){

			if(c<=b-a||c>=1){
				break;
			}else{
				
				c = sc.nextInt();
			}
		}
		int x = sc.nextInt();
		for(;;){

			if(x<=1000||x>=1){
				break;
			}else{
				
				x = sc.nextInt();
			}
		}

		if(x<=a){

			System.out.println("1.000000000000");
		}else if(x>b){
			System.out.println("0.000000000000");
		}else{
			
			System.out.println((double)c/(b-a));
		}
		
	
		
	}
}
