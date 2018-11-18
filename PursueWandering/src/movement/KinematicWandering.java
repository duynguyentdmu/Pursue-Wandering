package movement;

public class KinematicWandering {
	private Character character;
	private float maxSpeed;
	private float maxRotation;
	
	public KinematicWandering() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KinematicWandering(Character character, float maxSpeed, float maxRotation) {
		super();
		this.character = character;
		this.maxSpeed = maxSpeed;
		this.maxRotation = maxRotation;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public float getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public float getMaxRotation() {
		return maxRotation;
	}

	public void setMaxRotation(float maxRotation) {
		this.maxRotation = maxRotation;
	}
	
	public KinematicOutput generateKinematicOutput() {
		Vector2D velocity = new Vector2D();
		velocity.setX((float) Math.sin(character.getOrientation()));
		velocity.setZ((float) Math.cos(character.getOrientation()));
		velocity.mulConstant(maxSpeed);
		
		return new KinematicOutput(velocity, (float) (Math.random()-Math.random())*maxRotation);
	}
}
