package prog;

public class Oeuvre {
    String nom;
    String style; //peinture ou sculpture
    int anneeDeParution;
    float prixDeVente;

    Oeuvre(String nom, String style, int anneeDeParution, float prixDeVente){
        this.nom = nom;
        this.style = style;
        this.anneeDeParution = anneeDeParution;
        this.prixDeVente = prixDeVente;
    }

    public void afficher(){
        System.out.println("L'oeuvre s'appelle " + nom);
        System.out.println("C'est une " + style );
        System.out.println("sortie en " + anneeDeParution);
        System.out.println("pour la somme de "+ prixDeVente);
    }

}
