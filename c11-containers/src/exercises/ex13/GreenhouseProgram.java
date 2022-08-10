package exercises.ex13;

public class GreenhouseProgram {
	public static void main(String[] args) {
		GreenhouseController gc = new GreenhouseController();
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
			gc.new ThermostatNight(0),
			gc.new LightOn(200),
			gc.new LightOff(400),
			gc.new WaterOn(600),
			gc.new WaterOff(800),
			gc.new ThermostatDay(1400)
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		if (args.length == 1)
			gc.addEvent(
				new GreenhouseController.Terminate(Long.parseLong(args[0]))
			);
		else
			gc.addEvent(
				new GreenhouseController.Terminate(5000L)
			);
		gc.run();
	}
}
