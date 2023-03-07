public class Personne {
    protected String nom;
    protected String prenom;
    protected Enseignement ens;

    public Personne(String nom, String prenom, Enseignement ens) {
        this.nom = nom;
        this.prenom = prenom;
        this.ens = ens;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void enseigner() {
        ens.Ienseigner();
    }

    protected void setEnseignement(Enseignement ens) {
        this.ens = ens;
    }

    public String getEnseignement() {
        return getNom() + " " + getPrenom();
    }
}
