package com.xavier.common;

import javafx.scene.control.Alert;

public class Dialog {

	public static void alert(final String msg,final Alert.AlertType type) {
		Alert alert = new Alert(type, msg.toString());
		alert.showAndWait();
	}
}
