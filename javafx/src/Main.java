import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import javafx.geometry.Orientation;

public class Main extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Label lbl = new Label();
        TextField textField = new TextField();
        textField.setPrefColumnCount(11);
        TextField textField1 = new TextField();
        textField1.setPrefColumnCount(11);
        Button btn = new Button("ADD");
        btn.setOnAction(event -> lbl.setText("SUM: " + (Integer.parseInt(textField.getText())+Integer.parseInt(textField1.getText()))));
        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, textField,textField1, btn, lbl);
        Scene scene = new Scene(root, 350, 100, Color.BLUE);
        scene.setFill(Color.RED);
        stage.setScene(scene);
        stage.setTitle("Summing two integers");
        stage.show();
    }
}