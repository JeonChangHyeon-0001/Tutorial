
public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is String";
		String tmpstr1, tmpstr2;
		
		//substring은 문자열에서 특정위치에 있는 문자열을 가져오는 메소드 입니다.
		tmpstr1 = str.substring(7);
		tmpstr2 = str.substring(3, 9); //substring는 2개가 있습니다. (오버로딩)
		
		System.out.println("tmpstr1 : " + tmpstr1);
		System.out.println("tmpstr2 : " + tmpstr2);
	}

}
