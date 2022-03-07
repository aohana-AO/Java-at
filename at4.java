import java.util.Scanner;

public class at4 {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for(;;){

			if(N>1000||N<1){
				N = sc.nextInt();
			}else{
				break;
			}
		}
		int M = sc.nextInt();
		for(;;){

			if(M>1000||M<1||M>N){
				M = sc.nextInt();
			}else{
				break;
			}
		}
		int[] a=new int[N];
		int[] b=new int[M];
		for(int i=0;i<N;i++){

			do {
				a[i] = sc.nextInt();
				
			} while (a[i]<1||a[i]>1000000000);
		}
		for(int i=0;i<M;i++){

			do {
				b[i] = sc.nextInt();
				
			} while (b[i]<1||b[i]>1000000000);
		}

        int v=0;

        for(int i=0;i<b.length;i++){
      v=0;
      for(int j=0;j<a.length;j++){
          if(b[i]==a[j]){
              a[j]=0;
              v=1;
              break;
          }
        
          
        }
        if(v==0){
          System.out.println("No");
        }
  }


        if(v==1){
			System.out.println("Yes");
		}
	
    }
}