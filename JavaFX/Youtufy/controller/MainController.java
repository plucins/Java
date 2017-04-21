package youtufy.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebView;

public class MainController implements Initializable {

    @FXML
    private TextField searchTextField;

    @FXML
    private ListView<String> historyListView;

    @FXML
    private WebView videoWebView;

    @FXML
    private TableView<?> resultTableView;

    @FXML
    private Button previousButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Button nextButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider songSlider;

    @FXML
    private MenuBar mainMenu;


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		configureButtons();
		configureSearch();
	}

	private void configureSearch(){
		searchTextField.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>(){

			@Override
			public void handle(KeyEvent event) {
				String searchQuery = searchTextField.getText();
				ObservableList<String> historyList = historyListView.getItems();

					if(event.getCode().equals(KeyCode.ENTER)){
						if(historyList.isEmpty() || !historyList.get(0).equals(searchQuery)){
							historyList.add(0, searchQuery);
						}
					}
			}
		});
	}

	private void configureButtons(){
		playButton.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				if(playButton.isSelected()){
					System.out.println("Play");
				}else{
					System.out.println("Stop");
				}
			}
		});
		previousButton.setOnAction(x -> System.out.println("Previous"));

		nextButton.setOnAction(x -> System.out.println("NExt"));
	}

}
