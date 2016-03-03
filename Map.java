
public class Map {
	Case[][] carte = new Case[11][11];
	
	Map(){
		for(int i = 0 ; i < 11 ; i++){
			for(int j = 0 ; j < 11 ; j++){
				if(i == 0 || j == 0 || i == 10 || j == 10){
					carte[i][j] =  new Case(i,j,"eau");
				}else{
					carte[i][j] = new Case(i,j,"vide");
				}
			}
		}
	}
		
		void afficher(){
			System.out.println("---------------------------------------------");
			for(int i = 0 ; i < 11 ; i++){
				System.out.print("| ");
				for(int j = 0 ; j < 11 ; j++ ){
					System.out.print( carte[i][j] + " | ");
				}
				System.out.println();
				System.out.println("---------------------------------------------");
				
			}
		}
	}

