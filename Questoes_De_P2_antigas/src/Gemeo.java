
public class Gemeo {
	private String nome;
	private Gemeo gemeo;
	
	public Gemeo(String n){
		nome=n;
	}

	public String getNome() {
		return nome;
	}

	public Gemeo getGemeo() {
		return gemeo;
	}
	public void alteraGemeo(){
		Gemeo meuG = new Gemeo(nome);
		gemeo = meuG;
		gemeo.nome="outroNome";
	}
	public static void main(String args[]){
		Gemeo g = new Gemeo("Andre");
		g.alteraGemeo();
		System.out.println("Gemeo 1:" + g.getNome());
		System.out.println("Gemeo 2:" +g.getGemeo().getNome());
		System.out.println("Gemeo 3:"+g.getGemeo().getGemeo());
	}
}
