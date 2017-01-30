package com.sirma.itt.javacourse.networkingandgui.clientinfo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * ITTE-1959 Clients info. Client application.
 * 
 * @author Petar Ivanov
 */
public class ClientOneApp extends Application {
	private Button connectButton;
	private TextArea screen2;
	private ClientOne client;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		BorderPane border = new BorderPane();
		border.setPadding(new Insets(5, 5, 5, 5));
		connectButton = new Button("Connect");
		connectButton.setOnAction(e -> {
			client = new ClientOne(screen2);
			connectButton.setDisable(true);
			Thread thread = new Thread(client);
			thread.setDaemon(true);
			thread.start();
		});
		FlowPane buttons = new FlowPane();
		buttons.setPadding(new Insets(0, 5, 5, 0));
		buttons.getChildren().add(connectButton);
		border.setTop(buttons);
		screen2 = new TextArea();
		screen2.setPrefHeight(160);
		screen2.setEditable(false);
		border.setCenter(screen2);
		primaryStage.setTitle("Client");
		primaryStage.setScene(new Scene(border, 600, 200));
		primaryStage.show();
		primaryStage.setResizable(false);
	}
}
