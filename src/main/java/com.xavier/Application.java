package com.xavier;

import com.xavier.frame.HelloworldView;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;

@SpringBootApplication
public class Application extends AbstractJavaFxApplicationSupport{
    public static void main(String[] args) {
        launch(Application.class, HelloworldView.class, args);
    }
}
