package cs.edu.bsu;

import cs.edu.bsu.TravelGuide;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class GUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private final Button translateButton = new Button("Translate");
    private final TextField inputField = new TextField();
    private final TextField outputField = new TextField();
    private final ComboBox<String> translatorSelector = new ComboBox<>();

    @Override
    public void start(Stage primaryStage) {
        outputField.setEditable(false);
        configure(primaryStage);
        configureComboBox();
        configureTranslateButton();
    }

    private void configure(Stage stage) {
        stage.setTitle("Translator");
        stage.setScene(new Scene(createRoot()));
        stage.sizeToScene();
        stage.show();
    }

    private Pane createRoot() {
        VBox root = new VBox();
        root.getChildren().addAll( //
                new Label("Input:"), //
                inputField, //
                translatorSelector, //
                translateButton, //
                new Label("Output:"),//
                outputField);
        return root;
    }

    private void configureComboBox() {
        translatorSelector.getItems().addAll("Identity");
    }

    private void configureTranslateButton() {
        translateButton.setOnAction(event -> {
            try {
                translateInputFieldToOutputField();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }


    private void translateInputFieldToOutputField() throws IOException {
        TravelGuide translator = new TravelGuide();
        if (translatorSelector.getValue().equals("Identity")) {
            translator = new TravelGuide();
        }

        String translation = translator.stateSearcher();
        outputField.setText(translation);
    }

}


