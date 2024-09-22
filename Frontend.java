package com.example.calculatorappjavafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.event.ActionEvent;

/**
 * The frontend JavaFX GUI for a calculator app.
 * The design of this calculator app is inspired from the iPhone calculator app.
 */
public class Frontend extends Application implements FrontendInterface {
    // The first number inputted by the user.
    private String operand1 = "";
    // True if operand1 has been set to a number and will no longer be changed.
    private boolean operand1Set;
    // True if operand1 has a decimal point.
    private boolean operand1DecimalPointUsed;

    // The second number inputted by the user.
    private String operand2 = "";
    // True if operand2 has been set to a number.
    private boolean operand2Set;
    // True if operand2 has a decimal point.
    private boolean operand2DecimalPointUsed;

    // The operation for the two operands.
    private String operator;

    // The display for each number the user inputs and the resulting calculation.
    private Label display;

    private static Backend backend;

    public void start(Stage stage) {
        Pane parent = new Pane();

        this.createAllControls(parent, stage);

        Scene scene = new Scene(parent, 180, 220);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void setBackend(Backend backend) {
        Frontend.backend = backend;
    }

    /**
     * Creates all the controls in the GUI.
     *
     * @param parent - the pane object that contains all controls.
     */
    public void createAllControls(Pane parent, Stage stage) {
        this.createNumberButtons(parent);
        this.createDecimalAndNegativeButtons(parent);
        this.createOperationButtons(parent);
        this.createDisplay(parent);
        this.createClearButton(parent);
        this.createAboutAndQuitButtons(parent, stage);
    }

    /**
     * Creates the buttons 0 to 9.
     *
     * @param parent - the pane object that contains all controls.
     */
    public void createNumberButtons(Pane parent) {
        Button seven = new Button("7");
        seven.setLayoutX(20);
        seven.setLayoutY(60);
        parent.getChildren().add(seven);
        seven.addEventHandler(ActionEvent.ACTION, (event) -> {
            // If the first operand hasn't been set then we are in the process of making the first operand
            if (!operand1Set) {
                // Set operand1 equal to what operand1 was, concatenated with 7.
                this.operand1 += "7";
                this.display.setText(this.operand1);
            }
            // The first operand has been set, so we are in the process of making the second operand
            else {
                this.operand2 += "7";
                this.operand2Set = true;
                this.display.setText(this.operand2);
            }
            });

        Button eight = new Button("8");
        eight.setLayoutX(50);
        eight.setLayoutY(60);
        parent.getChildren().add(eight);
        eight.addEventHandler(ActionEvent.ACTION, (event) -> {
            // If the first operand hasn't been set then we are in the process of making the first operand
            if (!operand1Set) {
                // Set operand1 equal to what operand1 was, concatenated with 8.
                this.operand1 += "8";
                this.display.setText(this.operand1);
            }
            // The first operand has been set, so we are in the process of making the second operand
            else {
                this.operand2 += "8";
                this.operand2Set = true;
                this.display.setText(this.operand2);
            }
        });

        Button nine = new Button("9");
        nine.setLayoutX(80);
        nine.setLayoutY(60);
        parent.getChildren().add(nine);
        nine.addEventHandler(ActionEvent.ACTION, (event) -> {
            // If the first operand hasn't been set then we are in the process of making the first operand
            if (!operand1Set) {
                // Set operand1 equal to what operand1 was, concatenated with 9.
                this.operand1 += "9";
                this.display.setText(this.operand1);
            }
            // The first operand has been set, so we are in the process of making the second operand
            else {
                this.operand2 += "9";
                this.operand2Set = true;
                this.display.setText(this.operand2);
            }
        });

        Button four = new Button("4");
        four.setLayoutX(20);
        four.setLayoutY(90);
        parent.getChildren().add(four);
        four.addEventHandler(ActionEvent.ACTION, (event) -> {
            // If the first operand hasn't been set then we are in the process of making the first operand
            if (!operand1Set) {
                // Set operand1 equal to what operand1 was, concatenated with 4.
                this.operand1 += "4";
                this.display.setText(this.operand1);
            }
            // The first operand has been set, so we are in the process of making the second operand
            else {
                this.operand2 += "4";
                this.operand2Set = true;
                this.display.setText(this.operand2);
            }
        });

        Button five = new Button("5");
        five.setLayoutX(50);
        five.setLayoutY(90);
        parent.getChildren().add(five);
        five.addEventHandler(ActionEvent.ACTION, (event) -> {
            // If the first operand hasn't been set, then we are in the process of making the first operand
            if (!operand1Set) {
                // Set operand1 equal to what operand1 was, concatenated with 5.
                this.operand1 += "5";
                this.display.setText(this.operand1);
            }
            // The first operand has been set, so we are in the process of making the second operand
            else {
                this.operand2 += "5";
                this.operand2Set = true;
                this.display.setText(this.operand2);
            }
        });

        Button six = new Button("6");
        six.setLayoutX(80);
        six.setLayoutY(90);
        parent.getChildren().add(six);
        six.addEventHandler(ActionEvent.ACTION, (event) -> {
            // If the first operand hasn't been set then we are in the process of making the first operand
            if (!operand1Set) {
                // Set operand1 equal to what operand1 was, concatenated with 6.
                this.operand1 += "6";
                this.display.setText(this.operand1);
            }
            // The first operand has been set, so we are in the process of making the second operand
            else {
                this.operand2 += "6";
                this.operand2Set = true;
                this.display.setText(this.operand2);
            }
        });

        Button one = new Button("1");
        one.setLayoutX(20);
        one.setLayoutY(120);
        parent.getChildren().add(one);
        one.addEventHandler(ActionEvent.ACTION, (event) -> {
            // If the first operand hasn't been set, then we are in the process of making the first operand
            if (!operand1Set) {
                // Set operand1 equal to what operand1 was, concatenated with 1.
                this.operand1 += "1";
                this.display.setText(this.operand1);
            }
            // The first operand has been set, so we are in the process of making the second operand
            else {
                this.operand2 += "1";
                this.operand2Set = true;
                this.display.setText(this.operand2);
            }
        });

        Button two = new Button("2");
        two.setLayoutX(50);
        two.setLayoutY(120);
        parent.getChildren().add(two);
        two.addEventHandler(ActionEvent.ACTION, (event) -> {
            // If the first operand hasn't been set, then we are in the process of making the first operand
            if (!operand1Set) {
                // Set operand1 equal to what operand1 was, concatenated with 2.
                this.operand1 += "2";
                this.display.setText(this.operand1);
            }
            // The first operand has been set, so we are in the process of making the second operand
            else {
                this.operand2 += "2";
                this.operand2Set = true;
                this.display.setText(this.operand2);
            }
        });

        Button three = new Button("3");
        three.setLayoutX(80);
        three.setLayoutY(120);
        parent.getChildren().add(three);
        three.addEventHandler(ActionEvent.ACTION, (event) -> {
            // If the first operand hasn't been set, then we are in the process of making the first operand
            if (!operand1Set) {
                // Set operand1 equal to what operand1 was, concatenated with 3.
                this.operand1 += "3";
                this.display.setText(this.operand1);
            }
            // The first operand has been set, so we are in the process of making the second operand
            else {
                this.operand2 += "3";
                this.operand2Set = true;
                this.display.setText(this.operand2);
            }
        });

        Button zero = new Button("0");
        zero.setLayoutX(50);
        zero.setLayoutY(150);
        parent.getChildren().add(zero);
        zero.addEventHandler(ActionEvent.ACTION, (event) -> {
            // If the first operand hasn't been set, then we are in the process of making the first operand
            if (!operand1Set) {
                // Set operand1 equal to what operand1 was, concatenated with 0.
                this.operand1 += "0";
                this.display.setText(this.operand1);
            }
            // The first operand has been set, so we are in the process of making the second operand
            else {
                this.operand2 += "0";
                this.operand2Set = true;
                this.display.setText(this.operand2);
            }
        });
    }

    /**
     * Creates the decimal point button and the negative button.
     * @param parent - the pane object that contains all controls.
     */
    public void createDecimalAndNegativeButtons(Pane parent) {
        Button decimal = new Button(" . ");
        decimal.setLayoutX(80);
        decimal.setLayoutY(150);
        parent.getChildren().add(decimal);
        decimal.addEventHandler(ActionEvent.ACTION, (event) -> {
            // If the first operand haven't been set, then we are in the process of making the first operand.
            if (!operand1Set) {
                // If operand1 doesn't contain a decimal point, then one can be added.
                // In the case it does, then no action should be done.
                if (!operand1DecimalPointUsed) {
                    // If a decimal point is concatenated to nothing, then put a 0 before it
                    if (this.operand1.equals("")) {
                        this.operand1 += "0.";
                    }
                    else {
                        this.operand1 += ".";
                    }
                    this.display.setText(this.operand1);
                    this.operand1DecimalPointUsed = true;
                }
            }
            // The first operand has been set, so we are in the process of making the second operand
            else {
                // If operand2 already contains a decimal point, then another one
                // shouldn't be added.
                if (!operand2DecimalPointUsed) {
                    // If a decimal point is concatenated to nothing, then put a 0 before it
                    if (this.operand2.equals("")) {
                        this.operand2 += "0.";
                    }
                    else {
                        this.operand2 += ".";
                    }
                    this.display.setText(this.operand2);
                    this.operand2DecimalPointUsed = true;
                }
            }
        });

        Button negative = new Button("-");
        negative.setLayoutX(20);
        negative.setLayoutY(150);
        parent.getChildren().add(negative);
        negative.addEventHandler(ActionEvent.ACTION, (event) -> {
            // If the first operand hasn't been set, then we are in the process of making the first operand.
            if (!operand1Set) {
                // If the first operand doesn't have a negative, add one to the front
                if (!this.operand1.substring(0, 1).equals("-")) {
                    this.operand1 = "-" + this.operand1;
                }
                // If the first operand DOES have a negative, remove the negative, so it is positive
                else {
                    this.operand1 = this.operand1.substring(1);
                }
                this.display.setText(this.operand1);
            }
            // We are in the process of making the second operand
            else {
                // If the second operand doesn't have a negative, add one to the front
                if (!this.operand2.substring(0, 1).equals("-")) {
                    this.operand2 = "-" + this.operand2;
                }
                // If the second operand DOES have a negative, remove the negative, so it is positive
                else {
                    this.operand2 = this.operand2.substring(1);
                }
                this.display.setText(this.operand2);
            }
        });
    }

    /**
     * Creates the buttons for the operations
     * - addition
     * - subtraction
     * - multiplication
     * - division
     * - modulus
     * and an equals button.
     *
     * When ANY operator button is pressed, it should signal:
     * - No more changing of operand1 is allowed, so set the operand1Set boolean to true.
     *
     * If the user meant to press a different operator button, then pressing the new one
     * will update the operator instance field and set operand1Set boolean to true.
     *
     * However, if a new operator button instead of the equals button is pressed
     * after a number, operator, and another number is pressed,
     * then the action of pressing the new operator button does the equals button and
     * sets the calculated result into operand1, and resets all operand2 fields.
     *
     * @param parent - the pane object that contains all controls.
     */
    public void createOperationButtons(Pane parent) {
        Button add = new Button(" +");
        add.setLayoutX(120);
        add.setLayoutY(60);
        parent.getChildren().add(add);
        add.addEventHandler(ActionEvent.ACTION, (event) -> {
            // Case 1: user presses after making operand1
            if (!operand2Set) {
                this.operand1Set = true;
                this.operator = "+";
            }
            // Case 2: user presses after making operand2. This forces a calculation to be made and
            // puts the result into operand1.
            else {
                this.operand1 = Frontend.backend.calculate(Double.parseDouble(this.operand1),
                                                            this.operator, Double.parseDouble(this.operand2));
                this.operand1Set = true;
                this.operand1DecimalPointUsed = true;

                this.operator = "+";

                this.operand2 = "";
                this.operand2Set = false;
                this.operand2DecimalPointUsed = false;

                this.display.setText(this.operand1);
            }
        });

        Button subtract = new Button(" - ");
        subtract.setLayoutX(150);
        subtract.setLayoutY(60);
        parent.getChildren().add(subtract);
        subtract.addEventHandler(ActionEvent.ACTION, (event) -> {
            // Case 1: user presses after making operand1
            if (!operand2Set) {
                this.operand1Set = true;
                this.operator = "-";
            }
            // Case 2: user presses after making operand2. This forces a calculation to be made and
            // puts the result into operand1.
            else {
                this.operand1 = Frontend.backend.calculate(Double.parseDouble(this.operand1),
                                                this.operator, Double.parseDouble(this.operand2));
                this.operand1Set = true;
                this.operand1DecimalPointUsed = true;

                this.operator = "-";

                this.operand2 = "";
                this.operand2Set = false;
                this.operand2DecimalPointUsed = false;

                this.display.setText(this.operand1);
            }
        });

        Button multiply = new Button(" * ");
        multiply.setLayoutX(120);
        multiply.setLayoutY(90);
        parent.getChildren().add(multiply);
        multiply.addEventHandler(ActionEvent.ACTION, (event) -> {
            // Case 1: user presses after making operand1
            if (!operand2Set) {
                this.operand1Set = true;
                this.operator = "*";
            }
            // Case 2: user presses after making operand2. This forces a calculation to be made and
            // puts the result into operand1.
            else {
                this.operand1 = Frontend.backend.calculate(Double.parseDouble(this.operand1),
                                            this.operator, Double.parseDouble(this.operand2));
                this.operand1Set = true;
                this.operand1DecimalPointUsed = true;

                this.operator = "*";

                this.operand2 = "";
                this.operand2Set = false;
                this.operand2DecimalPointUsed = false;

                this.display.setText(this.operand1);
            }
        });

        Button divide = new Button(" / ");
        divide.setLayoutX(150);
        divide.setLayoutY(90);
        parent.getChildren().add(divide);
        divide.addEventHandler(ActionEvent.ACTION, (event) -> {
            // Case 1: user presses after making operand1
            if (!operand2Set) {
                this.operand1Set = true;
                this.operator = "/";
            }
            // Case 2: user presses after making operand2. This forces a calculation to be made and
            // puts the result into operand1.
            else {
                this.operand1 = Frontend.backend.calculate(Double.parseDouble(this.operand1),
                                                this.operator, Double.parseDouble(this.operand2));
                this.operand1Set = true;
                this.operand1DecimalPointUsed = true;

                this.operator = "/";

                this.operand2 = "";
                this.operand2Set = false;
                this.operand2DecimalPointUsed = false;

                this.display.setText(this.operand1);
            }
        });

        Button mod = new Button("%");
        mod.setLayoutX(120);
        mod.setLayoutY(120);
        parent.getChildren().add(mod);
        mod.addEventHandler(ActionEvent.ACTION, (event) -> {
            // Case 1: user presses after making operand1
            if (!operand2Set) {
                this.operand1Set = true;
                this.operator = "%";
            }
            // Case 2: user presses after making operand2. This forces a calculation to be made and
            // puts the result into operand1.
            else {
                this.operand1 = Frontend.backend.calculate(Double.parseDouble(this.operand1),
                                                    this.operator, Double.parseDouble(this.operand2));
                this.operand1Set = true;
                this.operand1DecimalPointUsed = true;

                this.operator = "%";

                this.operand2 = "";
                this.operand2Set = false;
                this.operand2DecimalPointUsed = false;

                this.display.setText(this.operand1);
            }
        });

        Button equals = new Button("=");
        equals.setLayoutX(150);
        equals.setLayoutY(120);
        parent.getChildren().add(equals);
        equals.addEventHandler(ActionEvent.ACTION, (event) -> {
            if (operand1Set && operand2Set) {
                String result = Frontend.backend.calculate(Double.parseDouble(this.operand1),
                                                this.operator, Double.parseDouble(this.operand2));
                // RESET EVERYTHING
                this.operand1 = "";
                this.operand1Set = false;
                this.operand1DecimalPointUsed = false;
                this.operand2 = "";
                this.operand2Set = false;
                this.operand2DecimalPointUsed = false;
                this.operator = "";

                this.display.setText(result);
            }
        });
    }

    /**
     * Creates the display for arithmetic calculations.
     *
     * @param parent - the pane object that contains all controls.
     */
    public void createDisplay(Pane parent) {
        this.display = new Label();
        display.setFont(new Font("Roboto", 20));
        display.setStyle("-fx-border-color: black;");
        display.setPrefWidth(125);
        display.setLayoutX(50);
        display.setLayoutY(15);
        parent.getChildren().add(display);
    }

    /**
     * Creates a button that clears the display (makes it blank) and resets all instance fields.
     *
     * @param parent - the pane object that contains all controls.
     */
    public void createClearButton(Pane parent) {
        Button clear = new Button("CE");
        clear.setLayoutX(5);
        clear.setLayoutY(15);
        parent.getChildren().add(clear);
        // When the button is clicked:
        // - The display will be set blank
        // - operand1, operand2, and operator are set to null
        clear.addEventHandler(ActionEvent.ACTION, (event) -> {
            this.display.setText("");
            this.operand1 = "";
            this.operand1Set = false;
            this.operand1DecimalPointUsed = false;
            this.operand2 = "";
            this.operand2Set = false;
            this.operand2DecimalPointUsed = false;
            this.operator = "";
        });
    }

    /**
     * Creates an About and a Quit Button at the bottom of the app.
     * Also creates a popup window for the About button.
     *
     * @param parent - the pane object that contains all controls.
     */
    public void createAboutAndQuitButtons(Pane parent, Stage stage) {
        // Popup window
        Popup aboutPopup = new Popup();
        Label popupLabel = new Label("Welcome to the\nCalculator JavaFX App!\nStart calculating...");
        popupLabel.setStyle("-fx-background-color: pink;");
        aboutPopup.getContent().add(popupLabel);

        // About button
        Button about = new Button("About");
        about.setLayoutX(0);
        about.setLayoutY(195);
        about.addEventHandler(ActionEvent.ACTION, (event) -> {
            if (!aboutPopup.isShowing())
                aboutPopup.show(stage);
            else
                aboutPopup.hide();
        } );
        parent.getChildren().add(about);


        // Quit button
        Button quit = new Button("Quit");
        quit.setLayoutX(140);
        quit.setLayoutY(195);
        parent.getChildren().add(quit);
        // Creates functionality for Quit button
        quit.addEventHandler(ActionEvent.ACTION, (event) -> Platform.exit());
    }
}