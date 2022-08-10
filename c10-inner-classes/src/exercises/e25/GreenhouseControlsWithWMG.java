package exercises.e25;

import exercises.e24.Event;
import exercises.e24.GreenhouseControls;

public class GreenhouseControlsWithWMG extends GreenhouseControls {
	private boolean generator = false;

	public class WaterMistGeneratorOn extends Event {
		public WaterMistGeneratorOn(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			generator = true;
		}

		@Override
		public String toString() {
			return "Water mist generator is on";
		}
	}

	public class WaterMistGeneratorOff extends Event {
		public WaterMistGeneratorOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			generator = false;
		}

		@Override
		public String toString() {
			return "Water mist generator is off";
		}
	}
}
