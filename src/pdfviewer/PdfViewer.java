package pdfviewer;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PdfViewer extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		final Parent parent = FXMLLoader.load(getClass().getResource("PdfViewer.fxml"));
		primaryStage.setScene(new Scene(parent,600, 800));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
