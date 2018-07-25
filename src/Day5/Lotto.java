package Day5;

public class Lotto {

	public static void main(String[] args) {
		int arr[]=new int[6];
		int max=45,min=1;
		int i=0;
		int cnt=0;
		/* �������� �ߺ����� �ʴ� �ζ� ��ȣ�� ����*/
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
		/* tmp�� arr�� �ߺ��� ���� ������
		 * tmp�� arr�� ����(������ �� ����)
		 * cnt�� �ϳ� ����
		 * */
		arr = createRandomArray(min, max, 7);
		if(arr == null){
			System.out.println("�ζ� ��ȣ ������ ����");
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
		
	    /* �迭 arr�� num2���� �ִ��� ������ Ȯ���ϴ� �ڵ带 �ۼ��غ�����
		 * ������ �ִٰ� ���, ������ ���ٰ� ���
		 * */
		/* 0 <= x < 1
		 * 0 <= 10*x < 10
		 * 1 <= 10*x+1 < 11
		 * */
		/*int min = 1, max = 100;
		for(int i = 0;i<10;i++){
		int num = (int)random(max,min);
		//math.random�� 0.0���� 1.0���̿� �������� �̴´�
		
		}
     }
	/* �ּҰ��� �ִ��� �Է¹޾� �ּҰ��� �ִ밪 ���̿� �ִ�
	 * ������ ���ڸ� ����ϴ� �޼ҵ� 
	 * 1. �޼ҵ� ��
	 * 2. �Ű�����
	 * 3. ����Ÿ��
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
	/* �ߺ����� ���� ������ ���� �����Ͽ� �迭�� �����ϴ�
	 * �޼ҵ带 �ۼ��ϼ���.
	 * 1.�޼ҵ�� :createRandomArray
	 * 2.����Ÿ�� :int[]
	 * 3.�Ű����� :�ּҰ�(int min), �ִ밪(int max),
	 *          ������ �迭�� �� (int size)
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
