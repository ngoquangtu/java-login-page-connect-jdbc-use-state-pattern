/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtbcourse.View.StateUI;
import dtbcourse.View.Login;

/**
 *
 * @author ngoqu
 */
public class LoginState  implements UIState{
     @Override
    public void renderUI() {
        Login login=new Login();
        login.setVisible(true);
    }     
}
