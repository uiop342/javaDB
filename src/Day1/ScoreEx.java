package Day1;

public class ScoreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 정수로 된 성적을 학점으로 출력하세요
		 * 0~59   : F
		 * 60~69  : D
		 * 70~79  : C
		 * 80~89  : B
		 * 90~100 : A
		 * 그외         : 성적을 잘못 입력했습니다.
		 * */
		
		int score = 88;
		
		if (score <= 100 && score >= 90){
			System.out.println("A");
		}
		else if (score <= 89 && score >= 90){
			System.out.println("B");
		}
		else if (score <= 79 && score >= 70){
			System.out.println("C");
		}
		else if (score <= 69 && score >= 60){
			System.out.println("D");
		}
		else if (score <= 59 && score >= 0){
			System.out.println("F");
		}
		else{
			System.out.println("성적이 잘못 입력되었습니다.");
		}

	}

}
