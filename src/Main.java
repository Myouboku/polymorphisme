import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Personne pers1 = new Personne("Doe", "John", null);
        Personne pers2 = new Personne("Doe", "Jane", null);
        Personne pers3 = new Personne("Doe", "Jack", null);

        Personne[] tPers = {
                new Enseignant_Permanent(pers1.getNom(), pers1.getPrenom(), null),
                new Enseignant_Doctorant(pers2.getNom(), pers2.getPrenom(), null),
                new Enseignant_Vacataire(pers3.getNom(), pers3.getPrenom(), null)
        };

        Enseignement[] tEns = {
                new Cours(),
                new TD(),
                new TP()
        };

        for(int i = 0; i < tPers.length; i++) {
            tPers[i].setEnseignement(tEns[i]);
            tPers[i].enseigner();
            tPers[i].getEnseignement();
        }
    }
}