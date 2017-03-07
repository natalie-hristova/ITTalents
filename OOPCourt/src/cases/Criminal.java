package cases;

import java.util.HashSet;
import java.util.Iterator;

import citizens.*;
import people.*;

public class Criminal extends Case {

	private Prosecutor obvinitel;

	public Criminal(Judge judge, HashSet<JuryMan> juryMen, Defendant defendant, Accuser accuser,
			HashSet<Witness> witnesses,Prosecutor obvinitel) {
		super(judge, juryMen, defendant, witnesses, Type.CRIMINAL);
		this.obvinitel= obvinitel;
	}

	@Override
	protected boolean areJuryMenCorrect(HashSet<JuryMan> juryMen) {
		return juryMen.size() == 13;
	}

	@Override
	public void conduct() {
		super.conduct();
		obvinitel.setCases(obvinitel.getCases());
		prosecutorQuestions();
	}


	private void prosecutorQuestions() {
		for (int i = 0; i < 5; i++) {
			obvinitel.askCitizen(defendant);
			System.out.println(obvinitel.getName() + " asked question " + (i + 1));
		}

		for (Iterator iterator = witnesses.iterator(); iterator.hasNext();) {
			Witness witness = (Witness) iterator.next();
			for (int i = 0; i < 5; i++) {
				obvinitel.askCitizen(witness);
			}
			System.out.println(obvinitel.getName() + " asked " + witness.getName()+ " 5 questions.");
		}

	}
}
