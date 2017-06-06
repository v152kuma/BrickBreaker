
public class Animate implements Runnable {

	BlockBreakerPanel bp;

	public Animate(BlockBreakerPanel bp) {

		this.bp = bp;
	}

	public void run() {
		while(true){
		bp.update();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
}