
public abstract class Personagem implements Comparable<Personagem>{
	
	protected int vida = 100;
	
	public int getVida() {
		return vida;
	}
	
	public void setVida(int vida) {
		
		if(vida < 0) {
			this.vida = 0;
		}else if(vida > 100) {
			this.vida = 100;
		}else {
			this.vida = vida;
		}
		
	}
	
		@Override
		public int compareTo(Personagem other)
		{
			return Integer.compare(this.vida, other.vida);
		}
	
		@Override
		public String toString() {
			return ""+vida;
		}
}

