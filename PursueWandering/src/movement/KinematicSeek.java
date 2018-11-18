package movement;

public class KinematicSeek {
	private Character character;
	private Character target;
	float maxSpeed;
	
	public KinematicSeek() {
		super();
	}

	public KinematicSeek(Character character, Character target, float maxSpeed) {
		super();
		this.character = character;
		this.target = target;
		this.maxSpeed = maxSpeed;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public Character getTarget() {
		return target;
	}

	public void setTarget(Character target) {
		this.target = target;
	}

	public float getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public KinematicOutput generateKinematicOutput() {
		Vector2D velocity = new Vector2D();
		velocity = target.getPosition().subVector2D(target.getPosition(), character.getPosition());
		velocity.normalize();
		velocity.mulConstant(maxSpeed);
		return new KinematicOutput(velocity, character.getRotation());
	}
}
