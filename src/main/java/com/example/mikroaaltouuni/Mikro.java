package com.example.mikroaaltouuni;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Mikro extends Application {
    @Override
    public void start(Stage stage) {
        Pane paneeli = new Pane();
        Image kuva = new Image("file:<FILE_LOCATION>");      //Kuva
        ImageView kuvapohja = new ImageView(kuva);
        kuvapohja.setFitHeight(150);
        kuvapohja.setFitWidth(175);
        paneeli.getChildren().add(kuvapohja);

        Rectangle aika = new Rectangle(175, 30);       //Näyttö
        aika.setFill(Color.WHITE);
        aika.setStroke(Color.BLACK);
        aika.setX(175);
        aika.setY(0);

        Text kello = new Text("0:00");      //Ajastin
        kello.setFill(Color.BLACK);
        kello.setX(250);
        kello.setY(20);
        kello.setFont(Font.font("Calibri", 20));
        paneeli.getChildren().addAll(aika, kello);

        Button n1 = new Button("1");    //Numero 1 -nappi
        n1.setLayoutX(175);
        n1.setLayoutY(30);
        n1.setStyle("-fx-pref-width: 58px; -fx-pref-height: 30px;");
        paneeli.getChildren().add(n1);

        Button n2 = new Button("2");    //Numero 2 -nappi
        n2.setLayoutX(233);
        n2.setLayoutY(30);
        n2.setStyle("-fx-pref-width: 58px; -fx-pref-height: 30px;");
        paneeli.getChildren().add(n2);

        Button n3 = new Button("3");    //Numero 3 -nappi
        n3.setLayoutX(291);
        n3.setLayoutY(30);
        n3.setStyle("-fx-pref-width: 58px; -fx-pref-height: 30px;");
        paneeli.getChildren().add(n3);

        Button n4 = new Button("4");    //Numero 4 -nappi
        n4.setLayoutX(175);
        n4.setLayoutY(60);
        n4.setStyle("-fx-pref-width: 58px; -fx-pref-height: 30px;");
        paneeli.getChildren().add(n4);

        Button n5 = new Button("5");    //Numero 5 -nappi
        n5.setLayoutX(233);
        n5.setLayoutY(60);
        n5.setStyle("-fx-pref-width: 58px; -fx-pref-height: 30px;");
        paneeli.getChildren().add(n5);

        Button n6 = new Button("6");    //Numero 6 -nappi
        n6.setLayoutX(291);
        n6.setLayoutY(60);
        n6.setStyle("-fx-pref-width: 58px; -fx-pref-height: 30px;");
        paneeli.getChildren().add(n6);

        Button n7 = new Button("7");    //Numero 7 -nappi
        n7.setLayoutX(175);
        n7.setLayoutY(90);
        n7.setStyle("-fx-pref-width: 58px; -fx-pref-height: 30px;");
        paneeli.getChildren().add(n7);

        Button n8 = new Button("8");    //Numero 8 -nappi
        n8.setLayoutX(233);
        n8.setLayoutY(90);
        n8.setStyle("-fx-pref-width: 58px; -fx-pref-height: 30px;");
        paneeli.getChildren().add(n8);

        Button n9 = new Button("9");    //Numero 9 -nappi
        n9.setLayoutX(291);
        n9.setLayoutY(90);
        n9.setStyle("-fx-pref-width: 58px; -fx-pref-height: 30px;");
        paneeli.getChildren().add(n9);

        Button n0 = new Button("0");    //Numero 0 -nappi
        n0.setLayoutX(175);
        n0.setLayoutY(120);
        n0.setStyle("-fx-pref-width: 58px; -fx-pref-height: 30px;");
        paneeli.getChildren().add(n0);

        Button start = new Button("Start");    //Start-nappi
        start.setLayoutX(233);
        start.setLayoutY(120);
        start.setStyle("-fx-pref-width: 58px; -fx-pref-height: 30px;");
        paneeli.getChildren().add(start);

        Button stop = new Button("Stop");    //Stop-nappi
        stop.setLayoutX(291);
        stop.setLayoutY(120);
        stop.setStyle("-fx-pref-width: 58px; -fx-pref-height: 30px;");
        paneeli.getChildren().add(stop);

        Scene scene = new Scene(paneeli, 350, 150);
        stage.setTitle("Mikroaaltouuni edesta");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}