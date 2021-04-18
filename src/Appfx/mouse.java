/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Appfx;


import javafx.application.Application;

import static javafx.application.Application.launch;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Polyline;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.beans.property.SimpleDoubleProperty;


/**
 *
 * @author analopez
 */
public class mouse extends Application
{
    //check if implements
    //FXRegistration.java(****look***)
     //declaring required compo.
    //Group root;
    //try without private
    Button clearButton;
    Polyline polylines[];
    int numLines = 0; //current number of polylines
    Polyline shape = null; //current Polyline
    Pane drawPane; //pane for displaying drawing//flow plane?lecture exa. check
    //private SimpleDoubleProperty l1 = new SimpleDoubleProperty();*****check
    //private SimpleDoubleProperty l2 = new SimpleDoubleProperty();
    //private SimpleDoubleProperty l3 = new SimpleDoubleProperty();*******maybe not needed
    //private SimpleDoubleProperty l4 = new SimpleDoubleProperty();
    //private SimpleDoubleProperty l5 = new SimpleDoubleProperty();
    @Override
    public void start(Stage primaryStage) { 
        //VBox,hbox,children(),Pane
       //slide 33 example
       //try without private
        VBox vBox = new VBox();
        vBox.setSpacing(50);
        clearButton = new Button("Press to Clear");
        polylines = new Polyline[500];
        vBox.getChildren().addAll(clearButton);
        //Anchor????? 
        //initi. drawPane
        drawPane = new Pane();
        VBox root = new VBox(vBox, drawPane);
        //creating scene box
        Scene s = new Scene(root, 300, 350);//check for what is regular 19:36 lecture vid.(oct.16)
        primaryStage.setScene(s);
        primaryStage.setTitle("Polyline-Shape!");
        primaryStage.show();
        //mouse presser
        //firt lines then clear display
        //*********NO COLOR ASK*********
         //look at slide example(Control Cirlce line 40)
        s.setOnMousePressed(e -> {
            //math x,y
            shape = new Polyline(e.getX(), e.getY() + vBox.getHeight());//hbox or vbox
                                
            drawPane.getChildren().add(shape);
        });

        //adding mouse dragg
        //slide15-31
       
        s.setOnMouseDragged(e -> {
            //!,==
            if (shape != null) {

                //adding points

                shape.getPoints().addAll(e.getX(), e.getY() + vBox.getHeight());

            }

        });

        //adding mouse release

        s.setOnMouseReleased(e -> {
               //!,==
            if (shape == null) {

                //adding current polyline to array

                polylines[numLines] = shape;

                numLines++; 
                //check for null display
            }

            

            shape = null;

        });
        clearButton.setOnAction(e->clear());
        //add clear button 

    }

    //clearing 

    public void clear() {

        //clearing 

        drawPane.getChildren().clear();
        //numLines or PolyLines
        int l;
        for (l = 0; l < numLines; l++) {

           //how to get rid of line options(null or break? )

            polylines[l] = null;

        }
        // ???? = 0**********(PolyLines or numLines )
        numLines = 0;

    }

    public static void main(String[] args) {

        launch(args);

    }

}

