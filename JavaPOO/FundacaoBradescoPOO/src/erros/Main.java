package erros;

public class Main {

	public static void main(String[] args) {
		
		DividePorZero d1 = new DividePorZero();
		
		try {
			int divisao = d1.forcaErro(1, 0);
			System.out.println("Valor: " + divisao);
			
		}catch(RuntimeException e) {
			//System.out.println("Erro: "+ e.getMessage()); //getMessagem é do meu Exception que herda de Throwable
			System.err.println("Erro: "+ e.getMessage()); //MENSAGEM FICA VERMELHA 
		}
	
		
		//não pode ter regra de negócio no meu view, só no meu domain!
		/*try {
			
		}catch(Exception e) {
			System.out.println("Entrou no erro 1: " + e);
			
		}catch(Throwable e2) {
			System.out.println("Entrou no erro 2: " + e2);
		}finally {
			System.out.println("Executado ");
		}*/
		
	}

}
