package mp3player.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;

public class ControlController implements Initializable {

	@FXML
    private Button nextButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider songSlider;


    @FXML
    private Button prevButton;

    @FXML
    private ToggleButton playButton;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        configureButtons();
        configureVolume();
    }

    private void configureVolume(){
    	volumeSlider.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent arg0) {
				System.out.println("Slider Volume");
			}
    	});
    }
    private void configureButtons(){
    	prevButton.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Poprzednia piosenka");
			}
    	});

    	nextButton.setOnAction(x-> System.out.println("NEXT"));
    	playButton.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) {
				if(playButton.isSelected()){
					System.out.println("Play");
				}else {
					System.out.println("Stop");
				}
			}

    	});
    }
}
