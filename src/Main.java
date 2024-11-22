public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 50);
        Departement d2 = new Departement(2, "Ressources Humaines", 20);
        Departement d3 = new Departement(3, "Finance", 30);

        // Ajouter des départements
        gestionDepartements.ajouterDepartement(d1);
        gestionDepartements.ajouterDepartement(d2);
        gestionDepartements.ajouterDepartement(d3);

        // Afficher les départements
        System.out.println("Liste des départements :");
        gestionDepartements.displayDepartement();

        // Rechercher un département
        System.out.println("\nRechercher 'Informatique' : " + gestionDepartements.rechercherDepartement("Informatique"));

        // Trier par ID
        System.out.println("\nDépartements triés par ID :");
        gestionDepartements.trierDepartementById().forEach(System.out::println);

        // Supprimer un département
        gestionDepartements.supprimerDepartement(d2);
        System.out.println("\nListe des départements après suppression :");
        gestionDepartements.displayDepartement();
    }
}
