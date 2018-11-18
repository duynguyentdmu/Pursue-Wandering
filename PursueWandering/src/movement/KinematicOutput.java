package movement;

public class KinematicOutput {
	private Vector2D velocity;
    private float rotation;

    public KinematicOutput(Vector2D velocity, float rotation) {
        this.velocity = velocity;
        this.rotation = rotation;
    }

    public KinematicOutput() {
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
        return "KinematicOutput{" + "velocity=" + velocity + ", rotation=" + rotation + '}';
    }
    
    
}
