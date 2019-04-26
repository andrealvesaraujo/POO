package Questão2;
import java.util.*;
public class Academia {
	private String nome;
	private List listaNinjas= new ArrayList();
	public Academia(String academia){
		this.nome=academia;
	}
	public List getListaNinjas(){
		return this.listaNinjas;
	}
	public void matriculaNinja(Ninja N){
		this.listaNinjas.add(N);
	}
	public boolean imprimeDadosNinjaSeExistir(Ninja N){
		int indice = this.listaNinjas.indexOf(N);
		if(indice!=-1){
			Ninja nj = (Ninja)(this.listaNinjas.get(indice));
			System.out.println(nj.getNome() +" "+nj.getCpf()  +" "+nj.getIdade() );
			return true;
		}
		else{
			return false;
		}
	}
	public String toString(){
		return this.nome+ " - " +this.listaNinjas.size() ;
	}
	
}
