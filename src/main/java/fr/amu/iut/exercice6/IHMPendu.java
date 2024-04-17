package fr.amu.iut.exercice6;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
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

        Button a=new Button("A");
        Button e=new Button("E");
        Button i=new Button("I");
        Button o=new Button("O");
        Button u=new Button("U");
        Button y=new Button("Y");
        HBox ae=new HBox();
        ae.getChildren().addAll(a,e,i,o,u,y);
        ae.setAlignment(Pos.CENTER);

        
        Button b=new Button("B");
        Button c=new Button("C");
        Button d=new Button("D");
        Button f=new Button("F");
        Button g=new Button("G");
        Button h=new Button("H");
        Button j=new Button("J");
        Button k=new Button("K");
        Button l=new Button("L");
        Button m=new Button("M");
        HBox bm=new HBox();
        bm.getChildren().addAll(b,c,d,f,g,h,j,k,l,m);
        bm.setAlignment(Pos.CENTER);
        Button n=new Button("N");
        Button p=new Button("P");
        Button q=new Button("Q");
        Button r=new Button("R");
        Button s=new Button("S");
        Button t=new Button("T");
        Button v=new Button("V");
        Button w=new Button("W");
        Button x=new Button("X");
        Button z=new Button("Z");
        root.setBottom(lettre);
        HBox boutonbas=new HBox();
        Button rejouer=new Button("Rejoue Pélo");
        boutonbas.getChildren().add(rejouer);
        boutonbas.setAlignment(Pos.CENTER);
        HBox nz=new HBox();
        nz.getChildren().addAll(n,p,q,r,s,t,v,w,x,z);
        nz.setAlignment(Pos.CENTER);
        TextField barre=new TextField();
        barre.setAlignment(Pos.CENTER);
        lettre.getChildren().addAll(
                barre,
                ae,
                bm,
                nz,
                boutonbas
        );
        root.setBottom(lettre);
        VBox mot = new VBox();
        HBox vies=new HBox();

        int vie = 7;
        Label nbrevie=new Label("nombre de vie: "+ vie);

        Dico dico = new Dico();
        String motCache = dico.getMot();
        String motCacheAffiche = "";
        for (int I = 0; I < motCache.length(); I++) {
            motCacheAffiche += "*";
        }
        Label etiquette = new Label(motCacheAffiche);
        etiquette.setStyle("-fx-font-size: 20px;");
        mot.getChildren().addAll(nbrevie,etiquette);
        mot.setAlignment(Pos.CENTER);
        root.setCenter(mot);
        a.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'z');
        });
        z.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'z');
        });
        e.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'e');
        });
        r.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'r');
        });
        t.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 't');
        });
        y.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'y');
        });
        u.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'u');
        });
        i.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'i');
        });
        o.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'o');
        });
        p.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'p');
        });
        q.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'q');
        });
        s.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 's');
        });
        d.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'd');
        });
        f.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'f');
        });
        g.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'g');
        });
        h.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'h');
        });
        j.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'j');
        });
        k.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'k');
        });
        l.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'l');
        });
        m.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'm');
        });
        w.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'w');
        });
        x.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'x');
        });
        c.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'c');
        });
        v.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'v');
        });
        b.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'b');
        });
        n.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            barre.setText(barre.getText() + 'n');
        });




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
