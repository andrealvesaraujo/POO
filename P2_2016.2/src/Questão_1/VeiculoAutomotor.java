package Questão_1;

public abstract class VeiculoAutomotor implements Comparable<VeiculoAutomotor>{
	private String modelo;
	private double capacidade;
	private double Tatual;
	
	public String getModelo(){
		return this.modelo;
	}
	public double getCapacidade(){
		return this.capacidade;
	}
	public double getTatual(){
		return this.Tatual;
	}
	public VeiculoAutomotor(String x,int c,int a){
		this.modelo = x;
		this.capacidade=c;
		this.Tatual=a;
	}
	
	public boolean equals(Object o){
		if(o instanceof VeiculoAutomotor){
			VeiculoAutomotor v = (VeiculoAutomotor) o;
			if(this.Tatual == v.Tatual){
				return true;
			}
		}
		return false;
	}
	
	public int compareTo(VeiculoAutomotor outra){
		if(this.Tatual > outra.Tatual){
			return 1;
		}
		if(this.Tatual < outra.Tatual){
			return -1;
		}
		return 0;
	}
	public  double completarTanque(){
		double aux = this.Tatual;
		if( this instanceof Motocicleta){
			this.Tatual = this.capacidade * 0.9;
		}
		else{
			this.Tatual = this.capacidade;
		}
		return this.Tatual - aux;
	}

}
