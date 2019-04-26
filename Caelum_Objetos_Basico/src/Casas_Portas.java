
public class Casas_Portas {

	public static void main(String[] args) {
		Porta p1 =new Porta();
		Porta p2 =new Porta();
		Porta p3 =new Porta();
		Casa c = new Casa();
		
		c.p1=p1;
		c.p2=p2;
		c.p3=p3;
		
		p1.dx=140.50;
		p2.dy=170.02;
		p3.dz=130.00;
		
		p1.abre();
		p1.fechar();
		p2.fechar();
		p3.abre();
		p1.pintar("laranja");
		p2.pintar("Verde");
		p3.pintar("Azul");
		
		p1.estaAberta();
		p2.estaAberta();
		p3.estaAberta();
		
		c.pinta("Vermelha");
		c.p3.pintar("Preta");
		c.p1.abre();
		System.out.println(c.quantasPortasAbertas());
		
	}

}
