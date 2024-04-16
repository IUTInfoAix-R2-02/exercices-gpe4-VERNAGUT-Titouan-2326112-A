package fr.amu.iut.exercice5;

import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JeuMain extends Application {

    private Scene scene;
    private BorderPane root;
    private Timeline gameTimer;
    @Override
    public void start(Stage primaryStage) {

        root = new BorderPane();

        //Acteurs du jeu
        Personnage pacman = new Pacman();
        Personnage fantome = new Fantome();
        Obstacle mur=new Obstacle();
        // on positionne le fantôme 20 positions vers la droite
        fantome.setLayoutX(20 * 10);
        //panneau du jeu
        Pane jeu = new Pane();
        jeu.setPrefSize(640, 480);
        jeu.getChildren().add(pacman);
        jeu.getChildren().add(fantome);
        jeu.getChildren().add(mur);
        root.setCenter(jeu);
        //on construit une scene 640 * 480 pixels
        scene = new Scene(root);

        //Gestion du déplacement du personnage
        deplacer(pacman, fantome,mur);

        primaryStage.setTitle("... Pac Man ...");

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    /**
     * Permet de gérer les événements de type clavier, pression des touches
     * pour le j1(up,down, right, left), pour le j2( z,q,s,d)
     *
     * @param j1
     * @param j2
     */
    private void deplacer(Personnage j1, Personnage j2,Obstacle mur) {
        scene.setOnKeyPressed((KeyEvent event) -> {
            double posJ1X=j1.getLayoutX();
            double posJ1Y=j1.getLayoutY();
            double posJ2X=j2.getLayoutX();
            double posJ2Y=j2.getLayoutY();
            switch (event.getCode()) {
                case LEFT:
                    j1.deplacerAGauche();
                    break;
                case RIGHT:
                    j1.deplacerADroite(scene.getWidth());
                    break;
                case DOWN:
                    j1.deplacerEnBas(scene.getWidth());
                    break;
                case UP:
                    j1.deplacerEnHaut();
                    break;
                case Q:
                    j2.deplacerAGauche();
                    break;
                case D:
                    j2.deplacerADroite(scene.getWidth());
                    break;
                case S:
                    j2.deplacerEnBas(scene.getWidth());
                    break;
                case Z:
                    j2.deplacerEnHaut();
                    break;
            }
            if (j1.estEnCollision(j2)){
                System.out.println("Collision...");
                System.exit(0);
            }
            if (j1.estEnCollision2(mur)) {
                j1.setLayoutX(posJ1X);
                j1.setLayoutY(posJ1Y);
            }
            if(j2.estEnCollision2(mur)){
                j2.setLayoutX(posJ2X);
                j2.setLayoutY(posJ2Y);
            }
        });
    }


}
