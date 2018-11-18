package gui;

import java.awt.Color;

import movement.Character;
import movement.KinematicSeek;
import movement.KinematicWandering;
import movement.Vector2D;

public class Main {

	public static void main(String[] args) {
		Character c1 = new Character(new Vector2D(200, 200), 0, new Vector2D(1, 1), 0, Color.RED);
		Character c2 = new Character(new Vector2D(700, 700), 0, new Vector2D(0, 0), 0, Color.BLUE);
		//Character c3 = new Character(new Vector2D(200, 200), 0, new Vector2D(1, 1), 0, Color.GREEN);
		Demo demo = new Demo();
		demo.setVisible(true);
		GameLoop gameLoop = new GameLoop(true, demo, c1, c2);
		gameLoop.setWandering(new KinematicWandering(c1, 5, 1));
		gameLoop.setSeek(new KinematicSeek(c2, c1, 5));
		new Thread(gameLoop).start();
	}

}
