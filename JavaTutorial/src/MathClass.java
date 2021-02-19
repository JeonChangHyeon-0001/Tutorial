
public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Math.pow : " + Math.pow(5.0, 2.0)); //����
		System.out.println("Math.sqrt : " + Math.sqrt(25.0)); //������
		System.out.println("Math.cbrt : " + Math.cbrt(27.0));  //��������
		System.out.println();
		System.out.println("Math.log : " + Math.log(10.0)); //�ڿ��α� 
		System.out.println("Math.log : " + Math.log(Math.E));  //�ڿ��α�
		System.out.println("Math.log10 : " + Math.log10(10.0));  //���α�
		System.out.println();
		System.out.println("Math.sin : " + Math.sin(getRadian(60.0))); //sin
		System.out.println("Math.cos : " + Math.cos(getRadian(60.0))); //cos
		System.out.println("Math.tan : " + Math.tan(getRadian(60.0))); //tan
		System.out.println();
		System.out.println("Math.abs : " + Math.abs(-10)); //���밪
		System.out.println("Math.max : " + Math.max(100, 50)); //�ִ�
		System.out.println("Math.min : " + Math.min(100, 50));  //�ּ�
		
	}

	private static double getRadian(double _num) {
		return _num * Math.PI / 180.0;
	}

}
