
public class RandomMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random()); // 0~10 사이의 숫자가 랜덤하게 나옵니다.
		
		System.out.println((int)(Math.random() * 10000) %10); // 0~9 까지의 숫자를 랜덤하게 출력
		System.out.println((int)(Math.random() * 10000) %10);
		System.out.println((int)(Math.random() * 10000) %10);
		System.out.println((int)(Math.random() * 10000) %10);
		
	}

}
