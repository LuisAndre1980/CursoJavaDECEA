package aula37;

public class Principal {

	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		Integer ii = 10;
		int x = i;
		int xx = i.intValue();
		
		System.out.println("##############################################");
		
		Integer i1 = 127;
		Integer i2 = 127;
		
		Integer i3 = 128;
		Integer i4 = 128;
		
		System.out.println(i1 == i3);
		System.out.println(i3 == i4);
		
		System.out.println("###############################################");
		
		
		System.out.println("Forma correta de comparar objetos");
		
		System.out.println(i1.equals(i2));
		System.out.println(i3.equals(i4));
		
		System.out.println("################################################");
		System.out.println("Comparar String");
		
		String curso = "DECEA";
		String curso2 = "DECEA";
		String texto = "Curso java OO";
		
		System.out.println(curso.equals(curso2));
		System.out.println(curso.equalsIgnoreCase(curso2));
		
		
		System.out.println(curso.toUpperCase());
		System.out.println(texto.toLowerCase());

	}

}
