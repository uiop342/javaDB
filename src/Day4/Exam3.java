package Day4;

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//향상된 for문
		int arr[] = new int [5];
		for (int i=0;i<5;i++){
			arr[i]=i;
		}
		/* 배열의 모든 데이터를 가져올 때 사용
		 * 배열의 값을 수정하지 않을 때 사용
		 * 모든 배열의 한번씩 접근이 필요할 때
		 * arr의 저장된 변수값을 tmp값에 한번씩 다 넣어라*/
		for(int tmp:arr){
			System.out.println(tmp);
		}
		/* 자료형 이름[]
		 * 자료형 이름[]=new 자료형 [배열의 크기];*/
		/* 정수num의 각 자리를 잘라서 배열에 저장하는 코드를 작성하세요.
		 * 단, 반복문을 사용해야 합니다.
		 * num=1234;
		 * 0번지 : 4, 1번지 : 3, 2번지 : 2 3번지 : 1
		 * 1234에서 4를 뽑아서 0번지에 저장,
		 * 1234를 123으로 변형시켜야함
		 * 123=>3를 뽑아내서 1번지에 저장
		 * 123을 12로 뽑아서 변형
		 * 12=>  1를 뽑아서 2번지에 저장
		 * 12를      2로 뽑아서 변형
		 * 1=>   3번지에 저장
		 * */
		System.out.println("----------");
		int asr [] = new int [11];
		int num=1234;
		int cnt = 0 ; //배열에 저장된 개수
		while(num!=0){
			asr[cnt]=num%10;//마지막 자리를 추출하여 배열에 저장하는 코드
			num=num/10;//숫자에 마지막 자리를 버리는 코드
			cnt++;//저장된 갯수 증가
		}
		int i=0;
		while(i<cnt){
			System.out.print(asr[i]);
			i++;
		}
		System.out.println();
	}

}
