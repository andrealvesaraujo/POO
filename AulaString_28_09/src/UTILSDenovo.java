
public class UTILSDenovo {
	public static void main(String args[]){
		String str = "�Agora, quando estou sentado ao seu lado e falo consigo, tenho medo de pensar no futuro, pois no futuro est� novamente a solid�o, novamente esta vida in�til e cheirando a mofo; e com o qu� vou sonhar se, desperto, fui t�o feliz ao seu lado? Oh, bendita seja a senhorita, minha querida, por n�o ter me rejeitado logo na primeira vez. Porque agora posso dizer que vivi ao menos duas noites em minha vida!.";
			Verificar(str,"quando");
		str=str.replaceAll("[,,!,.,;,?]","");
		
		System.out.println(str);
	}
	public static void Verificar(String pr,String s){
		pr = pr.toLowerCase();
		int indice = pr.indexOf(s);
		if(indice!=-1 && pr.startsWith("para") && pr.endsWith("acredita")){
			System.out.println("sim" );
		}
		else
			System.out.println("Nao");
	}
}	
