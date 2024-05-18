public class Fichier extends Composant {
    private String nom, extension;

    public Fichier(String nom, String extension) {
        this.nom = nom;
        this.extension = extension;
    }

    public String getNom() {
        return nom;
    }

    public String getExtension() {
        return extension;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public void display() {
        displayName();
    }

    public void displayName() {
        System.out.printf(" %s.%s    \n", this.nom, this.extension);
    }
}
