
public class Method {
	public static void main(String[]args){
		MethodExam mc = new MethodExam();
		// MethodExam�̶�� ������ data type. mc��� ������ ������. new�� ���� ���� ������, �� MethodExam�̶�� instance ����� ��
		mc.method1();
		// period�� mc�̶�� ������ ���� Ŭ����(�Ӽ�, �޼ҵ�)�� ���ٰ���
		// ���� ���� method1�� �����ϰ� �Ѵ�. ��ȣ ���̿� �ƹ��͵� ���ٴ� ���� �Ű������� ���� ����
		mc.method2(10);
		// ���� ���� method2�� �����ϰ� �Ѵ�. ��ȣ ������ 10�� ������ (integer) �Ű������̴�
		int value = mc.method3();
		// ���� ���� method3�� �Ű������� ������ �ʾ� ��ȣ ���̿� ���� ����. ������ ������ ���ϰ��� ������ �޾Ƴ� ����� ����
		// �׷��⿡ ���� �޾Ƴ� ���� ������ �ʿ��ϴ�. �̰� �ٷ� int value�̴�.
		System.out.println("method3�� ������ ��" + value);
		mc.method4(3, 5);
		// ���� ���� method4�� ������ �Ű������� �ΰ� �޴´�. �׷��⿡ ��ȣ ���̿� ������ �ǿ����� �ΰ��� �ִ�
		int value2 = mc.method5(5);
		System.out.println("method5�� ������ ��" + value2);
	}
}
