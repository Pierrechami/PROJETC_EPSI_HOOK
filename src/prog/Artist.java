package prog;

public class Artist implements Affichable{
    String nom;
    String prenom;
    String pseudo;
    int age;
    Oeuvre[] listeOeuvre;

    Artist(String nom, String prenom, String pseudo, int age, Oeuvre[] listeOeuvre){
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.age = age;
        this.listeOeuvre = listeOeuvre;
    }

    //@Override
    public void afficher() {
        for (int i = 0; i < listeOeuvre.length; i++) {
            System.out.println("Voici les oeuvres de " + nom);
            listeOeuvre[i].afficher();
        }    
    }   
}
