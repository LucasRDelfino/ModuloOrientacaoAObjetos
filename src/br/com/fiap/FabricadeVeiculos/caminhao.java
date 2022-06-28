package br.com.fiap.FabricadeVeiculos;

public class caminhao extends Veiculo {
	private String eixo,carroceria;
	private int carga;




	




	public caminhao(String marca, String roda, String cambio, String motor, String modelo, String cor, String renavam,
			String nomeMotorista, String placa, int anoFabricacao, int anoModelo, double velocidade, double tanque,
			double capacidadeltrs, String eixo, String carroceria, int carga) {
		super(marca, roda, cambio, motor, modelo, cor, renavam, nomeMotorista, placa, anoFabricacao, anoModelo,
				velocidade, tanque, capacidadeltrs);
		this.eixo = eixo;
		this.carroceria = carroceria;
		this.carga = carga;
	}









	@Override
	public  void exibirDados() {
		System.out.println("Marca : " + this.marca);
		System.out.println("Modelo : " + this.modelo);
		System.out.println("Cor : " + this.cor);
		System.out.println("Ano de Fabricação : " + this.anoFabricacao);
		System.out.println("Ano modelo : " + this.anoModelo);
		System.out.println("Renavam : " + this.renavam);
		System.out.println("Motor : " + this.motor);
		System.out.println("Cambio : " + this.cambio);
		System.out.println("Aro da Roda : " + this.roda);
		System.out.println("Velocidade : " + this.velocidade);
		System.out.println("Condutor : " + this.nomeMotorista);
		System.out.println("Placa : " + this.placa);
		System.out.println("Eixo : " + this.eixo);
		System.out.println("Carroceria : " + this.carroceria);
		System.out.println("Carga : " + this.carga);
		
	}

}
