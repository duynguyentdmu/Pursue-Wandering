package gui;

import movement.*;
import movement.Character;

public class GameLoop implements Runnable {
	
	private boolean isRunning;
	private Demo demo;
	private Character character1;
	private Character character2;
	private KinematicWandering wandering;
	private KinematicSeek seek;





	public boolean getIsRunning() {
		return isRunning;
	}

	public void setIsRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	public Demo getDemo() {
		return demo;
	}

	public void setDemo(Demo demo) {
		this.demo = demo;
	}

	public KinematicWandering getWandering() {
		return wandering;
	}

	public void setWandering(KinematicWandering wandering) {
		this.wandering = wandering;
	}

	public KinematicSeek getSeek() {
		return seek;
	}

	public void setSeek(KinematicSeek seek) {
		this.seek = seek;
	}

	public GameLoop(boolean isRunning, Demo demo, Character character1, Character character2) {
		super();
		this.isRunning = isRunning;
		this.demo = demo;
		this.character1 = character1;
		this.character2 = character2;
	}

	@Override
	public void run() {
		while (isRunning) {
			// update
			demo.getGraphics().clearRect(0, 0, demo.getWidth(), demo.getHeight());
			character1.update(wandering.generateKinematicOutput(), 2);
			character2.update(seek.generateKinematicOutput(), 2);
			// render
			character1.render(this.demo.getGraphics(), 25);
			character2.render(this.demo.getGraphics(), 25);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("character 1:" + character1.toString());
			System.out.println("character 2:" + character2.toString());
		}

	}

}
