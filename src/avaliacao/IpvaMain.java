//LUANA DOS SANTOS DA CONCEIÇÃO
package avaliacao;

public class IpvaMain {

	public static void main(String[] args) {
		
		Ipva veiculo1 = new Ipva("Sandero", "1vc-5430", "gás", 55000, 125);
		Ipva veiculo2 = new Ipva("Fiesta", "Mvc-1212", "flex", 40000, 140);

		veiculo1.calcularIpva();
		veiculo2.calcularIpva();
		
		System.out.println(veiculo1);
		System.out.println();
		System.out.println(veiculo2); 	
	}

}
