import java.util.ArrayList;
import java.util.List;

public class Banco {
	List<Conta> contas = new ArrayList<Conta>();
	
	public void adiciona(Conta c){
		contas.add(c);
	}
	public Conta pega(int x){
		return contas.get(x);
	}
	public int PegaQTDContas(){
		return contas.size();
	}
}
//Livro do prof pagina: 159
