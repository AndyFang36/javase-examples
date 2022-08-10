package exercises.e16;

class AlertStatus {
	protected void alert() {
	}
}

class NormalAlert extends AlertStatus {
	@Override
	protected void alert() {
		System.out.println("AlertStatus: Normal");
	}
}

class HighAlert extends AlertStatus {
	@Override
	protected void alert() {
		System.out.println("AlertStatus: High");
	}
}

class MaximumAlert extends AlertStatus {
	@Override
	protected void alert() {
		System.out.println("AlertStatus: Maximum");
	}
}

class StarShip {
	private AlertStatus alertStatus = new NormalAlert();

	public void normalAlert() {
		alertStatus = new NormalAlert();
	}

	public void highAlert() {
		alertStatus = new HighAlert();
	}

	public void maximumAlert() {
		alertStatus = new MaximumAlert();
	}

	public void checkAlertStatus() {
		alertStatus.alert();
	}
}

public class TransmogrifyEx {
	public static void main(String[] args) {
		StarShip s = new StarShip();
		s.checkAlertStatus();
		s.highAlert();
		s.checkAlertStatus();
		s.maximumAlert();
		s.checkAlertStatus();
		s.normalAlert();
		s.checkAlertStatus();
	}
}
