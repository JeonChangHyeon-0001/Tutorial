import java.util.Random;

public class RandomMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Math 클라스의 random메소드 사용
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random()); // 0~10 사이의 숫자가 랜덤하게 나옵니다.
		
		System.out.println((int)(Math.random() * 10000) %10); // 0~9 까지의 숫자를 랜덤하게 출력
		System.out.println((int)(Math.random() * 10000) %10);
		System.out.println((int)(Math.random() * 10000) %10);
		System.out.println((int)(Math.random() * 10000) %10);
		
		
		//Random 클라스 사용
		Random m_random = new Random();
		
		System.out.println(m_random.nextInt()); // int 타입의 난수를 출력
		System.out.println(m_random.nextInt(10)); // 0~10 사이의 int타입 난수 출력
		System.out.println(m_random.nextLong()); // Long 타입의 난수 출력
		System.out.println(m_random.nextFloat()); // float 타입의 난수 출력
	}

}
