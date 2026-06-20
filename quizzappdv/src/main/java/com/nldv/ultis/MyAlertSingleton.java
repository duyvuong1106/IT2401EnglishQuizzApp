/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nldv.ultis;

import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class MyAlertSingleton {
    private static MyAlertSingleton instance; 
    private final Alert alert = new Alert(Alert.AlertType.INFORMATION) ; 
    
    private MyAlertSingleton(){ 
        this.alert.setTitle("Quiz App cua DV");
        this.alert.setHeaderText("Quiz App");
    }
    
    public static MyAlertSingleton getInstance(){ 
        if(instance == null){ 
            instance = new MyAlertSingleton(); 
        }
        
        return instance; 
    }
    
    public void showMsg(String content){ 
        this.alert.setContentText(content);
        this.alert.show();
    }
}
