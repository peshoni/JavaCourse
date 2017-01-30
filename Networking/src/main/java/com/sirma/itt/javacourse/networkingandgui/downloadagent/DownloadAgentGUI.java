package com.sirma.itt.javacourse.networkingandgui.downloadagent;

import java.nio.file.Path;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DownloadAgentGUI extends Application {
	private DownloadAgent fileDownloader;
	private Button downloadButton;
	private Button clear;
	private ProgressBar progressBar;
	private Label urlLabel;
	private Label status;
	private TextField urlTextField;
	private String url;
	private Path path;
	private Task copyWorker;

	public static void main(String[] args) {
		Application.launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane border = new BorderPane();
		border.setPadding(new Insets(10, 5, 5, 10));
		HBox urlPane = urlPane();
		border.setTop(urlPane);

		HBox download = new HBox();
		download.setSpacing(10);

		downloadButton = new Button("Download");
		downloadButton.setPrefSize(80, 15);
		downloadButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				url = urlTextField.getText();
				downloadButton.setDisable(true);
				copyWorker = createWorker();
				progressBar.progressProperty().unbind();
				progressBar.progressProperty().bind(copyWorker.progressProperty());
				copyWorker.messageProperty().addListener(new ChangeListener<String>() {
					public void changed(ObservableValue<? extends String> observable, String oldValue,
							String newValue) {
						status.setText(newValue);
					}
				});
				new Thread(copyWorker).start();

			}
		});

		status = new Label();
		status.setPrefSize(200, 15);
		status.setText("download...");
		download.setAlignment(Pos.CENTER);
		download.getChildren().addAll(downloadButton, status);
		border.setCenter(download);

		progressBar = new ProgressBar(0);
		progressBar.setPadding(new Insets(5));
		progressBar.setPrefSize(600, 15);

		border.setBottom(progressBar);// new FlowPane(progressBar, status));
		primaryStage.setTitle("Download agent");
		primaryStage.setScene(new Scene(border, 600, 200));
		primaryStage.show();
		primaryStage.setResizable(false);

	}

	private HBox urlPane() {
		HBox url = new HBox();
		url.setSpacing(5);
		urlLabel = new Label("URL");
		urlLabel.setPrefWidth(60);
		urlLabel.setStyle("-fx-background-color: lightgray;-fx-font-size: 20;");
		urlLabel.setAlignment(Pos.CENTER);

		urlTextField = new TextField();
		urlTextField.setPrefWidth(480);
		urlTextField.setStyle("-fx-background-color: ghostwhite;-fx-font-size: 15;");
		clear = new Button("Clear");
		clear.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				urlTextField.clear();
			}
		});
		clear.setPrefSize(60, 30);
		url.getChildren().addAll(urlLabel, urlTextField, clear);
		return url;
	}

	public Task<DownloadAgent> createWorker() {
		return new Task<DownloadAgent>() {
			@Override
			protected DownloadAgent call() throws Exception {
				Path path = Paths.get(".");
				DownloadAgent downloader = new DownloadAgent(url, path);
				Thread thread = new Thread(downloader);
				thread.start();
				while (thread.isAlive()) {
					String str = String.valueOf(downloader.getTransferred());
					updateMessage(str + " bytes");
					updateProgress(downloader.getTransferred(), downloader.getTargetSize());
				}
				thread.interrupt();
				updateMessage("Download complite.");
				Thread.sleep(2000);
				System.exit(0);
				return downloader;
			}
		};
	}

}
