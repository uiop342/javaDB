package Day5;

public class Lotto {

	public static void main(String[] args) {
		int arr[]=new int[6];
		int max=45,min=1;
		int i=0;
		int cnt=0;
		/* 랜덤으로 중복되지 않는 로또 번호를 생성*/
		for(i=0;i<arr.length;i++){
			arr[i]=0;
		}
		for( ;cnt<arr.length; ){
			int tmp = random(min,max);
			if(!isDuplicate(arr,tmp,cnt)){
				arr[cnt]=tmp;
				cnt++;
			}
		}
		/* tmp가 arr와 중복된 값이 없으면
		 * tmp를 arr에 저장(번지는 잘 생각)
		 * cnt를 하나 증가
		 * */
		arr = createRandomArray(min, max, 7);
		if(arr == null){
			System.out.println("로또 번호 생성에 실패");
		}else{
		for(i=0;i<arr.length;i++){
			System.out.println(arr[i]+"");
		}
		}
	}
	public static boolean isDuplicate(int arr[],int num,int cnt){
		for(int z = 0 ;z<cnt;z++){
			if(arr[z]==num){
				return true;
			}
		}
		return false;

	}
		
	    /* 배열 arr에 num2값이 있는지 없는지 확인하는 코드를 작성해보세요
		 * 있으면 있다고 출력, 없으면 없다고 출력
		 * */
		/* 0 <= x < 1
		 * 0 <= 10*x < 10
		 * 1 <= 10*x+1 < 11
		 * */
		/*int min = 1, max = 100;
		for(int i = 0;i<10;i++){
		int num = (int)random(max,min);
		//math.random은 0.0부터 1.0사이에 랜덤수를 뽑는다
		
		}
     }
	/* 최소값과 최댓값을 입력받아 최소값과 최대값 사이에 있는
	 * 랜덤한 숫자를 출력하는 메소드 
	 * 1. 메소드 명
	 * 2. 매개변수
	 * 3. 리턴타입
	 * */
	public static int random(int max,int min){
		if(min > max){
			int tmp = min;
			min = max;
			max = tmp;
		}
		int num = (int)(Math.random()*(max-min+1)+min);
		for(int i=0;i<6;i++){
		}
		return num;
      }
	/* 중복되지 않은 랜덤한 수를 생성하여 배열에 저장하는
	 * 메소드를 작성하세요.
	 * 1.메소드명 :createRandomArray
	 * 2.리턴타입 :int[]
	 * 3.매개변수 :최소값(int min), 최대값(int max),
	 *          생성할 배열의 수 (int size)
	 * */
	public static int createRandomArray(int max, int min,int size){
		if(max-min+1<size){
		if(min>max){
			/*int tmp = min;
			min = max;
			max = tmp;*/
		}
			return null;
		}
		int arr[]=new int[size];
		int i=0;
		int cnt=0;
		for( ;i<arr.length; ){
			arr[i]=0;
		}
		for( ;cnt<arr.length; ){
			int tmp = random(min,max);
			if(!isDuplicate(arr,tmp,cnt)){
				arr[cnt]=tmp;
				cnt++;
			}
	    }
		return null;
   }
}
