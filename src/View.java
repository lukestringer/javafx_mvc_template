import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class View {

    private Model _model;
    private StackPane stackPane;
    private Button button;

    public View(Model model) {
        _model = model;
        stackPane = new StackPane();
        addButton();
    }

    private void addButton() {
        button = new Button("Button clicked: 0");
        stackPane.getChildren().add(button);
    }

    public void updateButtonNumber(Integer newNumber) {
        button.setText("Button clicked: " + newNumber);
    }

    public StackPane getRootNode() {
        return stackPane;
    }

    public void addActionHandler(Contoller.ActionHandler actionHandler) {
        button.setOnAction(actionHandler);
    }
}
