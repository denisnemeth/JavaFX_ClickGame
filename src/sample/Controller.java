package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Controller {

    Field field = new Field();
    public Button btn_0;
    public Button btn_1;
    public Button btn_2;
    public Button btn_3;

    public void clickBtn(ActionEvent actionEvent) {
        String buttonValue = ((Button)actionEvent.getSource()).getId().substring(4);
        int code = Integer.parseInt(buttonValue);
        field.changeNumbers(code);
        displayNumbers();
    }
    public void displayNumbers() {
        Tile[][] arr = field.getArr();
        btn_0.setText(String.valueOf(arr[0][0].getValue()));
        btn_1.setText(String.valueOf(arr[1][0].getValue()));
        btn_2.setText(String.valueOf(arr[0][1].getValue()));
        btn_3.setText(String.valueOf(arr[1][1].getValue()));
    }
}
