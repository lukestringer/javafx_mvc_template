package GUI;

public class Model {
    private Integer clickCounter;

    public Model() {
        clickCounter = 0;
    }

    public Integer buttonClicked() {
        return ++clickCounter;
    }
}
