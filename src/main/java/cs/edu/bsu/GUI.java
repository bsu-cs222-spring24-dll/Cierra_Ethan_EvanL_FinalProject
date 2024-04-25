package cs.edu.bsu;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class GUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private final Button StateButton = new Button("State Search");
    private final TextField inputField = new TextField();
    private final TextArea outputField = new TextArea();
    private final Button ParkButton = new Button("Park Search");

    @Override
    public void start(Stage primaryStage) {
        outputField.setEditable(false);
        configure(primaryStage);

        configureStateButton();
        configureParkButton();
    }

    private void configure(Stage stage) {
        stage.setTitle("Travel Guide");
        stage.setScene(new Scene(createRoot()));
        stage.sizeToScene();
        stage.show();
    }

    private Pane createRoot() {
        VBox root = new VBox();
        root.getChildren().addAll( //
                new Label("Input:"), //
                inputField, //
                ParkButton,
                StateButton, //
                new Label("Output:"),//
                outputField);
        return root;
    }



    private void configureStateButton() {
        StateButton.setOnAction(event -> {
            try {
                StateGUI();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private void configureParkButton() {
        ParkButton.setOnAction(event -> {
            try {
                ParkGUI();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private void ParkGUI() throws IOException {
        CheckSearchField checker = new CheckSearchField();
        String inputString = inputField.getText();
        String outputString = checker.readParkInput(inputString);
        TravelGuide system = new TravelGuide();
        outputString= system.checkParkSearch(outputString);
        outputField.setText(outputString);
    }


    private void StateGUI() throws IOException {
       CheckSearchField checker = new CheckSearchField();
       String inputString = inputField.getText();
       String outputString = checker.stateHasPark(inputString);
        outputField.setText(outputString);
    }

}


