package atividades;

import selvagens.*;

public class Principal3 {
	public static void main(String[] args){
		
	
		Animal[] corrida = new Animal[3];
		corrida[0] = new Gato();
		corrida[1] = new Cachorro();
		corrida[2] = new Tartaruga();
		corrida[0].setNome("Killer");
		
		for(Animal A:corrida){
			A.correr();
		}
		
		/*for(int i=0;i<corrida.length; i++)
		{
			corrida[i].correr();
			if(corrida[i] instanceof Gato){ //instanceof serve para comparar
				//corrida[i].miar;//Erro pois o array é de Animal.Tem que usar o casting.
				Gato g = (Gato)corrida[i];
				g.miar();
				//System.out.println(g); == g.toString();
				System.out.println(g);
				
			}
		}
	*/	
	}
}
