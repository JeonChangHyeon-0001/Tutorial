
public class Stringcontains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("This is String, apple is very delicious");
		
		//contains�޼ҵ�� ã�� ���
		System.out.println("String�� �ִ°�? => " + str.contains("String"));
		System.out.println("Java�� �ִ°�? => " + str.contains("Java"));
		
		//replace�޼ҵ�� ã�ƹٲٱ� ���
		System.out.println("���ڴ����� ���� => " + str.replace('p', '1'));
		System.out.println("���ڿ������� ���� => " + str.replace("String", "Java"));
	}

}
