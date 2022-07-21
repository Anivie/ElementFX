import ink.bluecloud.css.CssResources;
import ink.bluecloud.css.ElementButton;
import ink.bluecloud.css.ElementButtonKt;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

class mains extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button();
        ElementButtonKt.theme(button, ElementButton.grayButton);
        Scene scene = new Scene(new TextField());
        scene.getStylesheets().add(CssResources.globalCssFile);


        primaryStage.setScene(scene);
        primaryStage.setTitle("ElementForJavaFX");
        primaryStage.show();
    }
}