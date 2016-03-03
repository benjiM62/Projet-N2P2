
public class Case {
	int x ;
	int y ;
	String nom ;
	char visuel ;
	boolean traversable ;
	
	
	Case(int x , int y , String nom){
		this.x =  x ;
		this.y = y ;
		this.nom = nom ;
		if(nom == "vide"){
			this.traversable = true ;
			this.visuel = '.' ;
		}else{
			this.traversable = false ;
			if(nom == "eau"){
				this.visuel = '~' ;
			}
		}
		
	}
	public String toString(){
		return "" + visuel ;
	}

}
