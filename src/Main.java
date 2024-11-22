public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 50);
        Departement d2 = new Departement(2, "Ressources Humaines", 20);

        gestionDepartements.ajouterDepartement(d1);
        gestionDepartements.ajouterDepartement(d2);
        System.out.println("\nListe après ajout :");
        for (Departement d : gestionDepartements.getDepartements()) {
            System.out.println(d);
        }
 

        gestionDepartements.supprimerDepartement(d1);
        System.out.println("\nListe après suppression :");
        for (Departement d : gestionDepartements.getDepartements()) {
            System.out.println(d);
        }
    }
}
