package Ex02_NFE;

public class NumderFormatExceptionEx2 {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		hi(data1,data2);
		
	}
	public static void hi(String data1, String data2) {
		process(data1,data2);
	}
	public static void process(String data1, String data2) {
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + " = "+result);
	}
}