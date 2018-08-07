/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wct9tfcalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author wthuston
 */
public class FXMLDocumentController implements Initializable {
    String text = "";
    double number1 = 0;
    double number2 = 0;
    char operation;
    
    @FXML
    private TextField textField;
    
    @FXML
    private void keyPressed(KeyEvent ke) {
        switch (ke.getCode()){
            case BACK_SPACE:
                text = "";
                textField.setText(text);
                break;
            case ENTER:
                try {
                    switch (operation){
                        case '+':
                            number2= Float.parseFloat(text);
                            text=""+(number1+number2);
                            break;
                        case '-':
                            number2= Float.parseFloat(text);
                            text=""+(number1-number2);
                            break;
                        case '*':
                            number2= Float.parseFloat(text);
                            text=""+(number1*number2);
                            break;
                        case '/':
                            number2= Float.parseFloat(text);
                            text=""+(number1/number2);
                            break;
                        default:
                            text = "ERROR";
                            break;
                                }
                }
            catch (java.lang.NumberFormatException error){
                text = "ERROR";
            }
            textField.setText(text);
                break;
        }
    }
    
    @FXML
    private void keyTyped(KeyEvent ke){
        switch(ke.getCharacter()){
            case ".":
                text += ".";
                textField.setText(text);
                break;
            case "1":
                text += "1";
                textField.setText(text);
                break;  
            case "2":
                text += "2";
                textField.setText(text);
                break;   
            case "3":
                text += "3";
                textField.setText(text);
                break;        
            case "4":
                text += "4";
                textField.setText(text);
                break;   
            case "5":
                text += "5";
                textField.setText(text);
                break;        
            case "6":
                text += "6";
                textField.setText(text);
                break;   
            case "7":
                text += "7";
                textField.setText(text);
                break;    
            case "8":
                text += "8";
                textField.setText(text);
                break;    
            case "9":
                text += "9";
                textField.setText(text);
                break;      
            case "0":
                text += "0";
                textField.setText(text);
                break;     
            case "*":
                if (text.length()>0) number1=Float.parseFloat(text);
                operation = '*';
                text="";
                textField.setText("*");
                break;
            case "/":
                if (text.length()>0) number1=Float.parseFloat(text);
                operation = '/';
                text="";
                textField.setText("/");
                break;            
            case "+":
                if (text.length()>0) number1=Float.parseFloat(text);
                operation = '+';
                text="";
                textField.setText("+");
                break;      
            case "-":
                if (text.length()>0) number1=Float.parseFloat(text);
                operation = '-';
                text="";
                textField.setText("-");
                break;                
        }
    }
          
    @FXML
    private void clearbutton(ActionEvent event) {
        text="";
        textField.setText(text);
    }
    @FXML
    private void dividebutton(ActionEvent event) {
        if (text.length()>0) number1=Float.parseFloat(text);
        operation='/';
        text="";
        textField.setText("/");
    }
    
    @FXML
    private void multbutton(ActionEvent event){
        if(text.length()>0) number1=Float.parseFloat(text);
        operation='*';
        text="";
        textField.setText("*");
    }
    
    @FXML
    private void subtractbutton(ActionEvent event){
        if(text.length()>0) number1=Float.parseFloat(text);
        operation='-';
        text="";
        textField.setText("-");
    }
    @FXML
    private void addbutton(ActionEvent event){
        if(text.length()>0) number1=Float.parseFloat(text);
        operation='+';
        text="";
        textField.setText("+");
    }
    @FXML
    private void button1(ActionEvent event){
        text += "1";
        textField.setText(text);
    }
    @FXML
    private void button2(ActionEvent event){
        text += "2";
        textField.setText(text);        
    }
    @FXML
    private void button3(ActionEvent event){
        text += "3";
        textField.setText(text);        
    }
    @FXML
    private void button4(ActionEvent event){
        text += "4";
        textField.setText(text);        
    }
    @FXML
    private void button5(ActionEvent event){
        text += "5";
        textField.setText(text);        
    }
    @FXML
    private void button6(ActionEvent event){
        text += "6";
        textField.setText(text);        
    }  
    @FXML
    private void button7(ActionEvent event){
        text += "7";
        textField.setText(text);        
    }  
    @FXML
    private void button8(ActionEvent event){
        text += "8";
        textField.setText(text);        
    }    
    @FXML
    private void button9(ActionEvent event){
        text += "9";
        textField.setText(text);        
    }    
    @FXML
    private void button0(ActionEvent event){
        text += "0";
        textField.setText(text);        
    }    
    @FXML
    private void pointbutton(ActionEvent event){
        text += ".";
        textField.setText(text);        
    }    
    @FXML
    private void equalbutton(ActionEvent event){
        try{
            switch(operation){
                case '+':
                    number2 = Float.parseFloat(text);
                    text=""+(number1+number2);
                    break;
                case '-':
                    number2 = Float.parseFloat(text);
                    text=""+(number1-number2);
                    break;   
                case '*':
                    number2 = Float.parseFloat(text);
                    text=""+(number1*number2);
                    break;  
                case '/':
                    number2 = Float.parseFloat(text);
                    text=""+(number1/number2);
                    break;      
                default:
                    text="ERROR";
                    break;
            }
        }
        catch(java.lang.NumberFormatException error){
            text="ERROR";
        }
        textField.setText(text);
    }
    
    @FXML
    private void exitCalculator(){
       System.exit(1);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
