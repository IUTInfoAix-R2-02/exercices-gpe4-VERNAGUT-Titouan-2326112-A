package fr.amu.iut.exercice14;

import javafx.beans.binding.IntegerBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;

@SuppressWarnings("Duplicates")
public class MainPersonnes {

    private static SimpleListProperty<Personne> lesPersonnes;
    private static IntegerProperty ageMoyen;
    private static IntegerProperty nbParisiens;

    private static IntegerBinding calculAgeMoyen;
    private static IntegerBinding calculNbParisiens;

    public static void main(String[] args) {

        lesPersonnes = new SimpleListProperty<>(FXCollections.observableArrayList());
        ageMoyen = new SimpleIntegerProperty(0);
        nbParisiens = new SimpleIntegerProperty(0);

        // Définir le binding pour l'âge moyen
        calculAgeMoyen = new IntegerBinding() {
            {
                super.bind(lesPersonnes);
            }

            @Override
            protected int computeValue() {
                if (lesPersonnes.isEmpty()) {
                    return 0;
                }
                int totalAge = 0;
                for (Personne p : lesPersonnes) {
                    totalAge += p.getAge();
                }
                return totalAge / lesPersonnes.size();
            }
        };
        ageMoyen.bind(calculAgeMoyen);

        // Définir le binding pour le nombre de Parisiens
        calculNbParisiens = new IntegerBinding() {
            {
                super.bind(lesPersonnes);
            }

            @Override
            protected int computeValue() {
                int count = 0;
                for (Personne p : lesPersonnes) {
                    if ("Paris".equals(p.getVilleDeNaissance())) {
                        count++;
                    }
                }
                return count;
            }
        };
        nbParisiens.bind(calculNbParisiens);

        // Test des bindings
        question1();
        question2();
    }

    public static void question1() {
        System.out.println("1 - L'âge est de " + ageMoyen.getValue() + " ans");
        Personne pierre = new Personne("Pierre", 20);
        lesPersonnes.add(pierre);
        System.out.println("2 - L'âge est de " + ageMoyen.getValue() + " ans");
        Personne paul = new Personne("Paul", 40);
        lesPersonnes.add(paul);
        System.out.println("3 - L'âge est de " + ageMoyen.getValue() + " ans");
        Personne jacques = new Personne("Jacques", 60);
        lesPersonnes.add(jacques);
        System.out.println("4 - L'âge est de " + ageMoyen.getValue() + " ans");
        paul.setAge(100);
        System.out.println("5 - L'âge est de " + ageMoyen.getValue() + " ans");
        lesPersonnes.remove(paul);
        System.out.println("6 - L'âge est de " + ageMoyen.getValue() + " ans");
    }

    public static void question2() {
        System.out.println("Il y a " + nbParisiens.getValue() + " Parisiens");
        lesPersonnes.get(0).setVilleDeNaissance("Marseille");
        System.out.println("Il y a " + nbParisiens.getValue() + " Parisiens");
        lesPersonnes.get(1).setVilleDeNaissance("Montpellier");
        System.out.println("Il y a " + nbParisiens.getValue() + " Parisiens");
        for (Personne p : lesPersonnes) {
            p.setVilleDeNaissance("Paris");
        }
        System.out.println("Il y a " + nbParisiens.getValue() + " Parisiens");
    }
}
