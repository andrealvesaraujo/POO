
public class Porta {
	String cor;
	double dx,dy,dz;
	boolean aberta;
	
	void abre(){
		this.aberta=true;
	}
	void fechar(){
		this.aberta=false;
	}
	void pintar(String s){
		this.cor=s;
	}
	boolean estaAberta(){
		if(this.aberta){
			System.out.println("Aberta");
			return true;
		}
		else{
			System.out.println("Fechada");
			return false;
		}
	}
}
