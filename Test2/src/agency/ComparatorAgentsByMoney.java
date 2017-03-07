package agency;

import java.util.Comparator;

public class ComparatorAgentsByMoney  implements Comparator<Agent>{

	@Override
	public int compare(Agent ag1, Agent ag2) {
		return (int)(100*(ag2.getMoney()- ag1.getMoney()));
	}

}
