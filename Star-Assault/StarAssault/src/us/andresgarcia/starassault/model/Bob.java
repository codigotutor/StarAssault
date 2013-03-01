package us.andresgarcia.starassault.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Bob {
	
	float stateTime = 0;

	public enum State {
		IDLE, WALKING, JUMPING, DYING
	}

	public static final float SPEED = 4f;	// unit per second
	public static final float JUMP_VELOCITY = 1f;
	public static final float SIZE = 0.5f; // half a unit

	Vector2 	position = new Vector2();
	Vector2 	acceleration = new Vector2();
	Vector2 	velocity = new Vector2();
	Rectangle 	bounds = new Rectangle();
	State		state = State.IDLE;
	boolean		facingLeft = true;

	public Bob(Vector2 position) {
		this.position = position;
		this.bounds.height = SIZE;
		this.bounds.width = SIZE;
	}

	public Rectangle getBounds() {
		return this.bounds;
	}

	public Vector2 getPosition() {
		return this.position;
	}
	

	public void setState(State newState) {
		this.state = newState;
	}

	
	public void update(float delta) {
		stateTime += delta;
		position.add(velocity.tmp().mul(delta)); 
	}

	
	public void setFacingLeft(boolean b) {
		this.facingLeft = b;
	}

	public Vector2 getVelocity() {
		return velocity;
	}

	public Vector2 getAcceleration() {
		return acceleration;
	}

	
	public State getState() {
		
		return this.state;
	}

	public boolean isFacingLeft() {
		
		return this.facingLeft;
	}

	public float getStateTime() {
		
		return this.stateTime;
	}
	
}
