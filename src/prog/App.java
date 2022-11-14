package prog;

public class App {

	public static void main(String[] args) {

		PaletteDeCouleur[] jocondeCouleur = {PaletteDeCouleur.BLEU, PaletteDeCouleur.ROUGE, PaletteDeCouleur.VERT};
		Peinture joconde = new Peinture("Joconde", "peinture", 1954, 2500, "Toile", "Pinceau", jocondeCouleur);
		
		Peinture laCene = new Peinture("Cene", "peinture", 1754, 156, "peinture murale", "Crayon", jocondeCouleur);

		Oeuvre[] leonardOeuvre = {joconde, laCene};

		Artist leonardDeVinci = new Artist("DeVinci", "Leonard", "leodu33", 53, leonardOeuvre);

		leonardDeVinci.afficher();


	}

}
