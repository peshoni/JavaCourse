package com.sirma.itt.javacourse.networkingandgui.clientserver;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * ITTE-1958 Client-server. User interface for client part.
 * 
 * @author Petar Ivanov
 */
public class ClientFX extends Application {
	private Button connectButton;
	private Button disconnectButton;
	private TextArea screen;
	private Client client;

	/**
	 * Launch {@link Application}}
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		BorderPane border = new BorderPane();
		border.setPadding(new Insets(5, 5, 5, 5));
		border.setTop(makeButtons());
		screen = new TextArea();
		screen.setPrefHeight(160);
		screen.setEditable(false);
		border.setCenter(screen);
		primaryStage.setTitle("Client");
		primaryStage.setScene(new Scene(border, 600, 200));
		primaryStage.show();
		primaryStage.setResizable(false);
	}

	/**
	 * Creates the panel with buttons and add their listeners.
	 * 
	 * @return FlowPane with buttons.
	 */
	private Node makeButtons() {
		connectButton = new Button("Connect");
		connectButton.setOnAction(e -> {
			client = new Client(screen);
			try {
				client.connect();
				connectButton.setDisable(true);
				disconnectButton.setDisable(false);
			} catch (Exception e1) {
				screen.appendText("The srevrer is not available."
						+ System.lineSeparator());
			}
		});
		disconnectButton = new Button("Disconnect");
		disconnectButton.setOnAction(e -> {
			connectButton.setDisable(false);
			disconnectButton.setDisable(true);
			if (client != null) {
				client.disconnect();
			}
		});
		disconnectButton.setDisable(true);
		FlowPane buttons = new FlowPane();
		buttons.setPadding(new Insets(5, 5, 5, 5));
		buttons.setHgap(5);
		buttons.getChildren().addAll(connectButton, disconnectButton);
		return buttons;
	}
}
