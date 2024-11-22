import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class DepartementHashSet implements IDepartement {
    private HashSet<Departement> departements;

    // Constructeur
    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }

    // Ajouter un département
    @Override
    public boolean ajouterDepartement(Departement d) {
        return departements.add(d);
    }

    // Supprimer un département
    @Override
    public boolean supprimerDepartement(Departement d) {
        return departements.remove(d);
    }



    // Lister tous les départements
    public HashSet<Departement> getDepartements() {
        return departements ; 
    }
}
