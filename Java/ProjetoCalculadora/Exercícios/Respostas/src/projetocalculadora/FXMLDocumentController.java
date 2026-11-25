package projetocalculadora;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;


public class FXMLDocumentController implements Initializable {

    
    @FXML 
    private TextField display;
    private Double first = null;
    private String pendingOp = null;   
    private boolean startNew = true;   


    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
        clearAll();
        
    }


    @FXML
    private void onDigit(ActionEvent e) 
    {
       
        String d = ((Button) e.getSource()).getText();  

 
        if (startNew || "0".equals(display.getText()) || isErrorShown()) 
        {
            
            display.setText(d);
            startNew = false;
            
        } 
        
        else 
        {
            
            display.appendText(d);
            
        }
        
    }

    @FXML
    private void onOp(ActionEvent e) 
    {
        
        if (isErrorShown()) 
        { 
            
            clearAll(); 
            return; 
        
        }

        String op = ((Button) e.getSource()).getText();
        
        double current = parseDisplay();

        if (first == null) 
        {

            first = current;
            
        } 
        
        else if (pendingOp != null && !startNew) 
        {
            
            first = apply(pendingOp, first, current);
            showResult(first);
            
        }

        pendingOp = op;
        startNew  = true; 
        
    }


    @FXML
    private void onEquals(ActionEvent e) 
    {
        
        if (isErrorShown()) 
        { 
            
            clearAll(); 
            return; 
        
        }
        
        if (pendingOp == null || first == null) 
        {
            
            return;
            
        }

        
        double b   = parseDisplay();
        double res = apply(pendingOp, first, b);
        showResult(res);

        first     = Double.isNaN(res) ? null : res;
        pendingOp = null;
        startNew  = true;
        
    }

    @FXML
    private void onClear(ActionEvent e) 
    {
        
        clearAll(); 
        
    }


    @FXML
    private void onClearEntry(ActionEvent e) 
    {
        
        display.setText("0");
        startNew = true; 
        
    }


    private void clearAll() 
    {
        
        display.setText("0");
        first = null;
        pendingOp = null;
        startNew = true;
        
    }

    private boolean isErrorShown() 
    {
        
        return "Erro".equalsIgnoreCase(display.getText());
        
    }

    private double parseDisplay() 
    {
        
        try 
        { 
            
            return Double.parseDouble(display.getText()); 
            
        }
        
        catch (NumberFormatException ex) 
        { 
            
            return Double.NaN; 
        
        }
        
    }

    private void showResult(double v) 
    {
        
        if (Double.isNaN(v) || Double.isInfinite(v)) 
        {
            
            display.setText("Erro");
            
        } 
        
        else if (Math.floor(v) == v) 
        {
            
            display.setText(String.valueOf((long) v));  
            
        } 
        
        else 
        {
            
            display.setText(String.valueOf(v));
            
        }
        
    }
    

    private double apply(String op, double a, double b) 
    {
        
        switch (op) 
        {
            
            case "+": 
                
                return a + b;
                
                
            case "-": 
                
                return a - b;
                
                
            case "*": 
                
                return a * b;
                
                
            case "/": 
                
                return (b == 0.0) ? Double.NaN : a / b;
                
                
            default:  
                
                return Double.NaN;
            
            
        }
        
    }
    
}
