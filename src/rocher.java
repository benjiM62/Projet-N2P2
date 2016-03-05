import java.util.Random;

public class rocher {
	/*attribut

	int position_x
	int position_y
	char symbole='R';


	 **Méthodes

	boolean rocherATresor(int position_x ,int position_y){
	}

	boolean rocherAClef(int position_x,int position_y){
	}

	void placerRocher(Rocher rocher){
	]

	String souleverRocher(Rocher rocher){
	}

	void rocherAccesible{
	}

	String toString{
	}



	 ***Constructeur
	Rocher(){
	}

	Rocher(int nombrerocher){
	}

	Rocher(int position_x,int position_y){
	}

	Rocher(int pourcentage){
	}

	 */
	
	public String toString(){
		return("+---+" \n "|   |"\n);
	}


	private genererRocher(Map carte){
		boolean ok=false;
		while(!ok){
			Random alea = new Random();
			int nb;
			for (int i=1;i<carte.length;i++){
				for (int j=1;i<carte[0].length;j++){
					nb=alea.nextInt(100);
					if(nb < 10){
						carte[i][j] = new Case(i, j, "rocher");
					} else{
						carte[i][j] = new Case(i, j, "vide");
					}
				}
			}

		}
	}
}
