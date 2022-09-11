
public class SomaEMultiplicao {
	private int n1;
	private int somaImpar;
	private int multPar;
	
	public void somaImpares(int n1) {
		this.setN1(n1);
		
		for(int x = 0; x < this.getN1(); x++) {
			if(x % 2 != 0) {
				System.out.println("Impar: " + x);
				this.setSomaImpar(this.getSomaImpar() + x);
			}
		}
		
		System.out.println("A soma dos impares eh: " + this.getSomaImpar());
	}
	
	public void multiPar(int n1) {
		this.setN1(n1);
		
		for(int x = 0; x < this.getN1(); x++) {
			if(x % 2 == 0) {
				System.out.println("Par: " + x);
				this.setMultPar(this.getMultPar() * x);
			}
		}
		
		System.out.println("A multiplicacao dos pares eh: " + this.getMultPar());
		
	}
	
	
	public int getSomaImpar() {
		return somaImpar;
	}
	public void setSomaImpar(int somaImpar) {
		this.somaImpar = somaImpar;
	}
	public int getMultPar() {
		return multPar;
	}
	public void setMultPar(int multPar) {
		this.multPar = multPar;
	}
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}	
	
}	
