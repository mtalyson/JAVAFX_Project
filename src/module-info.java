module Workshop_JavaFX_JDBC {
	requires javafx.controls;
	requires javafx.fxml;
	
	exports gui;
	
	opens application to javafx.graphics, javafx.fxml;
	opens gui;
}
