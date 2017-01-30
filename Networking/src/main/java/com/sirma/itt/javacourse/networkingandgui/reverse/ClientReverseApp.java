package com.sirma.itt.javacourse.networkingandgui.reverse;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ClientReverseApp extends Application {
	private TextArea screen2;
	private ClientReverse client;
	private TextArea send;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		BorderPane border = new BorderPane();
		border.setPadding(new Insets(5, 5, 5, 5));
		border.setTop(createConnectionButtons());
		border.setCenter(createScreens());
		border.setBottom(createMessageButtons());
		primaryStage.setTitle("Client");
		primaryStage.setScene(new Scene(border, 600, 400));
		primaryStage.show();
		primaryStage.setResizable(false);
	}

	private Node createScreens() {
		GridPane pane = new GridPane();
		screen2 = new TextArea();
		screen2.setPrefWidth(600);
		screen2.setPrefHeight(160);
		screen2.setEditable(false);
		send = new TextArea();
		send.setPrefWidth(580);
		pane.setVgap(5);
		pane.addRow(0, screen2);
		pane.addRow(1, send);
		return pane;
	}

	private Node createConnectionButtons() {
		FlowPane buttons = new FlowPane();
		Button connectButton = new Button("Connect");
		connectButton.setOnAction(e -> {
			client = new ClientReverse(screen2);
			Thread thread = new Thread(client);
			thread.start();
			connectButton.setDisable(true);
		});
		buttons.setPadding(new Insets(0, 5, 5, 0));
		buttons.getChildren().add(connectButton);
		return buttons;
	}

	private Node createMessageButtons() {
		GridPane messageButtons = new GridPane();
		messageButtons.setHgap(5);
		Button sendButton = new Button("send");
		sendButton.setPrefWidth(80);
		sendButton.setOnAction(e -> {
			String message = send.getText();
			if (message.equals(".")) {
				client.stopClient();
				screen2.setText("Disconnected from server.");
				send.clear();
			} else {
				client.sendMessage(message);
				send.clear();
			}

			e.consume();
			send.requestFocus();// .setFocusTraversable(true);
		});
		Button previous = new Button("<--");
		previous.setPrefWidth(80);
		previous.setOnAction(e -> {
			send.setText(client.undo());
		});
		Button next = new Button("-->");
		next.setPrefWidth(80);
		next.setOnAction(e -> {
			send.setText(client.redo());
		});
		messageButtons.setPadding(new Insets(5, 0, 5, 5));
		messageButtons.setAlignment(Pos.BASELINE_RIGHT);
		messageButtons.addColumn(0, previous);
		messageButtons.addColumn(1, next);
		messageButtons.addColumn(2, sendButton);
		return messageButtons;
	}
}
