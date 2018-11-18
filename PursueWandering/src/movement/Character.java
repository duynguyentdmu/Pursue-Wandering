package movement;

import java.awt.Color;
import java.awt.Graphics;

public class Character {
	private Vector2D position;
    private float orientation;
    private Vector2D velocity;
    private float rotation;
    private Color color;

    public Character() {
    }

    public Character(Vector2D position, float orientation, Vector2D velocity, float rotation, Color color) {
        this.position = position;
        this.orientation = orientation;
        this.velocity = velocity;
        this.rotation = rotation;
        this.color = color;
    }

    public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Vector2D getPosition() {
        return position;
    }

    public void setPosition(Vector2D position) {
        this.position = position;
    }

    public float getOrientation() {
        return orientation;
    }

    public void setOrientation(float orientation) {
        this.orientation = orientation;
    }

    public Vector2D getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector2D velocity) {
        this.velocity = velocity;
    }

    public float getRotation() {
        return rotation;
    }

    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return "Character{" + "position=" + position + ", orientation=" + orientation + ", velocity=" + velocity + ", rotation=" + rotation + '}';
    }
    
    public void update(KinematicOutput kinematicOutput, float time) {
        this.velocity = kinematicOutput.getVelocity();
        this.rotation = kinematicOutput.getRotation();
        
        this.position = this.position.addVector2D(Vector2D.mulConstant(velocity, time));
        this.orientation = this.rotation * time;
    }
    
    public void render(Graphics g, int radius) {
    	g.setColor(color);
    	g.drawOval((int) position.getX(), (int) position.getZ(), radius * 2, radius * 2);
    	g.drawLine((int) position.getX() + radius, (int) position.getZ() + radius, (int) (position.getX() + radius + radius * Math.sin(orientation)), (int) (position.getZ() + radius + radius * Math.cos(orientation)));
    }
}
