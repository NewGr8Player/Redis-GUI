package com.xavier.controller;

import com.xavier.service.LoginService;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;

@FXMLController
public class LoginController {

	@FXML
	private TextField host;
	@FXML
	private TextField account;
	@FXML
	private TextField password;
	@FXML
	private TextField port;

	@Autowired
	private LoginService loginService;

	@FXML
	public void confirmBtn() {
		if (this.loginService.login(host.getText(), account.getText(), password.getText(), port.getText())) {
		}
	}
}
