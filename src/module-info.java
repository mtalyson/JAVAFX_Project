module Workshop_JavaFX_JDBC {
	requires javafx.controls;
	requires javafx.fxml;
	
	exports gui;
	
	opens application to javafx.graphics, javafx.fxml;
	opens model.entities to javafx.base;
	opens gui;
}
