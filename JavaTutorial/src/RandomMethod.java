import java.util.Random;

public class RandomMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Math Ŭ���� random�޼ҵ� ���
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random()); // 0~10 ������ ���ڰ� �����ϰ� ���ɴϴ�.
		
		System.out.println((int)(Math.random() * 10000) %10); // 0~9 ������ ���ڸ� �����ϰ� ���
		System.out.println((int)(Math.random() * 10000) %10);
		System.out.println((int)(Math.random() * 10000) %10);
		System.out.println((int)(Math.random() * 10000) %10);
		
		
		//Random Ŭ�� ���
		Random m_random = new Random();
		
		System.out.println(m_random.nextInt()); // int Ÿ���� ������ ���
		System.out.println(m_random.nextInt(10)); // 0~10 ������ intŸ�� ���� ���
		System.out.println(m_random.nextLong()); // Long Ÿ���� ���� ���
		System.out.println(m_random.nextFloat()); // float Ÿ���� ���� ���
	}

}
