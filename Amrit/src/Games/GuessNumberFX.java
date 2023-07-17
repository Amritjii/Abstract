package Games;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GuessNumberFX extends Application {
    private int targetNumber = (int) (Math.random() * 100);
    private int numberOfAttempts = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Guess the number between 0 and 100:");
        TextField textField = new TextField();
        Button button = new Button("Guess");

        button.setOnAction(event -> 
        {
            numberOfAttempts++;
            int guess = Integer.parseInt(textField.getText());

            if (guess == targetNumber) {
                label.setText("You got it in " + numberOfAttempts + " attempts! Excellent!");
                button.setDisable(true);
            } else if (numberOfAttempts < 5) {
                label.setText("Wrong, try again. Excellent!");
            } else if (numberOfAttempts < 10) {
                label.setText("Wrong, try again. Good!");
            } else if (numberOfAttempts < 15) {
                label.setText("Wrong, try again. Fair!");
            } else {
                label.setText("Wrong, try again. Rahne de bhai!");
                button.setDisable(true);
            }
        });

        VBox root = new VBox(label, textField, button);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);

        Scene scene = new Scene(root, 350, 150);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Guess the Number");
        primaryStage.show();
    }
}
