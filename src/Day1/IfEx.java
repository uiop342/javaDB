package Day1;

public class IfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * if(조건식){
		 * 	     실행문;//조건문이 참일 때 실행됩니다.
		 * }
		 * else if(조건식2){
		 * 		실행문2;//조건식 1이 거짓이고, 조건식2가 참일경우 실행됨
		 * }
		 * else{
		 *     실행문2;//조건식1과 조건식2가 거짓일 때 실행됩니다.
		 * }
		 * if와 else if의 순서가 중요*
		 * */
		int num = 11;
		// 만약 num가 0이면 콘솔에 0입니다를 출력하세요.
		if(num == 0){
			System.out.println("0입니다.");
		}
		// 만약 num가 0이 아니고
		// num가 2로 나우었을때 0과 같다면(if문을 떠올리면됨),
		// 콘솔에 짝수입니다를 출력하세요
		else if(num%2==0){
		System.out.println(num+"는 짝수입니다");
		}
		// 만약 num이 0이 아니고 num을 2로 나누었을때 0과 같지 않다면,
		// 콘솔에 홀수입니다를 출력하세요
		else{
			System.out.println(num+"는 홀수입니다.");
		}
	}

}
