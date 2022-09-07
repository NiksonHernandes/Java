
public class Livro implements Publicacao{
	
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor; //"ENUM" da classe Pessoa;
	
	public String detalhes() {
		return "Livro [titulo = " + titulo + ", autor = " + autor + "\n- total de paginas = " 
				+ totPaginas + ", pagina atual = " + pagAtual
				+ ", aberto = " + aberto + "\n- leitor = " + leitor.getNome() + 
				", idade do leitor = " + leitor.getIdade() + ", sexo do leitor = " + 
				leitor.getSexo() + "]";
	}

	//contructor
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		
		this.setTitulo(titulo);
		this.setAuto(autor);
		this.setTotPaginas(totPaginas);
		this.setLeitor(leitor);
		this.setAberto(false);
		this.setPagAtual(0);
	}
	
	//Overrides da interface
	@Override //sobrescrever 
	public void abrir() {
		this.setAberto(true);
	}

	@Override
	public void fechar() {
		this.setAberto(false);
	}

	@Override
	public void folhear(int p) {
		if(p > this.getTotPaginas()) {
			this.setPagAtual(0);
		}else {
			this.setPagAtual(p);
		}
	}

	@Override
	public void avancarPag() {
		this.setPagAtual(this.getPagAtual() + 1);
	}

	@Override
	public void voltarpag() {
		this.setPagAtual(this.getPagAtual() - 1);
	}
	
	//setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setAuto(String autor) {
		this.autor = autor;
	}
	
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	//getters
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public int getTotPaginas() {
		return this.totPaginas;
	}
	
	public int getPagAtual() {
		return this.pagAtual;
	}
	
	public boolean getAberto() {
		return this.aberto;
	}
	
	public Pessoa getLeitor() {
		return this.leitor;
	}


	
	
}
