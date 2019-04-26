package contas_distintas;

public class GerenciadorDeImpostoDeRenda {
		private double totalDeTributos;
		
		public double getTotalDeTributos(){
			return this.totalDeTributos;
		}
		
		public void adicionarTributo(Tributavel t){
			this.totalDeTributos+=t.calcularTributo();
		}
}
