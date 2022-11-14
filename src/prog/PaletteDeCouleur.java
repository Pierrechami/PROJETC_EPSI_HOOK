package prog;

public enum PaletteDeCouleur {
    ROUGE("Rouge"),
    VERT("Vert"),
    BLEU("Bleu"),
    JAUNE("Jaune"),
    BLANC("Blanc"),
    ROSE("Rose");

    String couleur;

    PaletteDeCouleur(String couleur){
        this.couleur = couleur;
    }
}
