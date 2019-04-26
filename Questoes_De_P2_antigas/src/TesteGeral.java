
public class TesteGeral {
	private static int v;
	public TesteGeral(){
		System.out.println(v++);
	}
	
	public static void main(String args[]){
		TesteGeral T = new TesteGeral();
		T = new TesteGeral();
		T = new TesteGeral();
		T = new TesteGeral();
		T = new TesteGeral();
		T = new TesteGeral();
		
		
	}
}
