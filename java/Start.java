import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		Scanner sc = null;
		String input = "";
		int numberOfSpells = 0;
		SpellBook spellBook = null;
		String n = "";
		int me = 0;
		Spell aSpell = null;
		int numberOfTPs = 0;
		String from = "";
		String to = "";
		TransformingObject transformingObject;
		int availableMagicEnergy = 0;
		String initialObject = "";
		String desiredObject = "";
		
		try {
			spellBook = new SpellBook();
			sc = new Scanner(System.in);
			input = sc.nextLine(); // number of spells input
			numberOfSpells = (!input.equals("") && !input.equals(null)) ? Integer.parseInt(input) : 0;
			
			while (numberOfSpells > 0) {
				n = sc.nextLine(); // name of spell input
				input = sc.nextLine(); // magical energy consumed by spell
				me = (!input.equals("") && !input.equals(null)) ? Integer.parseInt(input) : 0;
				aSpell = new Spell(n, me);
				input = sc.nextLine(); // number of transforming objects pairs for the spell
				numberOfTPs = (!input.equals("") && !input.equals(null)) ? Integer.parseInt(input) : 0;
				
				while (numberOfTPs > 0) {
					transformingObject = new TransformingObject();
					from = sc.nextLine(); // number of transforming objects pairs for the spell
					to = sc.nextLine(); // number of transforming objects pairs for the spell
					aSpell.addTransformingObject(from, to);
					numberOfTPs--;
				}
				
				spellBook.addSpell(aSpell);
			}
			
			input = sc.nextLine(); // number of spells input
			availableMagicEnergy = (!input.equals("") && !input.equals(null)) ? Integer.parseInt(input) : 0;
			initialObject = sc.nextLine(); // number of spells input
			desiredObject = sc.nextLine(); // number of spells input
			
			// cast spell
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void castSpell(String iObj, String dObj, SpellBook sb) throws Exception {
		
	}
}