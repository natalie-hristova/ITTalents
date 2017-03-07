package restaurant;

import java.util.Comparator;

public class CompareWaitersByMoney  implements Comparator<Waiter>{

	@Override
	public int compare(Waiter w1, Waiter w2) {
		return(int)( 100*w1.getMoney()-100*w2.getMoney());
	}

}
