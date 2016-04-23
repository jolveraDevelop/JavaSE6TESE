package modulo10;

public class TestArgumentos{
	public static void main(String[] args) {
		int count = 0;
		for (String argumento : args) {
			System.out.println("Argumento "+count+++" : "+argumento);
		}
	}
}