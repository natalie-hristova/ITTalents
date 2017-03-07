import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import javax.activation.MailcapCommandMap;

import Deliver.Deliver;
import Deliver.Drebno;
import Deliver.Edro;
import shops.Butka;
import shops.ETable;
import shops.IChain;
import shops.MallShop;
import shops.Sergia;
import shops.Shop;
import traders.Ambulant;
import traders.ET;
import traders.Trader;
import traders.TradingChain;

public class Demo {
	public static void main(String[] args) {

		// 1. Създава 10 доставчика на произволен принцип – на дребно и на едро.

		ArrayList<Deliver> delivers = new ArrayList<Deliver>();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int x = r.nextInt(2) + 1;
			if (x == 1) {
				delivers.add(new Drebno());
			} else {
				delivers.add(new Edro());
			}
		}
		System.out.println(delivers);
		System.out.println("---------------------------------------------------------------");
		// 2. Създава 20 търговски обекта на произволен принцип – сергии,
		// магазини и будки.
		LinkedList<Shop> shops = new LinkedList();

		for (int i = 0; i < 20; i++) {
			int x = r.nextInt(3) + 1;
			if (x == 1) {
				shops.add(new Sergia());
			} else if (x == 2) {
				shops.add(new MallShop());
			} else {
				shops.add(new Butka());
			}
		}
		System.out.println(shops);
		System.out.println("---------------------------------------------------------------");

		// 3. Създава един амбулантен търговец с капитал 100 лева, един ЕТ с
		// капитал 500 лева и една търговска верига с капитал 3000 лева.

		Trader ambulant = new Ambulant(100);
		Trader et = new ET(500);
		Trader chain = new TradingChain(3000);

		// 4. Подава на търговците съответни търговски обекти на произволен
		// принцип.
		for (int i = 0; i < shops.size(); i++) {
			if (shops.get(i) instanceof ETable) {
				((ET) et).addShop(shops.get(i));
				shops.remove(i);
				System.out.println(et + " " + ((ET) et).getShop());
				break;
			}
		}

		for (int j = 0; j < shops.size(); j++) {
			if (shops.get(j) instanceof IChain && ((TradingChain) chain).freePlacesForShop() > 0) {
				((TradingChain) chain).addShop(shops.get(j));
				System.out.print(shops.get(j) + " - ");
			}
		}

		System.out.println("---------------------------------------------------------------");
		/*
		 * 5. Да се извика метод, който приема списък от създадените търговци и
		 * за всеки търговец се започва търговска дейност. Търговската дейност
		 * представлява: 
		 * ◦ поръчка на стоки от доставчик за всеки търговски
		 * обект. Да се извежда на екрана списъка със стоки, сортиран по цена в
		 * нарастващ ред.
		 *  ◦ прибиране на оборот от всеки търговски обект – да се
		 * извежда на екрана общата сума на печалбата. След продажба списъкът с
		 * останалите стоки в магазина трябва отново да е сортиран по цена.
		 *  ◦
		 * плащане на месечен данък към държавата за всеки търговски обект.
		 */

		ArrayList<Trader> traders = new ArrayList();
		traders.add(ambulant);
		traders.add(et);
		traders.add(chain);

		/*
		 * 6. Да се изпише текущия паричен баланс на всеки обект след
		 * упражняването на търговска дейност. - ot kade pari ?
		 */

		/*
		 * 7. Да се изведе търговецът с най-голям брой продадени стоки за
		 * месеца.
		 */
		int x = r.nextInt(delivers.size()-1);
		chain.makeOrder(1110, delivers.get(x));
		delivers.remove(r);
		for (int i = 0; i < delivers.size(); i++) {
			if (delivers.get(i) instanceof Drebno) {
				et.makeOrder(240, delivers.get(i));
				delivers.remove(i);
				break;
			}
		}
		for (int i = 0; i < delivers.size(); i++) {
			if (delivers.get(i) instanceof Drebno) {
				ambulant.makeOrder(40, (Drebno)delivers.get(i));
				delivers.remove(i);
				break;
			}
		}
		
		int etMoney = et.sellProducts(et.getProducts()).size();
		int chainMoney = chain.sellProducts(chain.getProducts()).size();
		int ambMoney = ambulant.sellProducts(ambulant.getProducts()).size();

		if (etMoney > chainMoney && etMoney > ambMoney) {
			System.out.println("1.The most sold are " + etMoney + " by " + et);
		} else if (etMoney < chainMoney && chainMoney > ambMoney) {
			System.out.println("2.The most sold are " + chainMoney + " by " + chain);
		} else {
			System.out.println("3.The most sold are " + ambMoney + " by " + ambulant);
		}
		/*
		 * 8. Да се изведе търговецът с най-голям размер на изплатения данък към
		 * държавата. Оценяване: Реализирането на всички 2. Създава 20 търговски
		 * обекта на произволен принцип – сергии, магазини и будки. 3. Създава
		 * един амбулантен търговец с капитал 100 лева, един ЕТ с капитал 500
		 * лева и една търговска верига с капитал 3000 лева. 4. Подава на
		 * търговците съответни търговски обекти на произволен принцип. 5. Да се
		 * извика метод, който приема списък от създадените търговци и за всеки
		 * търговец се започва търговска дейност. Търговската дейност
		 * представлява: ◦ поръчка на стоки от доставчик за всеки търговски
		 * обект. Да се извежда на екрана списъка със стоки, сортиран по цена в
		 * нарастващ ред. ◦ прибиране на оборот от всеки търговски обект – да се
		 * извежда на екрана общата сума на печалбата. След продажба списъкът с
		 * останалите стоки в магазина трябва отново да е сортиран по цена. ◦
		 * плащане на месечен данък към държавата за всеки търговски обект. 6.
		 * Да се изпише текущия паричен баланс на всеки обект след упражняването
		 * на търговска дейност. 7. Да се изведе търговецът с най-голям брой
		 * продадени стоки за месеца. 8. Да се изведе търговецът с най-голям
		 * размер на изплатения данък към държавата. Оценяване: Реализирането на
		 * всички
		 */
	}

	void metodkoitonetreedaetuk(ArrayList<Trader> traders) {
		// iterator
		// Iterator
		//
	}
}
