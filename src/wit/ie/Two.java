package wit.ie;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;

public class Two extends Application {
	@Override
	public void start(Stage ps) {
		try {
			
			FlowPane fp = FXMLLoader.load(getClass().getResource("Main.fxml"));
			
			Scene s = new Scene (fp, 400, 400);
			ps.setScene(s);
			
			ps.setTitle("Example");
			s.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			ps.show();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}



