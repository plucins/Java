package mp3player.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;


public class MainController implements Initializable {

	@FXML
	private ContentController contentPaneController;

	@FXML
	private ControlController controlPaneController;

	@FXML
	private MenuController menuPaneController;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println(contentPaneController);
		System.out.println(controlPaneController);
		System.out.println(menuPaneController);
	}
}