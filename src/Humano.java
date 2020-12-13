
public class Humano extends Personagem{
	private int inteligencia;
	private int velocidade;
	private int equipamentos;
  
	public Humano(int inteligencia, int velocidade, int equipamentos) {
		this.inteligencia = inteligencia;
		this.velocidade = velocidade;
		this.equipamentos = equipamentos;
	}
	
	public int getInteligencia() {
		return inteligencia;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public int getEquipamentos() {
		return equipamentos;
	}
}
