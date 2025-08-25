package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	public boolean upPressed, leftPressed, downPressed, rightPressed;
		
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int code = e.getKeyCode();
		
		if(code == KeyEvent.VK_W) {
			
			upPressed = true;
		} else if(code == KeyEvent.VK_A) {
			
			leftPressed = true;
		} else if(code == KeyEvent.VK_S) {
			
			downPressed = true;
		} else if(code == KeyEvent.VK_D) {
			
			rightPressed = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int code = e.getKeyCode();
		
		if(code == KeyEvent.VK_W) {
			
			upPressed = false;
		} else if(code == KeyEvent.VK_A) {
			
			leftPressed = false;
		} else if(code == KeyEvent.VK_S) {
			
			downPressed = false;
		} else if(code == KeyEvent.VK_D) {
			
			rightPressed = false;
		}
	}

}
