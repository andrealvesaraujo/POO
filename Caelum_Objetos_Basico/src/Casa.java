
public class Casa {
	String cor;
	Porta p1 = new Porta();
	Porta p2 = new Porta();
	Porta p3 = new Porta();
	void pinta(String s){
		this.cor=s;
	}
	int quantasPortasAbertas()
	{
		int cont=0;
		if(p1.estaAberta()){
			cont++;
		}
		if(p2.estaAberta()){
			cont++;
		}
		if(p3.estaAberta()){
			cont++;
		}
		return cont;
	}
}
