

package Questão_2;


public class FormatoIncorretoException extends Exception{
    

	public FormatoIncorretoException(String n){
        super("O formato da string ["+n+"] esta incorreto");
        
    }
}
