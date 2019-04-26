
public class Principal {
	public static void main(String[] args){
		Animal[] x = new Animal[5];
		x[0]=new Gato();
		x[1]=new Ganso();
		x[2]=new Cachorro();
		x[3]= new Gato();
		x[4] = new Ganso();
		
		
		for(int i=0;i<x.length;i++){
			if(x[i] instanceof Corredor){
				((Corredor) x[i]).correr();
			}
			if(x[i] instanceof Voador){//--->>>Funciona ate em classes abstratas.Funciona em qualquer classe ou interface
				((Voador)x[i]).voar();
			}
			
		}
		
		
		
	}
}
