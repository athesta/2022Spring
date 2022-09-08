package Die;

public class Die {

	//Instance Constants
	private final static int DEFAULT_NUM_FACES = 6;
	
	//Instance Variables
	private int faceValue;
	private int numFaces;
	
	/*
	 * Methods
	 */
	
	//Takes input of face value & number of faces
	//Returns nothing
	public Die(int v, int f) {
		this.faceValue 	= v;
		this.numFaces 	= f;
	}
	
	//Takes input of face value & uses default faces
	//Returns nothing
	public Die(int v) {
		this.faceValue	= v;
		this.numFaces 	= DEFAULT_NUM_FACES;
	}
	
	//Uses the default faces for both faceValue & numFaces
	//Returns nothing
	public Die() {
		this.numFaces 	= DEFAULT_NUM_FACES;
		this.faceValue 	= DEFAULT_NUM_FACES;
	}
	
	//copyConstructor
	public Die (Die d) {
		this.faceValue = d.faceValue;
		this.numFaces  = d.numFaces;
	}
	
	//Returns the faceValue of the instance
	public int getFaceValue() {
		return this.faceValue;
	}
	
	//Returns the numFaces of the die
	public int getNumFaces() {
		return this.numFaces;
	}
	
	//sets the faceValue of the die to the supplied value
	public void setFaceValue (int v) {
		this.faceValue = v;
	}
	
	//Return message of the die roll
	public String toString() {
		return String.format("(" + faceValue + ")");
	}
	
	//Rolls the die to a new face value
	public void roll () {
		this.faceValue 	= (int)(Math.random() * this.numFaces)+1;
		
	}
		
}
