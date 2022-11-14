package prog;

import java.util.ArrayList;
import java.util.List;

public class Peinture extends Oeuvre {

    String support; // toile, mur...
    String materiel; // crayon....
    List<PaletteDeCouleur> couleurUtilise;
    
    Peinture(String nom, String style, int anneeDeParution, float prixDeVente, String support, String materiel, PaletteDeCouleur[] couleurSurPaletteDuPeintre) {
        super(nom, style, anneeDeParution, prixDeVente);
        this.support = support;
        this.materiel = materiel;

        this.couleurUtilise = new ArrayList<PaletteDeCouleur>();
        for (int i = 0; i < couleurSurPaletteDuPeintre.length; i++) {
            this.couleurUtilise.add(couleurSurPaletteDuPeintre[i]);
        }

    }

    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Voici les détails de la peinture : ");
        System.out.println("Peinture de type : "+support);
        System.out.println("Faites avec un "+materiel);
        System.out.println("Voici la liste des couleurs utilisées pour cette peinture :");
        for (int i = 0; i < couleurUtilise.size(); i++) {
            System.out.println(couleurUtilise.get(i).couleur);
        }
        
    }
    
    
    

}
