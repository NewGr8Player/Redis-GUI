package com.xavier.controller;

import com.xavier.Application;
import com.xavier.frame.LoginView;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.stage.Modality;

@FXMLController
public class MainController {

	@FXML
	public void showLogin(){
		Application.showView(LoginView.class, Modality.APPLICATION_MODAL);
	}
}
