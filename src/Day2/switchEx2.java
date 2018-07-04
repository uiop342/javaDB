package Day2;

public class switchEx2 {

	public static void main(String[] args) {
        /* 문자 ch가 a 또는 A 이면 A 입니다라고 콘솔에 출력하고
         * 문자 ch가 b 또는 B 이면 B 입니다라고 콘솔에 출력하고
         * 문자 ch가 a, A, b, B가 아니면 A와 B가 아닙니다
         * 라고 콘솔에 출력하는 예제를 switch case문으로 작성하세요.
         * */
        char ch='B';
        switch(ch){
        case'a'://ch의 값이'a'이면
        case'A'://ch의 값이'A'이면
        	System.out.println("A입니다.");
        	break;
        case'b'://ch의 값이'b'이면
        case'B'://ch의 값이'B'이면
        	System.out.println("B입니다.");
        	break;
        default:
        System.out.println("A와 B가 아닙니다");
        }
	}
}


