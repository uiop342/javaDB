package Day4;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num=10;
		for(int i=1;i<num;i++){
			for(int j=1;j<=num;j++){
				if(j<=i-1){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}System.out.println();
		}System.out.println("_______________________");
		int num1=5;
		for(int i=1;i<=num1;i++){
			for(int j=1;j<=(num1+1)/2;j++){
				if(j<=Math.abs((num1+1)/2-i)){
				System.out.print(" ");
			}
			else{
            System.out.print("*");
			}
		}
			System.out.println();
	}
  }
}