package threads;

public class Car {
	private static final int TIME_FOR_ENGINE = 7 * 1000;
	private static final int TIME_FOR_FRAME = 5 * 1000;
	private static final int TIME_FOR_SEAT = 3 * 1000;
	private static final int TIME_FOR_TYRE = 2 * 1000;

	Car() {
		this.buildCar();
	}

	private void buildCar() {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				try {
					this.sleep(TIME_FOR_ENGINE);
					this.sleep(TIME_FOR_FRAME);
				} catch (InterruptedException e) {
					System.out.println("Could not could the engine and frame");
					e.printStackTrace();
				}
				System.out.println("FIRST THREAD IS READY");
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 4; i++) {
					try {
						this.sleep(TIME_FOR_SEAT);
					} catch (InterruptedException e) {
						System.out.println("Could not bould the 4 seats");
						e.printStackTrace();
					}
				}
				System.out.println("SECOND THREAD IS READY");
			}
		};
		Thread t3 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 4; i++) {
					try {
						this.sleep(TIME_FOR_TYRE);
					} catch (InterruptedException e) {
						System.out.println("Could not bould the tyres");
					}
				}
				try {
					this.sleep(TIME_FOR_SEAT);
				} catch (InterruptedException e) {
					System.out.println("Could not bould the last seat");
					e.printStackTrace();
				}
				System.out.println("THIRD THREAD IS READY");
			}
		};

		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			System.out.println("==========Car is ready=========");
		} catch (InterruptedException e) {
			System.out.println("sth went wrong");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Car car = new Car();

	}

}

