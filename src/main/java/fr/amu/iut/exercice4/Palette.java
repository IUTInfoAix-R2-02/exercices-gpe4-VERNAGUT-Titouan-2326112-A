package fr.amu.iut.exercice4;

import com.example.partie2.BonjourFenetre;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import static javafx.scene.text.Font.font;

public class Palette extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;
    private Label label;
    private Pane panneau;
    private HBox bas;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.root=new BorderPane();
        this.panneau=new Pane();
        this.root.setCenter(panneau);
        HBox bottom=new HBox();
        HBox hbox=new HBox();
        bottom.setAlignment( Pos.CENTER );
        this.vert=new Button("Vert");
        this.bleu=new Button("Bleu");
        this.rouge=new Button("Rouge");
        bottom.getChildren().addAll(vert,bleu,rouge);
        root.setBottom(bottom);
        this.label=new Label();
        this.label.setAlignment( Pos.CENTER );

        vert.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            this.nbVert=this.nbVert+1;
            panneau.setStyle("-fx-background-color: #00FF00; -fx-text-fill: white;");
            this.label.setText("Vert choisi "+this.nbVert+" fois");

        });
        bleu.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            this.nbBleu=this.nbBleu+1;
            panneau.setStyle("-fx-background-color: #0000FF; -fx-text-fill: white;");
            this.label.setText("Bleu choisi "+this.nbBleu+" fois");

        });
        rouge.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            this.nbRouge=this.nbRouge+1;
            panneau.setStyle("-fx-background-color: #FF0000; -fx-text-fill: white;");
            this.label.setText("Rouge choisi "+this.nbRouge+" fois");
        });
        this.root.setTop(label);


        Scene scene = new Scene(root);
        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 400 );
        primaryStage.setHeight( 200 );
        primaryStage.setTitle("Exo4");
        // Affichage de la fenêtre
        primaryStage.show();
    }
}

