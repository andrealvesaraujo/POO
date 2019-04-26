
public class TestaCasaJanela {

	public static void main(String[] args) {
		Janela j = new Janela(); j.cor="azul"; j.material="vidro";
		Casa c = new Casa(); c.cor="verde"; c.numero=100; c.janela=j;
		System.out.println("Casa : " + c.cor + " " +c.numero + " e sua janela " + c.janela.cor + " " + c.janela.material);
	}

}
