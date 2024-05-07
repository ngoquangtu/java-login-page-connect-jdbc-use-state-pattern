/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtbcourse.View.StateUI;
 import dtbcourse.View.Register;
/**
 *
 * @author ngoqu
 */
public class RegisterState implements UIState {
   
    @Override
    public void renderUI( ) {
        Register register=new Register();
        register.setVisible(true);
        
    }
    
}
