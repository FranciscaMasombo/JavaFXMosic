package wit.ie;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class JavaFXMosaic1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        // TODO Auto-generated method stub
    GridPane whole=new GridPane(); // the whole window
 
 
        //BorderPane whole = new BorderPane();
        // whole =new HBox();
         //whole.getChildren().add(bp);
        
        
           BorderPane bp = new BorderPane();
           Label w;
        bp.setTop(w = new Label());
        w.setAlignment(Pos.CENTER);
        w.setBackground(new Background(new BackgroundFill(Color.RED, null, null)));
        w.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        w.setPrefHeight(10);
        w.setMinWidth(80);

        bp.setBottom(w = new Label());
        w.setAlignment(Pos.CENTER);
        w.setBackground(new Background(new BackgroundFill(Color.YELLOW, new CornerRadii(0), null)));
        w.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        w.setPrefHeight(10);
        

        bp.setLeft(w = new Label());
        w.setAlignment(Pos.CENTER);
        w.setBackground(new Background(new BackgroundFill(Color.GREY, new CornerRadii(0), new Insets(0))));
        w.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        w.setPrefWidth(15);
        

        bp.setRight(w = new Label());
        w.setAlignment(Pos.CENTER);
        w.setBackground(new Background(new BackgroundFill(Color.MAGENTA, new CornerRadii(0), new Insets(0))));
        w.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        w.setPrefWidth(15);

        bp.setCenter(w = new Label());
        w.setAlignment(Pos.CENTER);
        w.setBackground(new Background(new BackgroundFill(Color.AQUA, new CornerRadii(0), new Insets(0))));
        w.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        w.setPrefWidth(80);

        //BorderPane fam = new BorderPane();
        //BorderPane green = new BorderPane();
        //green.setBackground(new Background(new BackgroundFill(Color.AQUA, new CornerRadii(0), new Insets(0))));
        //fam.setTop(green);
        //making bp equally horizontally and vertically

        GridPane.setHgrow(bp, Priority.ALWAYS);
        bp.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        GridPane.setVgrow(bp, Priority.ALWAYS);
        bp.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
       whole.add(bp, 0, 0); //adding bp section to the window container

       
 
        GridPane gpcol2 = new GridPane();
        GridPane.setHgrow(gpcol2, Priority.ALWAYS);
        gpcol2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        GridPane.setVgrow(gpcol2, Priority.ALWAYS);
        gpcol2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        gpcol2.setPrefWidth(100);
        
        BorderPane franC = new BorderPane();
    
        try {
			GridPane fran = new GridPane();
			
			final int size = 2;
			for (int row = 0; row < size; row++) {
				for (int col = 0; col < size; col++) {
					StackPane square = new StackPane();
					String color;
					if ((row + col) % 2 == 0) {
						color = "yellow";
					}
					else{
						color= "black";
					}
					square.setStyle("-fx-background-color: " + color + ";");
					fran.add(square, col, row);
				}
			}
			for (int i = 0; i < size; i++) {
				fran.getColumnConstraints().add(new ColumnConstraints(5, Region.USE_COMPUTED_SIZE,
						Double.POSITIVE_INFINITY, Priority.ALWAYS, HPos.CENTER, true));
				fran.getRowConstraints().add(new RowConstraints(5, Region.USE_COMPUTED_SIZE, Double.POSITIVE_INFINITY,
						Priority.ALWAYS, VPos.CENTER, true));
			}
			fran.setPrefWidth(150);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

        Label x = new Label("");
        x.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        x.setBackground(new Background(new BackgroundFill(Color.LAWNGREEN, new CornerRadii(0),new Insets(0))));
        GridPane.setHgrow(x, Priority.ALWAYS);
        GridPane.setVgrow(x, Priority.ALWAYS);
        gpcol2.add(x, 1, 0);


        GridPane root = new GridPane();
        GridPane.setHgrow(root, Priority.ALWAYS);
        GridPane.setVgrow(root, Priority.ALWAYS);

        try {

            //fam.setBottom(root);
            //	whole.setCenter(fam);
            final int size = 8;
            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    StackPane square = new StackPane();
                    String color;
                    if ((row + col) % 2 == 0) {
                        color = "white";
                    } else {
                        color = "black";
                    }
                    square.setStyle("-fx-background-color: " + color + ";");
                    root.add(square, col, row);
                }
            }
            for (int i = 0; i < size; i++) {
                root.getColumnConstraints().add(new ColumnConstraints(5,
                		Region.USE_COMPUTED_SIZE,
                        Double.POSITIVE_INFINITY, Priority.ALWAYS,
                        HPos.CENTER, true));
                root.getRowConstraints().add(new RowConstraints(5,
                		Region.USE_COMPUTED_SIZE, Double.POSITIVE_INFINITY,
                        Priority.ALWAYS, VPos.CENTER, true));
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        gpcol2.add(root, 1, 1);
        whole.add(gpcol2, 1, 0);

        //		//whole.setRight(w = new Label());
        //		w.setAlignment(Pos.CENTER);
        //		w.setBackground(new Background(new BackgroundFill(Color.AQUA, new CornerRadii(0), new Insets(0))));
        //		w.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        //		w.setPrefWidth(150)

        GridPane gpcol3 = new GridPane();
        GridPane.setHgrow(gpcol3, Priority.ALWAYS);
        gpcol3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        GridPane.setVgrow(gpcol3, Priority.ALWAYS);
        gpcol3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        Label d = new Label("");
        d.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        d.setBackground(new Background(new BackgroundFill(Color.BLUE,
        		new CornerRadii(0),new Insets(0))));
        GridPane.setHgrow(d, Priority.ALWAYS);
        GridPane.setVgrow(d, Priority.ALWAYS);
        gpcol3.add(d, 2, 0);
        
        Label e = new Label("");
        e.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        e.setBackground(new Background(new BackgroundFill(Color.PINK,
        		new CornerRadii(0),new Insets(0))));
        GridPane.setHgrow(e, Priority.ALWAYS);
        GridPane.setVgrow(e, Priority.ALWAYS);
        gpcol3.add(e, 2, 1);
        
        Label f = new Label("");
        f.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        f.setBackground(new Background(new BackgroundFill(Color.GREY, 
        		new CornerRadii(0),new Insets(0))));
        GridPane.setHgrow(f, Priority.ALWAYS);
        GridPane.setVgrow(f, Priority.ALWAYS);
       
       
     gpcol3.add(f, 2, 2);
        
//        FlowPane fp=new FlowPane();
//    fp.getChildren().addAll(new Button(),new Button(""),new Button(""));
//      fp.setAlignment(Pos.CENTER);
//    // bp3.add(fp,0,1);
//  GridPane.setVgrow(fp, Priority.ALWAYS);
//   GridPane.setHgrow(fp, Priority.ALWAYS);
        
        
        gpcol3.setPrefWidth(100);
        whole.add(gpcol3, 2, 0);
              
        Scene s = new Scene(whole, 300, 300);
        primaryStage.setScene(s);
        primaryStage.show();

    }
 
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        launch(args);
    }
}

