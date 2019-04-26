
public abstract class Quadrilateros implements FormasG{
		private double lados[] = new double[4];
		
		public double[] getLados(){
			return lados;
		}
		
		public Quadrilateros(double l1,double l2,double l3,double l4){
			this.lados[0]=l1;
			this.lados[1]=l2;
			this.lados[2]=l3;
			this.lados[3]=l4;
		}
		public double perimetro(){
			return lados[0]+lados[1]+lados[2]+lados[3];
		} 
}
