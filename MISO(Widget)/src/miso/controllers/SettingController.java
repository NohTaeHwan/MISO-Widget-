package miso.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXToggleButton;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import miso.actions.ocr.Capture;
import miso.component.setting.DicButton;
import miso.component.setting.EncButton;
import miso.component.setting.ImgButton;
import miso.component.setting.MapButton;
import miso.component.setting.MisoButton;
import miso.component.setting.PrefButton;
import miso.component.setting.TrsButton;
import miso.component.setting.VideoButton;
import miso.utility.Scope;
import com.jfoenix.controls.JFXNodesList;
import com.jfoenix.controls.JFXRadioButton;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class SettingController implements Initializable {

	@FXML
	private AnchorPane parent;
	@FXML
	private EncButton encButton;
	@FXML
	private ImgButton imgButton;
	@FXML
	private MapButton mapButton;
	@FXML
	private DicButton dicButton;

	@FXML
	private VideoButton videoButton;
	@FXML
	private TrsButton tlsButton;
	/*@FXML
	private JFXTextField searchTextfield;
	@FXML
	private SearchButton searchButton;*/

	@FXML
	private PrefButton prefButton;
	@FXML
	private Pane ocrPane;
	@FXML
	private JFXToggleButton ocrToggleButton;
	private boolean ocrToggleFlag = false;// ocrtoggle 버튼이 on인지 off인지 구분
	// ------------------
	@FXML
	private Pane pane;
	@FXML
	private JFXRadioButton engRadioButton;
	@FXML
	private JFXRadioButton korRadioButton;
	

	private Capture capture = new Capture();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Scope scope = Scope.getInstace();

		parent.setStyle("-fx-background-color: transparent;");
		parent.setMinHeight(com.sun.glass.ui.Screen.getMainScreen().getHeight());
		parent.setMinWidth(com.sun.glass.ui.Screen.getMainScreen().getWidth());

		// connect
		scope.setDicButton(dicButton);
		scope.setEncButton(encButton);
		scope.setImgButton(imgButton);
		scope.setMapButton(mapButton);
		scope.setVideoButton(videoButton);
		scope.setTlsButton(tlsButton);
		
		scope.setPreferenceButton(prefButton);
		scope.setTextFieldPane(pane);
		scope.setCapture(capture);
		
		// reverse
		dicButton.setScope(scope);
		encButton.setScope(scope);
		imgButton.setScope(scope);
		mapButton.setScope(scope);
		videoButton.setScope(scope);
		tlsButton.setScope(scope);
		prefButton.setScope(scope);

		engRadioButton.setVisible(false);
		korRadioButton.setVisible(false);
		scope.setEngRadioButton(engRadioButton);
		scope.setKorRadioButton(korRadioButton);
		
		scope.setOcrToggleFlag(ocrToggleFlag);
		scope.setOcrPane(ocrPane);
		JFXNodesList nodeList1 = new JFXNodesList();

		
		MisoButton misoButton = new MisoButton();
		misoButton.setStyle("-fx-graphic: url('/miso/icon/miso.png')");
		ocrToggleButton.setText("   OCR Mode");
		ocrToggleButton.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				// TODO Auto-generated method stub
				if (ocrToggleButton.isSelected() == true) {
					ocrToggleFlag = true;
					ocrToggleButton.setText("");
					engRadioButton.setVisible(true);
					korRadioButton.setVisible(true);
					scope.setOcrToggleFlag(ocrToggleFlag);
				} else {
					ocrToggleFlag = false;
					ocrToggleButton.setText("   OCR Mode");
					engRadioButton.setVisible(false);
					korRadioButton.setVisible(false);
					scope.setOcrToggleFlag(ocrToggleFlag);
				}
			}

		});
		engRadioButton.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				// TODO Auto-generated method stub
				if(engRadioButton.isSelected()) {
					Scope.getInstace().getCapture().settingLanguage(engRadioButton.getText());
				}
			}
			
		});
		korRadioButton.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				// TODO Auto-generated method stub
				if(korRadioButton.isSelected()){
					Scope.getInstace().getCapture().settingLanguage(korRadioButton.getText());
				}
			}
			
		});
		
		scope.setOcrToggleButton(ocrToggleButton);

		nodeList1.setTranslateX(com.sun.glass.ui.Screen.getMainScreen().getWidth() - 200);
		nodeList1.setTranslateY(com.sun.glass.ui.Screen.getMainScreen().getHeight() - 1100);

		nodeList1.addAnimatedNode(misoButton);
		nodeList1.addAnimatedNode(dicButton);
		nodeList1.addAnimatedNode(encButton);
		nodeList1.addAnimatedNode(imgButton);
		nodeList1.addAnimatedNode(mapButton);
		nodeList1.addAnimatedNode(videoButton);
		nodeList1.addAnimatedNode(tlsButton);
		nodeList1.addAnimatedNode(prefButton);
		nodeList1.addAnimatedNode(ocrPane);

		nodeList1.setRotate(-180);
		parent.getChildren().add(nodeList1);
		nodeList1.setSpacing(10d);

		AnchorPane.setTopAnchor(nodeList1, parent.getPrefWidth());

	}

}
