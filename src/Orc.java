
public class Orc extends Personagem{
	
	private int forca;
	private int habilidade;
	private int agilidade;
	
	public Orc(int forca, int habilidade, int agilidade) {
		this.forca = forca;
		this.habilidade = habilidade;
		this.agilidade = agilidade;
		
	}
	
	public int getForca() {
		return forca;
	}
	
	public int getHabilidade() {
		return habilidade;
	}
	
	public int getAgilidade() {
		return agilidade;
	}
}
