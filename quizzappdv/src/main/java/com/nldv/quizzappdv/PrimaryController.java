package com.nldv.quizzappdv;

import com.nldv.ultis.MyAlertSingleton;
import com.nldv.ultis.themes.MyThemeTypes;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;



public class PrimaryController implements Initializable{
    @FXML private ComboBox<MyThemeTypes> cbThemes; 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(MyThemeTypes.values()));
    }
    public void manageQuestion(ActionEvent e){ 
        MyAlertSingleton.getInstance().showMsg("Coming soon...");
    }
    
    public void pratice(ActionEvent e){ 
         MyAlertSingleton.getInstance().showMsg("Coming soon...");
    }
    
    public void exam(ActionEvent e){ 
         MyAlertSingleton.getInstance().showMsg("Coming soon...");
    }
    
    public void changeThemes(ActionEvent e){ 
        this.cbThemes.getSelectionModel().getSelectedItem().updateTheme(this.cbThemes.getScene());
    }

    
    
}
