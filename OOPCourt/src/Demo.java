import java.awt.Label;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

import cases.Civil;
import cases.Criminal;
import citizens.Accuser;
import citizens.Citizen;
import citizens.Defendant;
import citizens.Witness;
import court.*;
import people.*;

public class Demo {
	public static void main(String[] args) {

		Random r = new Random();
		Court velikoTyrnovo = new Court("Veliko tyrnovo");

		Judge judge1 = new Judge("Gosho", 7, 15);
		Judge judge2 = new Judge("Pesho", 17, 18);
		Judge judge3 = new Judge("Sasho", 5, 5);

		velikoTyrnovo.addJurist(judge1);
		velikoTyrnovo.addJurist(judge2);
		velikoTyrnovo.addJurist(judge3);

		ArrayList<JuryMan> juryMen = new ArrayList();
		juryMen.add(new JuryMan("jm1", 4, 12));
		juryMen.add(new JuryMan("jm2", 6, 17));
		juryMen.add(new JuryMan("jm3", 9, 11));
		juryMen.add(new JuryMan("jm4", 10, 121));
		juryMen.add(new JuryMan("jm5", 7, 19));
		juryMen.add(new JuryMan("jm6", 7, 11));
		juryMen.add(new JuryMan("jm7", 14, 123));
		juryMen.add(new JuryMan("jm8", 9, 12));
		juryMen.add(new JuryMan("jm9", 7, 22));
		juryMen.add(new JuryMan("jm10", 5, 32));
		juryMen.add(new JuryMan("jm11", 9, 12));
		juryMen.add(new JuryMan("jm12", 7, 22));
		juryMen.add(new JuryMan("jm12", 5, 32));
		HashSet<JuryMan> juries = new HashSet<JuryMan>();
		juries.addAll(juryMen);
		velikoTyrnovo.addJurist(juryMen.get(0));
		velikoTyrnovo.addJurist(juryMen.get(1));
		velikoTyrnovo.addJurist(juryMen.get(2));
		velikoTyrnovo.addJurist(juryMen.get(3));
		velikoTyrnovo.addJurist(juryMen.get(4));
		velikoTyrnovo.addJurist(juryMen.get(5));
		velikoTyrnovo.addJurist(juryMen.get(6));
		velikoTyrnovo.addJurist(juryMen.get(7));
		velikoTyrnovo.addJurist(juryMen.get(8));
		velikoTyrnovo.addJurist(juryMen.get(9));

		velikoTyrnovo.addJurist(new Lawyer("lawyer 1", 12, 13));
		velikoTyrnovo.addJurist(new Lawyer("lawyer 2", 14, 132));
		velikoTyrnovo.addJurist(new Lawyer("lawyer 3", 17, 210));
		velikoTyrnovo.addJurist(new Lawyer("lawyer 4", 15, 155));
		velikoTyrnovo.addJurist(new Lawyer("lawyer 5", 11, 145));

		System.out.println("------------------------------------");
		velikoTyrnovo.printInfo();
		System.out.println("------------------------------------");

		HashSet<Lawyer> lawyers = new HashSet();
		lawyers.add(new Lawyer("lawyer 1", 12, 13));
		lawyers.add(new Lawyer("lawyer 2", 14, 132));
		lawyers.add(new Lawyer("lawyer 3", 17, 210));
		lawyers.add(new Lawyer("lawyer 4", 15, 155));
		lawyers.add(new Lawyer("lawyer 5", 11, 145));

		Accuser c1 = new Accuser("accuser 1", 34, "Moi malak london");
		Accuser c2 = new Accuser("accuser 2", 12, "Moi malak Paris");
		Accuser c3 = new Accuser("accuser 3", 21, "Moi malak Las Vegas");
		Accuser c4 = new Accuser("accuser 4", 23, "Moq malka Cambera");
		Accuser c5 = new Accuser("accuser 5", 26, "Moi malak Vashington");

		Defendant d1 = new Defendant("Defendant 1", 34, "Moi malak london", lawyers);
		Defendant d2 = new Defendant("Defendant 2", 12, "Moi malak Paris", lawyers);
		Defendant d3 = new Defendant("Defendant 3", 21, "Moi malak Las Vegas", lawyers);
		Defendant d4 = new Defendant("Defendant 4", 23, "Moq malka Cambera", lawyers);
		Defendant d5 = new Defendant("Defendant 5", 26, "Moi malak Vashington", lawyers);

		ArrayList<Witness> witnesses = new ArrayList();
		witnesses.add(new Witness("Witness 1", 34, "Moi malak london"));
		witnesses.add(new Witness("Witness 2", 34, "Moi malak london"));
		witnesses.add(new Witness("Witness 3", 34, "Moi malak london"));
		witnesses.add(new Witness("Witness 4", 34, "Moi malak london"));
		witnesses.add(new Witness("Witness 5", 34, "Moi malak london"));
		witnesses.add(new Witness("Witness 6", 34, "Moi malak london"));
		witnesses.add(new Witness("Witness 7", 34, "Moi malak london"));
		witnesses.add(new Witness("Witness 8", 34, "Moi malak london"));
		witnesses.add(new Witness("Witness 9", 34, "Moi malak london"));
		witnesses.add(new Witness("Witness 10", 34, "Moi malak london"));
		witnesses.add(new Witness("Witness 11", 34, "Moi malak london"));
		witnesses.add(new Witness("Witness 12", 34, "Moi malak london"));
		witnesses.add(new Witness("Witness 13", 34, "Moi malak london"));
		HashSet<Witness> witnesses2 = new HashSet<>();
		witnesses2.addAll(witnesses);

		HashSet<Witness> w1hs = new HashSet<>();
		while (w1hs.size() < 3) {
			int index = r.nextInt(10);
			w1hs.add(witnesses.get(index));
		}

		HashSet<Witness> w2hs = new HashSet<>();
		while (w2hs.size() < 3) {
			int index = r.nextInt(10);
			w2hs.add(witnesses.get(index));
		}
		HashSet<Witness> w3hs = new HashSet<>();
		while (w3hs.size() < 3) {
			int index = r.nextInt(10);
			w3hs.add(witnesses.get(index));
		}
		HashSet<JuryMan> cc1hs = new HashSet<>();
		while (cc1hs.size() < 3) {
			int index = r.nextInt(10);
			cc1hs.add(juryMen.get(index));
		}
		HashSet<JuryMan> cc2hs = new HashSet<>();
		while (cc2hs.size() < 3) {
			int index = r.nextInt(10);
			cc2hs.add(juryMen.get(index));
		}
		HashSet<JuryMan> cc3hs = new HashSet<>();
		while (cc3hs.size() < 3) {
			int index = r.nextInt(10);
			cc3hs.add(juryMen.get(index));
		}
		Civil civilCase1 = new Civil(judge3, cc1hs, d3, c3, w1hs);
		Civil civilCase2 = new Civil(judge1, cc2hs, d2, c5, w2hs);
		Civil civilCase3 = new Civil(judge2, cc3hs, d1, c4, w3hs);

		Criminal cc1 = new Criminal(judge3, juries, d1, c1, witnesses2, new Prosecutor("proc1", 12, 3));
		Criminal cc2 = new Criminal(judge2, juries, d5, c2, witnesses2, new Prosecutor("proc2", 3, 33));
		Criminal cc3 = new Criminal(judge1, juries, d3, c3, witnesses2, new Prosecutor("proc3", 12, 42));

		cc1.conduct();
		cc2.conduct();
		cc3.conduct();
		civilCase1.conduct();
		civilCase2.conduct();
		civilCase3.conduct();

		System.out.println("------------------------------------");
		velikoTyrnovo.printInfo();
		System.out.println("------------------------------------");

	}

}
