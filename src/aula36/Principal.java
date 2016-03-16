package aula36;

public class Principal {

	public static void main(String[] args) {
		int x = 10;
		Integer i = new Integer(10);
		
		
		byte n = (byte) x;
		
		byte b = i.byteValue();
		double d = i.doubleValue();
		
		
		System.out.println("Byte: " +b);
		System.out.println("Double: " +d);

	}

}
