package Questão_2;


import java.util.*;


public class Utils {

        public boolean existe(List<Pessoa> x, Pessoa y){
            return x.contains(y);
        }

         public static Map<String, Pessoa> retornaDados(Set<String> conjuntoPessoas) throws FormatoIncorretoException{
             Map<String,Pessoa> m = new HashMap<String,Pessoa>();
             Iterator<String> ite = conjuntoPessoas.iterator();
             while(ite.hasNext()){
                 String str = ite.next();
                 String sep[] = str.split("#");
                 if(sep.length!=3){
                    throw new FormatoIncorretoException(str);
                 }
                
                Pessoa p = new Pessoa();
                p.setCpf(sep[0]);
                p.setNome(sep[1]);
                p.setIdade(Integer.parseInt(sep[2]));
                
                 
                m.put(sep[0],p);
             }

             return m;
         }

}
