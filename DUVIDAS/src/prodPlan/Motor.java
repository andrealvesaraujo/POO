package prodPlan;

public class Motor extends Parte{
	protected float potencia;
	protected float corrente;
	protected int rpm;
	
	public Motor(int codigo,String nome,String desc,float valor,float pot,float corr,int rpm){
		super(codigo,nome,desc,valor);
		this.potencia = pot;
		this.corrente=corr;
		this.rpm=rpm;
	}
	public Motor(float pot,float corr,int rpm){
		this.potencia = pot;
		this.corrente=corr;
		this.rpm=rpm;
	}
	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public float getCorrente() {
		return corrente;
	}

	public void setCorrente(float corrente) {
		this.corrente = corrente;
	}

	public int getRpm() {
		return rpm;
	}

	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
	
	public String toString(){
		return "É um motor de potencia: "+ potencia+" corrente: "+ corrente + " e rpm: " +rpm;
	}
	public boolean equals(Object o){
		if(o instanceof Motor){
				if((this.potencia ==((Motor) o).potencia) && (this.rpm ==((Motor) o).rpm) &&(this.corrente == ((Motor)o).corrente)){
					System.out.println("São motores iguais");
					return true;
				}
				System.out.println("É outro Motor");
				return false;
		}else{
			System.out.println("É outro objeto");
			
			return false;
			
		}
	}
}
