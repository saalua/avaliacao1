//LUANA DOS SANTOS DA CONCEIÇÃO
package avaliacao;

public class Ipva extends Veiculo{
		
		private double valorIpva; 
		private double taxaLicenciamento;
					
		public Ipva(String modelo, String placa, String combustivel, double valorVeiculo, double taxaLicenciamento) {
			super(modelo, placa, combustivel, valorVeiculo);
			this.taxaLicenciamento = taxaLicenciamento;
		}


		@Override
		public String toString() {
			return "Valor IPVA: " + valorIpva + "\nTaxa Licenciamento: " + taxaLicenciamento + "\nModelo: " + modelo
					+ "\nPlaca: " + placa + "\nCombustivel: " + combustivel + "\nValor do Veiculo: " + valorVeiculo;
		}


		public double getValorIpva() {
			return valorIpva;
		}


		public void setValorIpva(double valorIpva) {
			this.valorIpva = valorIpva;
		}



		public void calcularIpva() {
			
			if(this.getCombustivel().equalsIgnoreCase("gás")) {
				valorIpva = this.getValorVeiculo() * 0.01 + taxaLicenciamento;
			} else if (this.getCombustivel().equalsIgnoreCase("flex")) {
				valorIpva = this.getValorVeiculo() * 0.03 + taxaLicenciamento;
			} else {
				valorIpva = this.getValorVeiculo() * 0.04 + taxaLicenciamento;
			}
		}

		
}

