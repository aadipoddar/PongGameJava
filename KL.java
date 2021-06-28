import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KL implements KeyListener
{
    private boolean keyPressed[] = new boolean[128];
    
    public void keyTyped(KeyEvent keyEvent)
    {

    }

    public void keyPressed(KeyEvent keyEvent)
    {
        keyPressed[keyEvent.getKeyCode()] = true;
    }

    public void keyReleased(KeyEvent keyEvent)
    {
        keyPressed[keyEvent.getKeyCode()] = false;
    }

    public boolean isKeyPressed(int keyCode)
    {
        return keyPressed[keyCode];
    }
}