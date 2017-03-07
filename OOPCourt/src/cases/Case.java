package cases;

import java.util.HashSet;
import java.util.Iterator;

import citizens.*;
import people.*;

public abstract class Case {

	enum Type {
		CIVIL, CRIMINAL
	}

	private Type type;
	private Judge judge;
	private HashSet<JuryMan> juryMen;
	protected Defendant defendant;
	protected HashSet<Witness> witnesses;

	public Case(Judge judge, HashSet<JuryMan> juryMen, Defendant defendant, HashSet<Witness> witnesses, Type type) {
		this.type = type;
		this.judge = judge;
		if (areJuryMenCorrect(juryMen)) {
			this.juryMen = juryMen;
		}
		this.defendant = defendant;
		this.witnesses = witnesses;
	}

	protected abstract boolean areJuryMenCorrect(HashSet<JuryMan> juryMen);

	public void conduct() {
		// TODO
		increaseNumberOfCasesForJurists();
		fiveAskedQuestionsFromLawyers();
		int yearsInPrison = judge.takeDecision( juryMenDecision());
		System.out.println("Years in prison :" + yearsInPrison);
	}

	private void increaseNumberOfCasesForJurists() {
		judge.setCases(judge.getCases() + 1);
		for (Iterator<JuryMan> iterator = juryMen.iterator(); iterator.hasNext();) {
			JuryMan juryMan = (JuryMan) iterator.next();
			juryMan.setCases(juryMan.getCases() + 1);
		}
	}

	private void fiveAskedQuestionsFromLawyers() {
		HashSet<Lawyer> lawyers = defendant.getLawyers();
		for (Iterator<Lawyer> iterator = lawyers.iterator(); iterator.hasNext();) {
			Lawyer lawyer = (Lawyer) iterator.next();
			for (Iterator<Witness> iterator2 = witnesses.iterator(); iterator2.hasNext();) {
				Witness witness = (Witness) iterator2.next();
				for (int i = 0; i < 5; i++) {
					lawyer.askCitizen(witness);
				}
				System.out.println(lawyer.getName()+ " asks " + witness.getName());
			}
		}
	}

	
	private boolean juryMenDecision() {
		int results = 0;
		for (Iterator iterator = juryMen.iterator(); iterator.hasNext();) {
			JuryMan juryMan = (JuryMan) iterator.next();
			if (juryMan.takeDecisionIsGuily()) {
				results++;
			} else {
				results--;
			}
		}
		System.out.println("Jury men decision  if guilty: "+ ( results > 0));
		return results > 0;
	}
}
