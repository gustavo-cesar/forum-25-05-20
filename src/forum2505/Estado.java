package forum2505;

public class Estado {

	private String nomeEstado;
	private String sigla;
	private Integer codigoDDD;

	public Estado(String nome, String sigla, Integer codigoDDD) {
		this.nomeEstado = nome;
		this.sigla = sigla;
		this.codigoDDD = codigoDDD;
		
	}

	public String getNome() {
		return nomeEstado;
	}

	public String getSigla() {
		return sigla;
	}

	public Integer getCodigoDDD() {
		return codigoDDD;
	}

	@Override
	public String toString() {
		return "Estado [Nome=" + nomeEstado + ", Sigla=" + sigla + ", Codigo DDD=" + codigoDDD + "]";
	}

}
