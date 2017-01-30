package com.sirma.itt.javacourse.networkingandgui.calculator;

import java.util.Hashtable;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * ITTE-1956 Calculator with GUI.
 * 
 * @author Petar Ivanov
 */

public class CalculatorJavaFX extends Application implements EventHandler<ActionEvent> {
	private static final String[] CAPTIONS = { "", "+/-", "Clean", "Back", "7", "8", "9", "/", "4", "5", "6", "*", "1",
			"2", "3", "-", "0", ".", "+", "=" };
	private Hashtable<Button, String> buttons;
	private StringBuilder operand;
	private StringBuilder secondOperand;
	private boolean isFirst;
	private boolean isDotted;
	private GridPane screen;
	private TextField firstScreen;
	private TextField secondScreen;
	private Calculator calculator;

	/**
	 * Launch calculator.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage window = primaryStage;
		buttons = new Hashtable<Button, String>();
		screen = setScreen();
		FlowPane keyboard = setKeyboard();
		loadStartValue();
		calculator = new Calculator();

		GridPane panel = new GridPane();
		panel.add(screen, 0, 0, 3, 1);
		panel.add(keyboard, 0, 1);
		window.setTitle("Calculator");
		window.setScene(new Scene(panel, 295, 280));
		window.show();
		window.setOnCloseRequest(e -> {
			e.consume();
			window.close();
		});
		window.setResizable(false);
	}

	@Override
	public void handle(ActionEvent e) {
		switch (operand.toString()) {
		case "0":
			operand.deleteCharAt(0);
			break;
		case ".":
			operand = new StringBuilder("0.");
			break;
		default:
			break;
		}
		switch (secondOperand.toString()) {
		case "0":
			secondOperand.deleteCharAt(0);
			break;
		case ".":
			secondOperand = new StringBuilder("0.");
			break;
		default:
			break;
		}
		/**
		 * Switch buttons action.
		 */
		switch (buttons.get(e.getSource())) {
		case "+/-":
			operand = new StringBuilder(String.valueOf(calculator.changeSign(Double.parseDouble(operand.toString()))));
			firstScreen.setText(operand.toString());
			break;
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "0":
		case ".":
			if (buttons.get(e.getSource()).equals(".") && isDotted) {
				break;
			}
			if (buttons.get(e.getSource()).equals(".")) {
				isDotted = true;
			}
			if (isFirst) {
				operand.append(buttons.get(e.getSource()));
				firstScreen.setText(operand.toString());
			} else {
				secondOperand.append(buttons.get(e.getSource()));
				firstScreen.setText(secondOperand.toString());
			}
			break;
		case "+":
		case "-":
		case "*":
		case "/":
			setOperator(buttons.get(e.getSource()).charAt(0));
			break;
		case "Clean":
			loadStartValue();
			break;
		case "Back":
			back();
			break;
		case "=":
			calculate();
			break;
		default:
			break;
		}
	}

	/**
	 * Creates keyboard.
	 * 
	 * @return {@link FlowPane}
	 */
	private FlowPane setKeyboard() {
		FlowPane flow = new FlowPane();
		flow.setPadding(new Insets(5, 5, 5, 5));
		flow.setHgap(5);
		flow.setVgap(5);
		Label label = new Label(CAPTIONS[0]);
		label.setPrefSize(70, 30);
		flow.getChildren().add(label);
		for (int i = 1; i < CAPTIONS.length; i++) {
			Button newButton = new Button(CAPTIONS[i]);
			newButton.setText(CAPTIONS[i]);
			newButton.setPrefSize(70, 30);
			newButton.setOnAction(this);
			buttons.put(newButton, CAPTIONS[i]);
			flow.getChildren().add(newButton);
		}
		return flow;
	}

	/**
	 * Creates a screen where visualize operands, operations and outcome of their calculations.
	 * 
	 * @return {@link GridPane}
	 */
	private GridPane setScreen() {
		firstScreen = new TextField();
		firstScreen.setStyle("-fx-background-color: ghostwhite;-fx-font-size: 25;");
		firstScreen.setPrefSize(295, 40);
		firstScreen.setAlignment(Pos.CENTER_RIGHT);
		firstScreen.setEditable(false);
		firstScreen.setText("0");
		secondScreen = new TextField();
		secondScreen.setStyle("-fx-background-color: ghostwhite;-fx-font-size: 20;");
		secondScreen.setPrefSize(295, 40);
		secondScreen.setAlignment(Pos.CENTER_RIGHT);
		secondScreen.setEditable(false);
		secondScreen.setText("0");
		screen = new GridPane();
		screen.setPadding(new Insets(5));
		screen.add(firstScreen, 0, 1);
		screen.add(secondScreen, 0, 0);
		return screen;
	}

	/**
	 * Setter method for operator.
	 * 
	 * @param operator
	 *            Gets by command of the user.
	 */
	private void setOperator(char operator) {
		calculator.setOperator(operator);
		secondScreen.setText(operand.toString() + operator);
		isDotted = false;
		isFirst = false;
		firstScreen.clear();
	}

	/**
	 * Removes one character in command occurred about.
	 */
	private void back() {
		if (operand.length() > 1) {
			operand.deleteCharAt(operand.length() - 1);
			if (!operand.toString().contains(".")) {
				isDotted = false;
			}
			firstScreen.setText(operand.toString());
		} else {
			loadStartValue();
		}
	}

	/**
	 * Clears the calculator memory.
	 */
	private void loadStartValue() {
		operand = new StringBuilder("0");
		secondOperand = new StringBuilder("0");
		isFirst = true;
		isDotted = false;
		secondScreen.clear();
		firstScreen.setText("0");
	}

	/**
	 * Calculate expression.
	 */
	private void calculate() {
		if (secondOperand.toString().isEmpty() && calculator.getOperator() == '/') {
			firstScreen.setText("no division by zero.");
		} else {
			calculator.prepareToExecute();
			if (operand.toString().isEmpty()) {
				operand = new StringBuilder("0");
			}
			calculator.setFirstOperand(Double.parseDouble(operand.toString()));
			if (secondOperand.toString().isEmpty()) {
				secondOperand = new StringBuilder("0");
			}
			calculator.setSecondOperand(Double.parseDouble(secondOperand.toString()));
			isFirst = true;
			isDotted = true;
			double firstOperand = calculator.execute();
			operand = new StringBuilder(String.valueOf(firstOperand));
			firstScreen.setText(String.valueOf(firstOperand));
			secondOperand = new StringBuilder("0");
			secondScreen.clear();
		}
	}
}
