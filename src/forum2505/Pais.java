package forum2505;

import java.util.List;
import java.util.ArrayList;

public class Pais {

	private String nomeEstado;
	private Integer codigoDDD;
	private List<Estado> estados;

	public Pais(String nome, Integer codigoDDD) {
		this.nomeEstado = nome;
		this.codigoDDD = codigoDDD;
		estados = new ArrayList<Estado>();
	}

	public void addEstado(Estado estado) {
		this.estados.add(estado);
	}

	public String getNome() {
		return nomeEstado;
	}

	public Integer getCodigoDDD() {
		return codigoDDD;
	}

	public List<Estado> getEstados() {
		return estados;
	}

	public int contarEstados() {
		int contador = 0;
		for (Estado nomeEstado : estados) {
			contador++;
		}
		return contador;
	}

}
