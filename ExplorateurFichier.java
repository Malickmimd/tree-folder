public class ExplorateurFichier {
	public static void main(String[] args) {
		Fichier fichier1 = new Fichier("app", "js");
		Fichier fichier2 = new Fichier("index", "html");
		Fichier fichier3 = new Fichier("main", "ts");
		Fichier fichier4 = new Fichier("tsconfig", "ts");
		Fichier fichier5 = new Fichier("gitignore", "");
		Fichier fichier6 = new Fichier("vite.config", "ts");
		Fichier fichier7 = new Fichier("package", "json");
		Fichier fichier8 = new Fichier("package-lock", "json");

		Dossier dossier3 = new Dossier("React-Project");
		dossier3.addFile(fichier1);
		dossier3.addFile(fichier2);
		dossier3.addFile(fichier5);
		dossier3.addFile(fichier6);
		Dossier dossier2 = new Dossier("Mobile-app-project");
		dossier2.addFile(fichier3);
		dossier2.addFile(fichier4);
		dossier2.addFile(fichier7);
		dossier2.addFile(fichier8);
		Dossier dossier1 = new Dossier("Desktop");
		dossier1.addFile(dossier2);
		dossier1.addFile(dossier3);

		Composant dossier[] = {
				dossier1
		};

		for (Composant composant : dossier) {
			composant.display();
		}
	}
}
