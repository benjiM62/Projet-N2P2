import javax.swing.JOptionPane;
public class Menu {


	void Menu1(){
		String s="";
		boolean choix=true;
		s= JOptionPane.showInputDialog(null, "Chasse au trésor !Les aventures des pirates!\n "
				+ "Jouer ! 1\n"+"Les règles ! 2\n"+"Quitter le jeu :'( 3 \n");
		while(choix){
			if(s=="1"){
				choix=false;
			}
			if(s=="2"){
				JOptionPane d = new JOptionPane();
				int retour = JOptionPane.showConfirmDialog(null,"Jouer?","Question",JOptionPane.OK_CANCEL_OPTION);
				if(retour== ){
					s="2";
				}else{
					s="1";
				}
			}
			if(s=="3"){
				System.exit(0);
			}
		}
	}
}
