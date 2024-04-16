package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.security.cert.PolicyNode;

public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) {
        // code de l'exercice 1
        // Création du conteneur principal
        VBox vbox = new VBox();
        VBox truc= new VBox();
        HBox align=new HBox();
        Separator sep2=new Separator();
        sep2.setOrientation(Orientation.VERTICAL);
        BorderPane root = new BorderPane();
        // Création du conteneur correspondant à la ligne de contrôle haut dessus du tableau
        HBox topControls = new HBox();

        Menu fileMenu= new Menu("File");
        Menu editMenu= new Menu("edit");
        Menu helpMenu= new Menu("Help");

        MenuItem newItem= new MenuItem("New");
        MenuItem openItem= new MenuItem("Open File");
        MenuItem saveItem= new MenuItem("Save");
        MenuItem closeItem= new MenuItem("Close");
        fileMenu.getItems().addAll(newItem,openItem,saveItem,closeItem);

        MenuItem cutItem=new MenuItem("Cut");
        MenuItem copyItem=new MenuItem("Copy");
        MenuItem pasteItem=new MenuItem("Paste");
        editMenu.getItems().addAll(
                cutItem,
                copyItem,
                pasteItem
        );
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu,editMenu,helpMenu);
        root.setTop(menuBar);
        topControls.getChildren().addAll(menuBar);



        VBox leftControl = new VBox();
        leftControl.setAlignment( Pos.CENTER_LEFT );
        Label bouton = new Label("Boutons : ");
        Button bouton1 = new Button("Bouton 1");
        Button bouton2 = new Button("Bouton 2");
        Button bouton3 = new Button("Bouton 3");
        leftControl.getChildren().add(bouton);
        leftControl.getChildren().add(bouton1);
        leftControl.getChildren().add(bouton2);
        leftControl.getChildren().add(bouton3);
        root.setLeft(leftControl);
        VBox.setMargin(bouton1, new Insets(15, 15, 15, 15));
        VBox.setMargin(bouton2, new Insets(15, 15, 15, 15));
        VBox.setMargin(bouton3, new Insets(15, 15, 15, 15));

        // Création du tableau avec les deux colonnes
        VBox table=new VBox();
        HBox email=new HBox();
        HBox name=new HBox();
        HBox password=new HBox();

        Label Name=new Label("Name:          ");
        TextField champName= new TextField("Entrez votre nom:");
        Label Email=new Label("Email:          ");
        TextField champEmail= new TextField("Entrez votre Email:");
        Label Password=new Label("Password:    ");
        TextField champPassword= new TextField("Entrez votre mot de passe: ");
        name.getChildren().addAll(Name,champName);
        email.getChildren().addAll(Email,champEmail);
        password.getChildren().addAll(Password,champPassword);

        VBox.setMargin(name, new Insets(15, 15, 15, 15));
        VBox.setMargin(email, new Insets(15, 15, 15, 15));
        VBox.setMargin(password, new Insets(15, 15, 15, 15));

        HBox hori=new HBox();
        Button submit = new Button("Submit");
        Button cancel = new Button("Cancel");
        HBox.setMargin(submit, new Insets(25, 15, 15, 30));
        HBox.setMargin(cancel, new Insets(25, 15, 15, 30));

        hori.getChildren().addAll(submit,cancel);
        table.getChildren().addAll( name,email,password,hori);
        // Création de la ligne de séparation
        Separator sep = new Separator();

        // Création du bandeau en bas de la fenêtre

        Label etiquette = new Label("Ceci est un label de bas de page");



        align.getChildren().addAll(leftControl,sep2,truc);
        truc.getChildren().addAll(table);
        // Ajout des contrôleurs au conteneur principal
        vbox.getChildren().addAll(
                topControls,
                align,
                sep,
                etiquette

        );

        // Ajout du conteneur à la scene
        Scene scene = new Scene(vbox );

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 500 );
        primaryStage.setHeight( 350 );
        primaryStage.setTitle("VBox and HBox App");

        // Affichage de la fenêtre
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);

    }
}
