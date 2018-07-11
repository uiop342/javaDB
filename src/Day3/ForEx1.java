package Day3;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class ForEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * 
		 * */
		for(int i = 1; i<=5; i++){
			for(int j=1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		/* 
		 * *        i=1
		 * **		i=2
		 * ***		i=3
		 * ****		i=4
		 * *****	i=5
		 * 
		 * */
		
		for (int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1;i<=5;i++){
			for (int j=1;j<=5;j++){
			 if(j<=5-i)
				 System.out.print(" ");
			 else
				 System.out.print("*");
			}
			
			System.out.println();
		}
		/* 
		 *      *
		 *     ** *
		 *    *** **
		 *   **** ***
		 *  ***** ****
		 * */
		for (int i=1;i<=5;i++){
			for (int j=1;j<=5;j++){
			 if(j<=5-i)
				 System.out.print(" ");
			 else
				 System.out.print("*");
			}
			for (int j=1;j<=i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*  *********
		 *   *******
		 *    *****
		 *     ***
		 *      *
		 * */
		System.out.println("______________________________________");
		for (int i=1;i<=5;i++){
			for(int j=1;j<=i-1;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*5+1-2*i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=1;i<=5;i++){
			for(int j=1;j<=2*5-i;j++){
				if(j<=i-1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		for (int i=2;i<=9;i++){
			System.out.println(i+"단 입니다.");
			for(int o=1;o<=9;o++){
				System.out.println(i+" x "+o+" = "+i*o);
			}
		}
		/* 2부터 100까지의 모든 소수*/
		int cnt=0;
		int num=100;
		for(num=2;num<=100;num++){
			cnt=0;
		for (int i=1;i<=num;i++){
			if(num%i==0){
				cnt++;
			}
		}
		if(cnt==2)
			System.out.println(num);
		
		}
   }

}
