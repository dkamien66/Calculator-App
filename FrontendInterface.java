package com.example.calculatorappjavafx;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * An interface for the frontend GUI of a calculator app.
 */
public interface FrontendInterface {
    /**
     * Creates all the controls in the GUI.
     * @param parent - the pane object that contains all controls.
     */
    public void createAllControls(Pane parent, Stage stage);

    /**
     * Creates the buttons 0 to 9.
     * @param parent - the pane object that contains all controls.
     */
    public void createNumberButtons(Pane parent);

    /**
     * Creates the buttons for operations.
     * @param parent - the pane object that contains all controls.
     */
    public void createOperationButtons(Pane parent);

    /**
     * Creates the display for arithmetic calculations.
     * @param parent - the pane object that contains all controls.
     */
    public void createDisplay(Pane parent);

    /**
     * Creates a button that resets the display - making it blank.
     * @param parent - the pane object that contains all controls.
     */
    public void createClearButton(Pane parent);

    /**
     * Creates an About and Quit Button at the bottom of the app.
     * @param parent - the pane object that contains all controls.
     */
    public void createAboutAndQuitButtons(Pane parent, Stage stage);
}
