import dto.StudentDTO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.time.LocalDate;

public class AppInitializer extends Application {
    public static void main(String args[]) {
        launch(args);


    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("view/LoginForm.fxml"))));
        primaryStage.setTitle("Hostel Management System");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
