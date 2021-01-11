
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        //launch sets up the application then calls start()
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Model model = new Model();
        View view = new View(model);
        new Contoller(view, model);

        int width = 600;
        int height = 400;
        String title = "Default Title";//todo change default title
        stage.setScene(new Scene(view.getRootNode(), width, height));
        //set up scene further here e.g. min height
        stage.setTitle(title);

        stage.show();
    }
}
