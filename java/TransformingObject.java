public class TransformingObject {
	private String name = null;
	private int transformationIndex = -1;
	
	public TransformingObject() throws Exception {
		super();
	}
	
	public TransformingObject(String n, int ti) throws Exception {
		name = n;
		transformationIndex = ti;
	}
	
	public String getName() throws Exception {
		return name;
	}
	
	public void setName(String n) throws Exception {
		name = n;
	}
	
	public int getTransformationIndex() throws Exception {
		return transformationIndex;
	}
	
	public void setTransformationIndex(int ti) throws Exception {
		transformationIndex = ti;
	} 
}
