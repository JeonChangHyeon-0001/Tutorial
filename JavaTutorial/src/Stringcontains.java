
public class Stringcontains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("This is String, apple is very delicious");
		
		//contains메소드는 찾기 기능
		System.out.println("String이 있는가? => " + str.contains("String"));
		System.out.println("Java가 있는가? => " + str.contains("Java"));
		
		//replace메소드는 찾아바꾸기 기능
		System.out.println("문자단위로 변경 => " + str.replace('p', '1'));
		System.out.println("문자열단위로 변경 => " + str.replace("String", "Java"));
	}

}
