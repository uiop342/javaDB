package Day1;

public class OperatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10 , num2 = 3;
		double res = 0.0;
		//산술연산자
		System.out.println("산술 연산자 예제");
		res = (int)(num1 + num2);//(int)를 생략 가능
		System.out.println("num1 + num2 : " + res);
		res = num1 - num2;
		System.out.println("num1 - num2 : " + res);
		res = num1 * num2;
		System.out.println("num1 * num2 : " + res);
		/* num1을 임시로 실수로 바꿈 : 자료형변환
		 * 자료형변환 : 명시적 자료형변환, 자동 자료형변환
		 * */
		res = (double)num1 / num2;
		System.out.println("num1 / num2 : " + res);
		res = num1 % num2;
		System.out.println("num1 % num2 : " + res);
		//정수 = 실수로 불가, 명시적 형변한을 이용하여 가능하게함
		num1 = (int)res;
		
		//비교 연산자 : 결과가 참 또는 거짓을 반환
		
		
		boolean isPositive = false;
		num1 = 20;
		//크거나 같다 : >= (o), => (x)
	    //작거나 같다 : <= (o), =< (x)
		isPositive = num1 >= 0;
	    System.out.println("num : " + num1 
	    		+ ",양수 : " + isPositive);
	    boolean isSame = false;
	    
	    
	    
	    //=는 대입할때 ==는 비교할때
	    // 같다 : == (o) = (x)
	    isSame = num1 == 10;
	    System.out.println("num1 : " + num1 
	    		+ ",10과 같음  : " + isSame);
	    boolean isDiffent = false;
	    
	    
	    
	    //같지 않다 : !=
	    isDiffent = num1 !=10;
	    System.out.println("num1 : " + num1 
	    		+ ",10과 다름 : " + isDiffent);
	    
	    /* 논리 연산자 : 결과가 true 아니면  false
	     * 논리 연산자들 기준으로 좌, 우에 조건식이 들어가야함
	     * 조건식 : 참(true)과 거짓(false)으로 나뉘는 식
	     * (비교 연산자를 이용한 식) 논리 연산자(비교 연산자를 이요한 식)
	     * 논리연산자 기호 : &&(그리고), ||(또는)(\\쉬프트 누르고 입력시), !(아니다)*/
	    
	    num1 = 101;
	    // 0 <=(num1보다 작거나 같다) num1 <=(100보다 작거나 같다) 100
	    // num1이 0보다 크거나 같고, num1이 100보다 작거나 같다.
	    // false
	    // num1이 0보다 크거나 같거나, num1이 100보다 작거나 같고.
	    // true
	    // 0 <= num1 && num1 <= 100
	    // && 둘다 참일때에만 참, 하나라도 거짓이면 거짓
	    // || 둘다 거짓일때에만 거짓, 하나라도 참이라면 참
	    // ! 참이면 거짓으로, 거짓이면 참으로
	    boolean isScore = 0 <= num1 && num1 <= 100;
	    System.out.println(num1+"은 유효한 성적인가 : " + isScore);
	    boolean isNot = !false;
	    System.out.println("!false : " + isNot);
	    /* 비트 논리 연산자 : 두변수를 비트로 나열한 후 각 비트별로 논리 연산을 한다.
	     * 결과는 true또는 false가 아닌 변수값이 나온다.
	     * 임베디드 프로그램에서 주로 사용
	     * &(그리고), |(또는), ~(아니다), ^(배타)*/
	    num1 = 7;
	    num2 = 10;
	    int num3 = 7 & 10;
	    //  7 : 0000000 00000000 00000000 00000111
	    // 10 : 0000000 00000000 00000000 00001010
	    //  2 : 0000000 00000000 00000000 00000010
	    System.out.println("7&10 : " + num3);
	    num3 = 7 | 10;
	    //  7 : 0000000 00000000 00000000 00000111
	    // 10 : 0000000 00000000 00000000 00001010
	    // 15 : 0000000 00000000 00000000 00001111
	    System.out.println("7|10 : " + num3);
	    num3 = 7 ^ 10;
	    // ^ : 배타논리연산, exclusive, 서로 다르면 1, 같으면 0
	    //  7 : 0000000 00000000 00000000 00000111
	    // 10 : 0000000 00000000 00000000 00001010
	    // 13 : 0000000 00000000 00000000 00001101
	    System.out.println("7^10 : " + num3);
	    num3 = ~7;
	    //  7    : 0000000 00000000 00000000 00000111
	    // ~7(-8): 1111111 11111111 11111111 11111000
	    //         -                                1
	    //       : 1111111 11111111 11111111 11110111
	    //       : 0000000 00000000 00000000 00001000
	    System.out.println("~7 : " + num3);
	    num3 = 10;
	    System.out.println("num3 : " + num3 + " 입니다. ");
	    //""가 들어가지 않는다면 바로 계산 결과를 출력함 출력값 = "11"
	    System.out.println(7+4);
	    //""가 들어가면 숫자를 더하는게 아닌 문자를 더함 출력값 = "74"
	    System.out.println(""+7+4);
	    System.out.println(7+4+"");//""+7+4와는 다른것
	    /* 비트 쉬프트 연산자
	     * 비트를 이동시키는 연산자
	     * >>, <<
	     * */
	    // 00000... <<< 비트 
	    //  15 : 0000000 00000000 00000000 00001111
	    //  30 : 0000000 00000000 00000000 00011110
	    //  60 : 0000000 00000000 00000000 00111100
	    
	    // >>(<<) x x만큼 >>(<<)방향으로 비트를 이동시킴
	    num1 = 15;
	    num3 = num1 << 4;
	    System.out.println("15 << 4 : " + num3);
	    
	    // 00000... <<< 비트 
	    //  15 : 0000000 00000000 00000000 00001111
	    num1 = 15;
	    num3 = num1 >> 2;
	    System.out.println("15 >> 2 : " + num3);
	    //증감연산자 : ++, --
	    // ++ : 원래 값에서 1이 증가
	    // -- : 원래 값에서 1이 감소
	    // ++변수명(전위형), 변수명++(후위형)
	    num1 = 10;
	    num1++;
	    System.out.println("계산후 후위형 num1 : "+num1);
	    num1 = 10;
	    ++num1;
	    System.out.println("계산후 전위형 num1 : "+num1);
	    num1 = 10;
	    System.out.println("계산중 후위형 num1 : "+
	            num1++);
	    System.out.println("계산중 후위형 num1 : "+
	            num1);
	    num1 = 10;
	    System.out.println("계산중 전위형 num1 : "+
	            ++num1);
	    /* 전위형 : 증가 후 동작(대입연산, 화면에 출력)
	     * 후위형 : 동작 후 증가
	     * */
	    /* 조건 선택연산자(삼항연산자)
	     * (조건식)?(값1):(값2)
	     * 조건식이 참이면 값1, 거짓이면 값2 (if문처럼)
	     * */
	    System.out.println((10%2==0)?("짝수"):("홀수"));
	    /* 결합연산자 : 축양형
	     * num1 = num2 + 2; 축약전
	     * num1 += 2; 축약후
	     * num1 = num1 << 1;
	     * num1 <<= 1;
	     * 
	     * */
	    
	    
	}

}
