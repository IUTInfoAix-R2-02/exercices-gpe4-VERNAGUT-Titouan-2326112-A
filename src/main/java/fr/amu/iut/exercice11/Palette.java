package fr.amu.iut.exercice11;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

@SuppressWarnings("Duplicates")
public class Palette extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private Label texteDuHaut;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;
    private Pane panneau;
    private HBox boutons;

    private Label texteDuBas;


    @Override
    public void start(Stage primaryStage) {
        root = new BorderPane();

        texteDuHaut = new Label();
        texteDuHaut.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        BorderPane.setAlignment(texteDuHaut, Pos.CENTER);

        panneau = new Pane();
        panneau.setPrefSize(400, 200);

        VBox bas = new VBox();
        boutons = new HBox(10);
        boutons.setAlignment(Pos.CENTER);
        boutons.setPadding(new Insets(10, 5, 10, 5));
        texteDuBas = new Label();
        bas.setAlignment(Pos.CENTER_RIGHT);
        bas.getChildren().addAll(boutons, texteDuBas);

        vert = new Button("Vert");
        rouge = new Button("Rouge");
        bleu = new Button("Bleu");

        /* VOTRE CODE ICI */
        this.texteDuHaut=new Label();
        this.texteDuHaut.setAlignment( Pos.CENTER );

        vert.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            this.nbVert=this.nbVert+1;
            panneau.setStyle("-fx-background-color: #00FF00; -fx-text-fill: white;");
            this.texteDuHaut.setText("Vert choisi "+this.nbVert+" fois");
            this.texteDuBas.setText("le vert est une joli couleur!");
            this.texteDuBas.setStyle("-fx-text-fill: green;");

        });
        bleu.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            this.nbBleu=this.nbBleu+1;
            panneau.setStyle("-fx-background-color: #0000FF; -fx-text-fill: white;");
            this.texteDuHaut.setText("Bleu choisi "+this.nbBleu+" fois");
            this.texteDuBas.setText("le bleu est une joli couleur!");
            this.texteDuBas.setStyle("-fx-text-fill: blue;");

        });
        rouge.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            this.nbRouge=this.nbRouge+1;
            panneau.setStyle("-fx-background-color: #FF0000; -fx-text-fill: white;");
            this.texteDuHaut.setText("Rouge choisi "+this.nbRouge+" fois");
            this.texteDuBas.setText("le rouge est une joli couleur!");
            this.texteDuBas.setStyle("-fx-text-fill: red;");

        });




        boutons.getChildren().addAll(vert, rouge, bleu);

        root.setCenter(panneau);
        root.setTop(texteDuHaut);

        root.setBottom(bas);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

