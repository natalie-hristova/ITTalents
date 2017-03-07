package cases;

import java.util.HashSet;
import java.util.Iterator;

import citizens.Accuser;
import citizens.Citizen;
import citizens.Defendant;
import citizens.Witness;
import people.Judge;
import people.JuryMan;
import people.Lawyer;

public class Civil extends Case {

	private Citizen obvinitel;

	public Civil(Judge judge, HashSet<JuryMan> juryMen, Defendant defendant, Accuser accuser,
			HashSet<Witness> witnesses) {
		super(judge, juryMen, defendant, witnesses, Type.CIVIL);
	}

	@Override
	protected boolean areJuryMenCorrect(HashSet<JuryMan> juryMen) {
		return juryMen.size() == 3;
	}

	private void lawyerQuestions() {
		HashSet<Lawyer> lawyers = defendant.getLawyers();
		for (Iterator iterator = lawyers.iterator(); iterator.hasNext();) {
			Lawyer lawyer = (Lawyer) iterator.next();
			for (int i = 0; i < 3; i++) {
				lawyer.askCitizen(obvinitel);
			}
			for (Iterator it = witnesses.iterator(); it.hasNext();) {
				Witness witness = (Witness) it.next();
				lawyer.askCitizen(witness);
				lawyer.askCitizen(witness);
			}
		}

	}

	@Override
	public void conduct() {
		super.conduct();
		lawyerQuestions() ;
	}

}
