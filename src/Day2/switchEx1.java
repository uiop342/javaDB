package Day2;

public class switchEx1 {

	public static void main(String[] args) {
		/*switch(변수){
		case 값1: //if(변수 == 값1)			
			실행문;
			break; //break가 없다면 실행문 2가 실행되버린다.
				   //break가 있으면 변수값이 값1일 때 실행문 1만 실행하고
			       //break가 없다면 변수값이 값1일 때 실행문 1과 실행문2가 같이 실행됨
			case 값2: //else(변수 == 값1)
			실행문2;
			break;
		default: //else
			실행문3;
		*/
		/* num의 값이 0이면 콘솔에 0입니다라고 출력하고
		 * num의 값이 1이면 콘솔에 1입니다라고 출력하고
		 * num의 값이 0과 1일 아니면 콘솔에 0과 1이 아닙니다라고 출력하는 예제*/
		int num = 0;
		switch(num){
		case 1:
			System.out.println("1입니다.");
		break;
		case 0:
			System.out.println("0입니다.");
		break;                           //break를 걸지않을시 0입니다와 0과 1이 아닙니다
		default:   						 //라는 값이 동시에 출력된다.
			System.out.println("0과 1이 아닙니다.");
		}
	}

}
