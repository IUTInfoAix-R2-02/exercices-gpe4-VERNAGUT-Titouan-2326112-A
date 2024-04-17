package fr.amu.iut.exercice6;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class IHMPendu extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root=new BorderPane();
        VBox lettre=new VBox();

        TextField a=new TextField("A");
        TextField e=new TextField("E");
        TextField i=new TextField("I");
        TextField o=new TextField("O");
        TextField u=new TextField("U");
        TextField y=new TextField("Y");
        HBox ae=new HBox();
        ae.getChildren().addAll(a,e,i,o,u,y);
        ae.setAlignment(Pos.CENTER);
        TextField b=new TextField("B");
        TextField c=new TextField("C");
        TextField d=new TextField("D");
        TextField f=new TextField("F");
        TextField g=new TextField("G");
        TextField h=new TextField("H");
        TextField j=new TextField("J");
        TextField k=new TextField("K");
        TextField l=new TextField("L");
        TextField m=new TextField("M");
        HBox bm=new HBox();
        bm.getChildren().addAll(b,c,d,f,g,h,j,k,l,m);
        bm.setAlignment(Pos.CENTER);
        TextField n=new TextField("N");
        TextField p=new TextField("P");
        TextField q=new TextField("Q");
        TextField r=new TextField("R");
        TextField s=new TextField("S");
        TextField t=new TextField("T");
        TextField v=new TextField("V");
        TextField w=new TextField("W");
        TextField x=new TextField("X");
        TextField z=new TextField("Z");
        root.setBottom(lettre);
        HBox boutonbas=new HBox();
        Button rejouer=new Button("Rejoue Pélo");
        boutonbas.getChildren().add(rejouer);
        boutonbas.setAlignment(Pos.CENTER);
        HBox nz=new HBox();
        nz.getChildren().addAll(n,p,q,r,s,t,v,w,x,z);
        nz.setAlignment(Pos.CENTER);
        lettre.getChildren().addAll(
                ae,
                bm,
                nz,
                boutonbas
        );
        root.setBottom(lettre);
        HBox mot=new HBox();
        Dico newDick=new Dico();
        String motCache = new String();
        motCache=newDick.getMot();
        for(int I=0 ; I<motCache.length();I++){
            motCache=motCache+"*";
        }
        Label etiquette=new Label(motCache);
        mot.getChildren().addAll(etiquette);
        root.setCenter(etiquette);

        primaryStage.setTitle("Jeu du pendu");

        primaryStage.setWidth(500);
        primaryStage.setHeight(550);
        root.setStyle("-fx-background-color: turquoise blue; -fx-text-fill: white;");
        // A completer
        Scene scene = new Scene(root);
        primaryStage.setScene( scene );
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
