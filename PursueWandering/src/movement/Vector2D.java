package movement;

public class Vector2D {
	private float x;
	private float z;
	
	public Vector2D() {
		super();
	}
	
	public Vector2D(float x, float z) {
		super();
		this.x = x;
		this.z = z;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Vector2D [x=" + x + ", z=" + z + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(x);
		result = prime * result + Float.floatToIntBits(z);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vector2D other = (Vector2D) obj;
		if (Float.floatToIntBits(x) != Float.floatToIntBits(other.x))
			return false;
		if (Float.floatToIntBits(z) != Float.floatToIntBits(other.z))
			return false;
		return true;
	}
	
	public static Vector2D addVector2D(Vector2D v1, Vector2D v2) {
		return new Vector2D(v1.getX() + v2.getX(), v1.getZ() + v2.getZ());
	}
	
	public Vector2D addVector2D(Vector2D v){
        this.x += v.getX();
        this.z += v.getZ();
        return this;
    }
	
	public Vector2D subVector2D(Vector2D v1, Vector2D v2) {
		return new Vector2D(v1.getX() - v2.getX(), v1.getZ() - v2.getZ());
	}
	
	public Vector2D subVector2D(Vector2D v) {
		this.x -= v.getX();
		this.z -= v.getZ();
		return this;
	}
	
	public static Vector2D mulConstant(Vector2D vector2d, float constant) {
		return new Vector2D(vector2d.getX() * constant, vector2d.getZ() * constant);
	}
	
	public Vector2D mulConstant(float constant) {
		this.x *= constant;
		this.z *= constant;
		return this;
	}
	
	public float lenght() {
		return (float) Math.sqrt(x * x + z * z);
	}
	
	public void normalize() {
		float len = this.lenght();
		this.x /= len;
		this.z /= len;
	}
}
