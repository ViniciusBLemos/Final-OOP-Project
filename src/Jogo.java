import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;

public class Jogo {

	public static void main(String[] args) {
		
		ArrayList <Orc> Orcs = new ArrayList(); 
		ArrayList <Humano> Humanos= new ArrayList();
		
		
		Random rand = new Random();
		
		for(int i = 0; i < 100; i++) {
			int orc_aleatorio = rand.nextInt(3);
			switch (orc_aleatorio)
			{
				case 0:
					Orcs.add(new Ogro());
				case 1:
					Orcs.add(new Mago());
				case 2:
					Orcs.add(new Demonio());
			}
		}
		
		for(int i = 0; i < 100; i++) {
			int humano_aleatorio = rand.nextInt(3);
			switch (humano_aleatorio)
			{
				case 0:
					Humanos.add(new Arqueiro());
				case 1:
					Humanos.add(new Soldado());
				case 2:
					Humanos.add(new Robo());
			}
		}
		
		
		for(int i = 0; i < 100; i++) {
			int orcPosition = rand.nextInt(Orcs.size());
			int humanoPosition = rand.nextInt(Humanos.size());
			
			System.out.println("Luta #" + (i+1));
			
			Personagem[] dupla = lutar(Orcs.get(orcPosition), Humanos.get(humanoPosition));
			
			Orcs.set(orcPosition, (Orc) dupla[0]);
			Humanos.set(humanoPosition, (Humano) dupla[1]);
			
		}
		System.out.println("Orcs:");
		System.out.println(Orcs.toString());
		
		System.out.println("Humanos:");
		System.out.println(Humanos.toString());
		
		int vidaOrcs = 0, vidaHumanos = 0;
		
		for(int i = 0; i < 100; i++) {
			vidaOrcs += Orcs.get(i).getVida();
			vidaHumanos += Humanos.get(i).getVida();
			
			}
		System.out.println("Total de vida dos Orcs: " + vidaOrcs);
		System.out.println("Total de vida dos Humanos: " + vidaHumanos);
		
		if(vidaOrcs < vidaHumanos) {
			System.out.println("Vencedor: Humanos");
			System.out.println("Humanos gritam: PELA ALIANÇAAAAA");
		}else {
			System.out.println("Vencedor: Orcs");
			System.out.println("Orcs gritam: PELA HORDAAAAA");
		}

	}
	
	private static Personagem[] lutar(Orc O, Humano H) {
		Random rand = new Random();
		int orcCaracteristica = rand.nextInt(3);
		int humanoCaracteristica = rand.nextInt(3);
		int orcAtributo = 0, humanoAtributo = 0, diferencaLuta = 0;
		
		switch (orcCaracteristica)
		{
			case 0:
				orcAtributo = O.getForca();
			case 1:
				orcAtributo = O.getHabilidade();
			case 2:
				orcAtributo = O.getAgilidade();
		}
		switch (humanoCaracteristica)
		{
			case 0:
				humanoAtributo = H.getInteligencia();
			case 1:
				humanoAtributo = H.getVelocidade();
			case 2:
				humanoAtributo = H.getEquipamentos();
		}
		
		diferencaLuta = Math.abs(orcAtributo - humanoAtributo);
		
		System.out.println(O + " vs " + H);
		
		if(orcAtributo < humanoAtributo) {
			O.setVida(O.getVida() - diferencaLuta);
			H.setVida(H.getVida() + diferencaLuta);
			System.out.println("Vencedor: "+ H);
			System.out.println("Perdedor: " + O);
		}else {
			O.setVida(O.getVida() + diferencaLuta);
			H.setVida(H.getVida() - diferencaLuta);
			System.out.println("Vencedor: " + O);
			System.out.println("Perdedor: " + H);
		}
		
		System.out.println("--------------------------------------------");
		return new Personagem[] {O, H};
	}
	
	
	
}
