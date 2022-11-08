package erros;

public class DividePorZero {
	
	public int forcaErro(int x, int y) {
		
		if(y == 0) {
			
			//System.out.println("Y igual a zero");
			throw new RuntimeException("Y igual a zero");
			//lança uma nova exceção caso caia aqui.
			
		}else {
			return x / y;
		}
		
	}
}
