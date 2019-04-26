
public class Professor extends Pessoa {
		protected String dataDeAdmissao;
		protected int valorHora,horasDeAulaMes;
		protected double salario;
		
		
		
		
		public String getDataDeAdmissao() {
			return dataDeAdmissao;
		}




		public void setDataDeAdmissao(String dataDeAdmissao) {
			this.dataDeAdmissao = dataDeAdmissao;
		}




		public int getValorHora() {
			return valorHora;
		}




		public void setValorHora(int valorHora) {
			this.valorHora = valorHora;
		}




		public int getHorasDeAulaMes() {
			return horasDeAulaMes;
		}




		public void setHorasDeAulaMes(int horasDeAulaMes) {
			this.horasDeAulaMes = horasDeAulaMes;
		}




		public double getSalario() {
			return salario;
		}




		public void calcularSalario()
		{
			this.salario=this.valorHora* this.horasDeAulaMes;
		}
		
}
