public class SpellBook {
	private Spell[] spells;
	private int length = 0;
	
	public SpellBook() throws Exception {
		super();
		spells = new Spell[100];
	}
	
	public void addSpell(String n, int me) throws Exception {
		if (length < 100) {
			spells[length] = new Spell(n, me);
			length++;
		}
	}
	
	public void addSpell(Spell s) throws Exception {
		if (length < 100) {
			spells[length] = s;
			length++;
		}
	}
}
