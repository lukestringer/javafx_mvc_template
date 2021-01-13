package GUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Controller {

    Model _model;
    View _view;

    public Controller(View view, Model model) {
        _model = model;
        _view = view;
        view.addButtonClickedActionHandler(new ButtonClickedActionHandler());
    }

    public class ButtonClickedActionHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            //update model and view
            Integer newButtonNumber = _model.buttonClicked();
            _view.updateButtonNumber(newButtonNumber);
        }
    }
}
