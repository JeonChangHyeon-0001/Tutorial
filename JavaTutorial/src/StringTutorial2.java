
public class StringTutorial2 {

	public static void main(String[] args) {
		String str1 = "This is String"; // ��Ƽ�� ���ͷ��� ���� �Է����ִ� ���
		String str2 = new String("Java"); // String Ŭ���� �����ڸ� ���
		                                  // ��Ƽ�� ���ͷ��� �Ű������� �ʱ�ȭ
		
		char[] charArr = {'S','t','r','i','n','g',' ','C','l','a','s','s'};
		String str3 = new String(charArr); // String Ŭ���� �����ڸ� ���
		                                   // char�迭�� �Ű������� �ʱ�ȭ
		
		System.out.println("str1 : " +str1);
		System.out.println("str2 : " +str2);
		System.out.println("str3 : " +str3);
	}

}
