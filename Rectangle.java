import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional;

public class Rectangle extends Application{
	@Override
	public void start(Stage primaryStage){
		TextInputDialog dialog = new TextInputDialog();
		dialog.setTitle("Side Length Input");
		dialog.setHeaderText("The perimeter and area of a rectangle will be calculated");
		dialog.setContentText("Please enter the width and height of a rectangle separated by a space");
		Optional<String> input = dialog.showAndWait();

		String [] side = input.get().split(" ");
		double width = Double.parseDouble(side[0]);
		double height = Double.parseDouble(side[1]);
		double perimeter = 2*width+2*height;
		double area = width * height;

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Result");
		alert.setHeaderText("Result from user input");
		alert.setContentText("The perimeter of the rectangle is " + perimeter + "\nThe area of the rectangle is " + area );
		alert.showAndWait();		

	}
}
