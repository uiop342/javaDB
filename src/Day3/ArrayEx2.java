package Day3;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 배열을 이용하여 학생 5명의 성적을 키보드를 통해 입력받고 
		 * 받은 점수를 출력하는 코드를 작성하세요
		 * 1. 배열선언
		 * 2. Scanner를 이용한 scan선언
		 * 3. 반복문을 이용하여 학생 점수를 키보드로 입력받음
		 * 4. 반복문을 이용하여 입력받은 학생의 점수를 출력*/
		int score[]= new int [5]; // score 안에 0 ~ 4까지 변수가 들어가있다
		Scanner scan = new Scanner(System.in); //일반입력모드로 변형
		for(int i = 0; i <score.length;i++){ //i를 0부터 입력가능하게 만듬
			System.out.print("학생"+(i+1)+"의 점수를 입력하세요 : ");
			score[i]=scan.nextInt();
		}
		for(int i = 0; i <score.length;i++){
			System.out.println("학생"+(i+1)+"의 점수 : "+score[i]);
		}
		/* 학생들의 평균을 구하는 코드를 작성하세요.*/
		/*double avg=(score[0]+score[1]+score[2]+score[3]+score[4])/5.0;*/
		int sum = 0;
		double avg=0.0;
		for(int i =0; i<score.length;i++){
			sum += score[i]; //0~4까지의 모든값을 더한걸  sum의 대입함
			avg += (double)score[i]/score.length;
		}
		System.out.println("학생들의 평균 점수 : "+(double)sum/5.0);
		System.out.println("학생들의 평균 점수 : "+avg);
		}
}
