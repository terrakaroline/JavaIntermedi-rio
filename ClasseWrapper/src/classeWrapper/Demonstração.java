package classeWrapper;

public class Demonstração {
	public static void main(String[] args) {
		Boolean bolWrapped = true;
		System.out.println(bolWrapped.getClass());
		
		Character chWrapped = 'a';
		System.out.println(chWrapped.getClass());
		
		Byte byteWrapped = 1;
		System.out.println(byteWrapped.getClass());
		
		Short shoWrapped = 'B';
		System.out.println(shoWrapped.getClass());
		
		Integer intWrapped = 5215;
		System.out.println(intWrapped.getClass());
		
		Long longWrapped = 139931849L;
		System.out.println(longWrapped.getClass());
		
		Float floatWrapped = 3.1234f;
		System.out.println(floatWrapped.getClass());
		
		Double doubWrapped = 3.121212;
		System.out.println(doubWrapped.getClass());
		
		int numero = Integer.parseInt("1");
		
		numero = numero = 1;
		System.out.println(numero);
		
	}
}
