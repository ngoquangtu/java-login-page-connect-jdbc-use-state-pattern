package dtbcourse.View.StateUI;

public class UIManager {
    private static final UIManager INSTANCE = new UIManager();
    public static UIManager getInstance() {
        return INSTANCE;
    }
    private  UIState currentState=new LoginState();

    public  void setUIState(UIState state) {
        this.currentState = state;
    }   
    public void renderUI() {
           this.currentState.renderUI();
    }
    
}
