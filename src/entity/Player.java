package entity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.KeyHandler;

public class Player extends Entity{

	GamePanel gp;
	KeyHandler keyH;
	
	public Player(GamePanel gp, KeyHandler keyH) {
		
		this.gp = gp;
		this.keyH = keyH;
		
		setDefaultVal();
		getPlayerImage();
	}
	
	public void setDefaultVal() {
		x = 100;
		y = 100;
		speed = 4;
		direction = "right";
		prevDirection = "right";
	}
	
	public void getPlayerImage() {
		
		try {
			
			pil1 = ImageIO.read(getClass().getResourceAsStream("/player/wizardL_idle_1.png"));
			pil2 = ImageIO.read(getClass().getResourceAsStream("/player/wizardL_idle_2.png"));
			pil3 = ImageIO.read(getClass().getResourceAsStream("/player/wizardL_idle_3.png"));
			pil4 = ImageIO.read(getClass().getResourceAsStream("/player/wizardL_idle_4.png"));
			pil5 = ImageIO.read(getClass().getResourceAsStream("/player/wizardL_idle_5.png"));
			pil6 = ImageIO.read(getClass().getResourceAsStream("/player/wizardL_idle_6.png"));
			pil7 = ImageIO.read(getClass().getResourceAsStream("/player/wizardL_idle_7.png"));
			pil8 = ImageIO.read(getClass().getResourceAsStream("/player/wizardL_idle_8.png"));
			pil9 = ImageIO.read(getClass().getResourceAsStream("/player/wizardL_idle_9.png"));
			pil10 = ImageIO.read(getClass().getResourceAsStream("/player/wizardL_idle_10.png"));
			pir1 = ImageIO.read(getClass().getResourceAsStream("/player/wizardR_idle_1.png"));
			pir2 = ImageIO.read(getClass().getResourceAsStream("/player/wizardR_idle_2.png"));
			pir3 = ImageIO.read(getClass().getResourceAsStream("/player/wizardR_idle_3.png"));
			pir4 = ImageIO.read(getClass().getResourceAsStream("/player/wizardR_idle_4.png"));
			pir5 = ImageIO.read(getClass().getResourceAsStream("/player/wizardR_idle_5.png"));
			pir6 = ImageIO.read(getClass().getResourceAsStream("/player/wizardR_idle_6.png"));
			pir7 = ImageIO.read(getClass().getResourceAsStream("/player/wizardR_idle_7.png"));
			pir8 = ImageIO.read(getClass().getResourceAsStream("/player/wizardR_idle_8.png"));
			pir9 = ImageIO.read(getClass().getResourceAsStream("/player/wizardR_idle_9.png"));
			pir10 = ImageIO.read(getClass().getResourceAsStream("/player/wizardR_idle_10.png"));
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void update() {
		
		if(keyH.upPressed == true) {
			
			if(keyH.upPressed == true && keyH.leftPressed == true) {
				
				direction = "left";
				prevDirection = "left";
				x -= (speed / 2);
				y -= (speed / 2);
			} else if(keyH.upPressed == true && keyH.rightPressed == true) {
				
				direction = "right";
				prevDirection = "right";
				x += (speed / 2);
				y -= (speed / 2);
			} else {
				
				direction = "up";
				y -= speed;
			}
		} else if(keyH.downPressed == true) {
			
			if(keyH.downPressed == true && keyH.leftPressed == true) {
				
				direction = "left";
				prevDirection = "left";
				x -= (speed / 2);
				y += (speed / 2);
			} else if(keyH.downPressed == true && keyH.rightPressed == true) {
				
				direction = "right";
				prevDirection = "right";
				x += (speed / 2);
				y += (speed / 2);
			} else {
				
				direction = "down";
				y += speed;
			}
		} else if(keyH.leftPressed == true) {
			
			direction = "left";
			prevDirection = "left";
			x -= speed;
		} else if(keyH.rightPressed == true) {
			
			direction = "right";
			prevDirection = "right";
			x += speed;
		}
		
		spriteCounter++;
		if(spriteCounter > 3) {
			
			if(spriteNum == 1) {
				
				spriteNum = 2;
			} else if(spriteNum == 2) {
				
				spriteNum = 3;
			} else if(spriteNum == 3) {
				
				spriteNum = 4;
			} else if(spriteNum == 4) {
				
				spriteNum = 5;
			} else if(spriteNum == 5) {
				
				spriteNum = 6;
			} else if(spriteNum == 6) {
				
				spriteNum = 7;
			} else if(spriteNum == 7) {
				
				spriteNum = 8;
			} else if(spriteNum == 8) {
				
				spriteNum = 9;
			} else if(spriteNum == 9) {
				
				spriteNum = 10;
			} else if(spriteNum == 10) {
				
				spriteNum = 1;
			}
			spriteCounter = 0;
		}
	}
	
	public void draw(Graphics2D g2) {
		
		BufferedImage image = null;
		
		switch(direction) {
		
		case "up":
			if(prevDirection == "right") {
				
				if(spriteNum == 1) {
					image = pir1;
				} else if(spriteNum == 2) {
					image = pir2;
				} else if(spriteNum == 3) {
					image = pir3;
				} else if(spriteNum == 4) {
					image = pir4;
				} else if(spriteNum == 5) {
					image = pir5;
				} else if(spriteNum == 6) {
					image = pir6;
				} else if(spriteNum == 7) {
					image = pir7;
				} else if(spriteNum == 8) {
					image = pir8;
				} else if(spriteNum == 9) {
					image = pir9;
				} else if(spriteNum == 10) {
					image = pir10;
				}
			} else if(prevDirection == "left") {
				
				if(spriteNum == 1) {
					image = pil1;
				} else if(spriteNum == 2) {
					image = pil2;
				} else if(spriteNum == 3) {
					image = pil3;
				} else if(spriteNum == 4) {
					image = pil4;
				} else if(spriteNum == 5) {
					image = pil5;
				} else if(spriteNum == 6) {
					image = pil6;
				} else if(spriteNum == 7) {
					image = pil7;
				} else if(spriteNum == 8) {
					image = pil8;
				} else if(spriteNum == 9) {
					image = pil9;
				} else if(spriteNum == 10) {
					image = pil10;
				}
			}
			break;
		case "left":
			if(spriteNum == 1) {
				image = pil1;
			} else if(spriteNum == 2) {
				image = pil2;
			} else if(spriteNum == 3) {
				image = pil3;
			} else if(spriteNum == 4) {
				image = pil4;
			} else if(spriteNum == 5) {
				image = pil5;
			} else if(spriteNum == 6) {
				image = pil6;
			} else if(spriteNum == 7) {
				image = pil7;
			} else if(spriteNum == 8) {
				image = pil8;
			} else if(spriteNum == 9) {
				image = pil9;
			} else if(spriteNum == 10) {
				image = pil10;
			}
			break;
		case "down":
			if(prevDirection == "right") {
				
				if(spriteNum == 1) {
					image = pir1;
				} else if(spriteNum == 2) {
					image = pir2;
				} else if(spriteNum == 3) {
					image = pir3;
				} else if(spriteNum == 4) {
					image = pir4;
				} else if(spriteNum == 5) {
					image = pir5;
				} else if(spriteNum == 6) {
					image = pir6;
				} else if(spriteNum == 7) {
					image = pir7;
				} else if(spriteNum == 8) {
					image = pir8;
				} else if(spriteNum == 9) {
					image = pir9;
				} else if(spriteNum == 10) {
					image = pir10;
				}
			} else if(prevDirection == "left") {
				
				if(spriteNum == 1) {
					image = pil1;
				} else if(spriteNum == 2) {
					image = pil2;
				} else if(spriteNum == 3) {
					image = pil3;
				} else if(spriteNum == 4) {
					image = pil4;
				} else if(spriteNum == 5) {
					image = pil5;
				} else if(spriteNum == 6) {
					image = pil6;
				} else if(spriteNum == 7) {
					image = pil7;
				} else if(spriteNum == 8) {
					image = pil8;
				} else if(spriteNum == 9) {
					image = pil9;
				} else if(spriteNum == 10) {
					image = pil10;
				}
			}
			break;
		case "right":
			if(spriteNum == 1) {
				image = pir1;
			} else if(spriteNum == 2) {
				image = pir2;
			} else if(spriteNum == 3) {
				image = pir3;
			} else if(spriteNum == 4) {
				image = pir4;
			} else if(spriteNum == 5) {
				image = pir5;
			} else if(spriteNum == 6) {
				image = pir6;
			} else if(spriteNum == 7) {
				image = pir7;
			} else if(spriteNum == 8) {
				image = pir8;
			} else if(spriteNum == 9) {
				image = pir9;
			} else if(spriteNum == 10) {
				image = pir10;
			}
			break;
		}
		//g2.drawRect(x, y, gp.playerSize, gp.playerSize);
		g2.drawImage(image, x, y, gp.playerSize, gp.playerSize, null);
	}
}
