package forum2505;

public class AppPais {

	public static void main(String[] args) {
		Pais brasil = new Pais("Brasil", +55);

		Estado acre = new Estado("Acre", "AC", 68);
		Estado alagoas = new Estado("Alagoas", "AL", 82);
		Estado amazonas = new Estado("Amazonas", "AM", 92);

		brasil.addEstado(acre);
		brasil.addEstado(alagoas);
		brasil.addEstado(amazonas);

		System.out.println(brasil.getEstados());
		System.out.println(brasil.contarEstados());
	}

}
