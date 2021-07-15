
public class Method {
	public static void main(String[]args){
		MethodExam mc = new MethodExam();
		// MethodExam이라는 참조형 data type. mc라는 참조형 변수명. new는 다음 것이 생성자, 곧 MethodExam이라는 instance 생기게 함
		mc.method1();
		// period는 mc이라는 변수가 가진 클래스(속성, 메소드)를 접근가능
		// 전에 만든 method1을 실행하게 한다. 괄호 사이에 아무것도 없다는 것은 매개변수가 없기 때문
		mc.method2(10);
		// 전에 만든 method2를 실행하게 한다. 괄호 사이의 10은 정수형 (integer) 매개변수이다
		int value = mc.method3();
		// 전에 만든 method3는 매개변수를 만들지 않아 괄호 사이에 값이 없음. 하지만 정수형 리턴값이 있지만 받아낼 방법이 없다
		// 그렇기에 값을 받아낼 변수 생성이 필요하다. 이게 바로 int value이다.
		System.out.println("method3가 리턴한 값" + value);
		mc.method4(3, 5);
		// 전에 만든 method4는 정수형 매개변수를 두개 받는다. 그렇기에 괄호 사이에 정수형 피연산자 두개가 있다
		int value2 = mc.method5(5);
		System.out.println("method5가 리턴한 값" + value2);
	}
}
