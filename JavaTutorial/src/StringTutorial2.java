
public class StringTutorial2 {

	public static void main(String[] args) {
		String str1 = "This is String"; // 스티링 리터럴을 직접 입력해주는 방법
		String str2 = new String("Java"); // String 클라스의 생성자를 사용
		                                  // 스티링 리터럴을 매개변수로 초기화
		
		char[] charArr = {'S','t','r','i','n','g',' ','C','l','a','s','s'};
		String str3 = new String(charArr); // String 클라스의 생성자를 사용
		                                   // char배열을 매개변수로 초기화
		
		System.out.println("str1 : " +str1);
		System.out.println("str2 : " +str2);
		System.out.println("str3 : " +str3);
	}

}
