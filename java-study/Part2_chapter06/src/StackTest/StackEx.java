package StackTest;

public class StackEx {
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		System.out.println(stack.push(10));
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
//		if(!stack.push(100)) {
//			System.out.println("���� �����÷ο�");
//		}
		System.out.println();
		
		int value = stack.pop();
		System.out.println(value);

		value = stack.pop();
		System.out.println(value);

		value = stack.pop();
		System.out.println(value);
		
		// ���� �߻�
		if(stack.isEmpty()) {
			System.out.println("������ ������ϴ�.");
		}else {
			value = stack.pop();
			System.out.println(value);
		}
	}
}