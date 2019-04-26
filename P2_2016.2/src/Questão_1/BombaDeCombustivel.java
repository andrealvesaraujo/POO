package Questão_1;
import java.util.Iterator;
import java.util.List;

public class BombaDeCombustivel {

	private double utilizado;
	
	public double getQtdeCombustivelUtilizado(){
		return this.utilizado;
	}
	public void abastecerVeiculos(List<VeiculoAutomotor> L){
	
		/*for(int i=0;i<L.size();i++){
			this.utilizado +=((VeiculoAutomotor) L.get(i)).completarTanque();
		}*/
		Iterator<VeiculoAutomotor> it = L.iterator();
		while(it.hasNext()){
			VeiculoAutomotor v = it.next();
			this.utilizado += v.completarTanque();
		}
		
	}
}
