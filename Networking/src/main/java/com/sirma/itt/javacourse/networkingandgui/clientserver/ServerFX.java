package com.sirma.itt.javacourse.networkingandgui.clientserver;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * ITTE-1958 Client-server.
 * 
 * @author Petar Ivanov
 */
public class ServerFX extends Application {
	private TextArea screen;
	private Server server;
	private Thread serverThread;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane border = new BorderPane();
		Button startServer = new Button("Start");
		Button stopServer = new Button("Stop");
		border.setPadding(new Insets(5, 5, 5, 5));
		startServer.setOnAction(e -> {
			startServer.setDisable(true);
			stopServer.setDisable(false);
			server = new Server(screen);
			server.start();
			serverThread = new Thread(server);
			serverThread.start();
		});
		stopServer.setOnAction(e -> {
			stopServer.setDisable(true);
			server.stop();
			serverThread.interrupt();
			System.exit(1);
		});
		stopServer.setDisable(true);
		FlowPane buttons = new FlowPane();
		buttons.setPadding(new Insets(5, 5, 5, 5));
		buttons.setHgap(5);
		buttons.getChildren().addAll(startServer, stopServer);
		border.setTop(buttons);
		screen = new TextArea();
		screen.setPrefHeight(360);
		screen.setEditable(false);
		border.setCenter(screen);
		primaryStage.setTitle("Server");
		primaryStage.setScene(new Scene(border, 400, 400));
		primaryStage.show();
		primaryStage.setResizable(false);
	}
}
