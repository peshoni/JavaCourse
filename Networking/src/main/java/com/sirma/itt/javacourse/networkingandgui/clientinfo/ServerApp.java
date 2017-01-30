package com.sirma.itt.javacourse.networkingandgui.clientinfo;

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
 * ITTE-1959 Clients info. Server application.
 * 
 * @author Petar Ivanov
 */
public class ServerApp extends Application {
	private TextArea screen;
	private Thread serverThread;

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane border = new BorderPane();
		border.setPadding(new Insets(5, 5, 5, 5));
		border.setTop(createButtons());
		border.setCenter(createScreen());
		primaryStage.setTitle("Server");
		primaryStage.setScene(new Scene(border, 400, 400));
		primaryStage.show();
		primaryStage.setResizable(false);
	}

	/**
	 * Create screen that visualize message from server.
	 * 
	 * @return {@link TextArea}
	 */
	private Node createScreen() {
		screen = new TextArea();
		screen.setPrefHeight(360);
		screen.setEditable(false);
		return screen;
	}

	/**
	 * Create panel with buttons and action listeners.
	 * 
	 * @return {@link FlowPane}
	 */
	private Node createButtons() {
		FlowPane buttons = new FlowPane();
		Button startServer = new Button("Start");
		Button stopServer = new Button("Stop");
		startServer.setOnAction(e -> {
			startServer.setDisable(true);
			stopServer.setDisable(false);
			ServerOne server = new ServerOne(screen);
			server.setRun(true);
			serverThread = new Thread(server);
			serverThread.start();
		});
		stopServer.setOnAction(e -> {
			stopServer.setDisable(true);
			serverThread.interrupt();
			System.exit(0);
		});
		stopServer.setDisable(true);
		buttons.setPadding(new Insets(5, 5, 5, 5));
		buttons.setHgap(5);
		buttons.getChildren().addAll(startServer, stopServer);
		return buttons;
	}
}
