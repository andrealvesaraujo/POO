
public class Loucura {
	public static void main(String args[]){
		String x = "O meu link é http://www.youtube.com/id=45 e eu quero que visitem";
		int num = x.indexOf("http://www.youtube.com/id=45");
		String aux = x.substring(num,x.length());
		int space = aux.indexOf(" ");
		String link = x.substring(num, space);
		String r = x.replaceAll(link,"");
		System.out.println(r);
	}
}
