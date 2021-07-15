
public class MethodExam {
	//메소드 선언 방법 - public 리턴타입 메소드명 (매개변수들) {필요한 기능 구형}
	// 다양한 형태의 메소드
	//1. 들어오는 매개변수도 없고 리턴값도 없다
	public void method1 () {
		System.out.println("m1이 실행되었습니다.");
	}
	// void는 리턴타입이 없다는 것을 의미함. method1는 윗 메소드의 이름이다. 괄호() 사이에 아무것도 없다는 것은 매개변수가 없다를 의미함
	//2. 들어오는 매개변수는 있지만, 무슨 task를 수행한 다음 리턴값이 없다
	public void method2 (int i) {
		System.out.println(i + "를 사용한 m2이 실행되었습니다.");
	}
	// 괄호() 사이에 int i가 있다는 것은 i라는 integer형태의 매개변수를 받았다는 뜻이다
	// 3. 들어오는 매개변수는 없지만, 무슨일을 수행한 다음에 리턴값을 돌려준다
	public int method3 () {
		System.out.println("m3이 실행되었습니다.");
		return 10;
	}
	// 값을 되돌려 주기 때문에 받는 리턴값의 data type을 정수 integer로 설정. 하지만 받는 매개변수는 없기 때문에 괄호 사이에 아무것도 없음.
	// return이라는 keyword는 값을 되돌려주겠다는 예약어
	// 4. 매개면수 2개를 (아니면 그 이상을) 받고 값을 리턴 안한다
	public void method4 (int i, int x) {
		System.out.println(i + "과" + x + "를 사용한 m4이 실행되었습니다.");
	}
	// 매개변수는 얼마든지 괄호 사이에 나열 가능하다. (Comma로 연결가능). 참조형 data type들도 잆력 가능하다
	// 5. 값을 바다아서 값을 출력하는 형태
	public int method5 (int i) {
		System.out.println(i + "를 사용한 m5이 실행되었습니다.");
		return i*2;
	}
}

