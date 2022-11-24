package entities;

import java.util.ArrayList;
import java.util.List;

public class IdCarro {
	
	private Long id;
	
	private List<ListaCarro> listaCarros = new ArrayList<>();
		
	public IdCarro(Long id) {
		super();
		this.id = id;	
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();//add e no final converte pra String
		sb.append("id: ");
		sb.append(this.getId() + "\n");
		/*for (ListaCarro item : listaCarros) {
			sb.append(item + "\n");
		}*/
		for(int i = 0; i<listaCarros.size(); i++) {
			sb.append("Nome do Carro: " + listaCarros.get(i).getNome() + "\nTipo do Carro: " 
		 + listaCarros.get(i).getTipo());
		}
		return sb.toString();
	}
	
	public void addCarro(ListaCarro car) {
		listaCarros.add(car);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
