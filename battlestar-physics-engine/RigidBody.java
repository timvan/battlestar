class RigidBody {
	private Vector2D location;
	private Vector2D velocity;
	private Vector2D acceleration;

	private double maxSpeed;

	private double mass;

	RigidBody(double x_, double y_){
		location = new Vector2D(x_, y_);
		velocity = new Vector2D(0, 0);
		acceleration = new Vector2D(0, 0);
		mass = 1;
		maxSpeed = 10;
	}

	void update() {
		velocity.add(acceleration);
		velocity.limit(maxSpeed);
		location.add(velocity);
	}


	/*  DISPLAY FUNCTION HERE */


	/*  EDGE WRAPPING / WALL FUNCTIONS HERE */


	/*  EDGE WRAPPING FUNCTIONS HERE */

	/*	RIGID BODY FORCE */

	private void applyForce(Vector2D force) {
		force.div(mass)
		acceleration.add(force);
	}

	public static void main(String[] args) {
		Vector2D program = new Vector2D(0, 0);
		program.run();
	}

	private void run() {
		boolean testing = false;
		assert(testing = true);
		if (! testing) throw new Error("Use java -ea Vector2D");
		testApplyForce();

	}

	private void testApplyForce() {
		RigidBody rb = new RigidBody(0, 0);
		rb.mass = 1;
		rb.applyForce(new Vector2D(1, 1));
		assert(rb.acceleration.x == 1);
		assert(rb.acceleration.y == 1);

	}


}