
package Questão_2;
import java.util.*;


public class Main {

   
    public static void main(String[] args){
    	try{
    	
    		
    		Set<String> conjunto = new HashSet<String>();
    		conjunto.add("080949343-23#Arthur Novaes Moura#34");
    		conjunto.add("310949321-44#Erika da Silva Souza#30");
    		conjunto.add("666949343-59#Jureg Camus Moura#40");
    		conjunto.add("#sdvsdf#455564#gfsdfg#sfgftyu#fghhgfhg");

        
        	Map<String, Pessoa> m = Utils.retornaDados(conjunto);
        	Iterator<Pessoa> iter = m.values().iterator();
        	while(iter.hasNext()){
        		
        		System.out.println(iter.next());
        	}
        	
        
        }
        catch(FormatoIncorretoException e){
        	System.out.println(e.getMessage());
        }
    }
    

}
