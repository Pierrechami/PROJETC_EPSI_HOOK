package prog;

public class Sculpture extends Oeuvre {
    String materiel;
    int taille;
    int poids;

    Sculpture(String nom, String style, int anneeDeParution, float prixDeVente, String materiel, int taille, int poids) {
        super(nom, style, anneeDeParution, prixDeVente);

        this.materiel = materiel;
        this.taille = taille;
        this.poids = poids;

    }

    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Voici les détails de la sculpture : ");
        System.out.println("Nous avons affaire ici à une sculpture faisant : "+ taille + " cm de haut");
        System.out.println("Son poids est de "+poids);
        System.out.println("Ici, nous l'artiste a décidé d'utiliser "+materiel+" pour faire cette superbe sculpture");
    }
    
}
