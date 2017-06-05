package view;

import controller.Controller;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import methods.Numbers;

public class Main extends Application {
	Numbers num = new Numbers();
	Controller cont = new Controller(num);
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Game");
		GridPane gridpane = new GridPane();
		Scene scene = new Scene(gridpane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Text num = new Text(cont.number());
		gridpane.add(num, 0, 0);
		
		Button btnplus = new Button("+1");
		gridpane.add(btnplus, 0, 1);
		
		btnplus.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				cont.plusNumber();
				num.setText(cont.number());
			}
		});
		Button btnminus = new Button("-1");
		gridpane.add(btnminus, 1, 1);
		
		btnminus.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				cont.minusOne();
				num.setText(cont.number());
			}
			
		});
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
