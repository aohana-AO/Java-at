import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;
public class at3 {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		for(;;){

			if(a>1000||a<1){
				 a= sc.nextInt();
			}else{
				break;
			}
		}
		int a = sc.nextInt();
		for(;;){

			if(a>1000||a<1){
				 a= sc.nextInt();
			}else{
				break;
			}
		}



		
		int N = sc.nextInt();
		for(;;){

			if(N>1000||N<1){
				N = sc.nextInt();
			}else{
				break;
			}
		}
		int[] a=new int[N];
		for(int i=0;i<N;i++){

			do {
				a[i] = sc.nextInt();
			} while (a[i]>1000000000||a[i]<1);
		}
		Set<String> linkedHashSet = new LinkedHashSet<String>();

		for (int i = 0; i < a.length; i++) {
			Integer x = Integer.valueOf(a[i]);
			String str = x.toString();
			linkedHashSet.add(str);
			}
			Object[] a_after = linkedHashSet.toArray();

			System.out.println(a_after.length);
		
	}
}
