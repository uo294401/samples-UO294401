package giis.demo.jdbc;

public class PruebaUO288339 {

	public static void main(String[] args) {
		int result = doNothing();
		System.out.println("Prueba IPS, rama github " + result);
	}
	
	public static int doNothing() {
		int count = 0;
		for(int i = 0; i < 100000; i++) {
			count +=1;
		}
		return count;
	}
}
