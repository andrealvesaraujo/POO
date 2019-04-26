/*
 *String x = "abc";
 char [] k = x.toCharArray();
	 System.out.println(k[4]);---->>>>>>>>>>>>>>>P2
	 String vazio=""
	 for(int i=k.lenght-1;i<0;i--){
	 	str+=k[i];----->Inverter string
	 }
	 
 * SPLITTTT
 * String x = "A casa é bonita";------------>VAI CAIR COM Certeza
 * String str[] = x.split("ca");
 * 
 * Ver parseDouble aqui:
 * String x = "Jõao # is # 1500";
		String y[] =x.split("#");
		double c;
		Double.parseDouble(s)
		System.out.println((y[2]));
		
		
		
*
*	x.toLower/UpperCase()---->Tudo minusculo /maiusculo
*	"a casa        "
*	String u =x.trim();--->Remove os espaços do inicio e fim da string 
*		
 */

/*		String s = "ABCDEFG";
		System.out.println(s.replaceAll("[A,C,E,G]", ""));
		System.out.println(s.toLowerCase());
		
	

*/
public class NovidadesString {
	public static void main(String[] args){
		String x = "abc";
		String str="";
		 char [] k = x.toCharArray();
		
		int i =k.length-1;
		for(;i>=0;i--){
		 	str=str+k[i];
			
		 }
		System.out.println(str); 
	}
}	
