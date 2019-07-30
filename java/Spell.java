public class Spell {
	private TransformingObject[] tObjs;
	private int length = 0;
	private String nameOfSpell = "";
	private int magicalEnergy = 0;
	
	public Spell () throws Exception {
		super();
	}
	
	public Spell(String n, int me) throws Exception {
		nameOfSpell = n;
		magicalEnergy = me;
		tObjs = new TransformingObject[100];
	}
	
	public String getNameOfSpell() throws Exception {
		return nameOfSpell;
	}
	
	public void addTransformingObject(String from, String to) throws Exception {
		if (length < 100) {
			if (searchIndex(from) == -1) { // check if the transforming object is already in the transforming object list for the spell
				tObjs[length] = new TransformingObject(from, -1);
				
				if (searchIndex(to) == -1) { // check if the transforming object is already in the transforming object list for the spell
					tObjs[length] = new TransformingObject(to, -1);
					length++;
				}
				
				tObjs[searchIndex(from)].setTransformationIndex(searchIndex(to)); // point object to what it transforms to
				length++;
			}
		}
	}
	
	public void addTransformingObject(TransformingObject tObj) throws Exception {
		if (length < 100) {
			tObjs[length] = tObj;
			length++;
		}
	}
	
	public int searchIndex(String s) throws Exception {
		for (int i = 0; i < length; i++) {
			if (tObjs[i].getName().equals(s)) {
				return i;
			}
		}
		
		return -1;
	}
	
	//public boolean 
}
