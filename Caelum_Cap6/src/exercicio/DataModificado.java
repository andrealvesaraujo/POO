package exercicio;

public class DataModificado {
	private int dia,mes,ano;
	
	public int getDia() {
		return dia;
	}
	public void setDia(int d) {
		if(d>0 && d<=31){
			this.dia = d;
		}
		else{
			System.out.println("N foi possivel botar o dia");
		}
		
	}
	public int getMes() {
		
		return mes;
	}
	public void setMes(int m) {
		if(m>0 && m<=12){
			this.mes = m;
		}
		else{
			System.out.println("N foi possivel botar o mes");
		}
		
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int a) {
		if(a>0 && a<=2017){
			this.ano = a;
		}
		else{
			System.out.println("N foi possivel botar o ano");
		}
		
	}
	
	public DataModificado()
	{
		
	}
	public DataModificado(int d,int m ,int a)
	{
		if(m==2 && d>28){
			System.out.println("Data invalida : " + d +"/" + m  +"/" + a);
			
		}
		else{
			setDia(d);	
			setMes(m);
			setAno(a);
		}
	}
	
	public String formatada(){
		return dia+"/" + mes + "/" +ano;
	}
}
