package Day1;

public class Variable {

	public static void main(String[] args) {
		//변수 규칙
        //int 1um;    //변수명 처음에는 숫자가 올 수 없다.
        //int num%;   // 특수문자는 $와 _만 가능
        //int int;    //키워드 사용 불가능
        //int num 1;  //공백 사용 불가
		int num;
		//int num;    // 동일한 변수는 선언불가능
        int Num;      //대소문자 구별하여 다른 변수로 취급
        //변수 관례
        int studentScore;
        /*2단어 이상으로 변수명을 만들 경우 두번째 단어부터는
         * 첫글자를 대문자로 한다 : "카멜표시법" */
        int a;//(x)잘안씀
        //변수는 변수명을 보고 해당하는 역하을 알 수 있어야 된다.
        
        num = 10; // 10 = num; (x)
        // 10 : 10 * 1 + 1 * 0 = 10
        System.out.println("num = 10 : "+num);
        num = 0x11;
        // 0x11 : 16 * 1 + 1 * 1 = 17
        System.out.println("num = 0x11 : "+num);
        num = 012;
        //012 : 8 * 1 + 1 * 2 =10
        System.out.println("num = 012 : "+num);
        double num2 = 1.234;
        System.out.println("num2 = 1.234 : "+num2);
        num2 = 1.234e3;
        System.out.println("num2 = 1.234e3 : "+num2);
        //실수 변수 확인 예제
        char ch = 'A';
        System.out.println("ch ='A' : " + ch);
        ch = '한';
        System.out.println("ch ='한' : " + ch);
        boolean isTrue = false;
        System.out.println("isTrue = false : " + isTrue);
        isTrue = true;
        System.out.println("isTrue = true : " + isTrue);
	}

}
