package examples.book_9_3.filters;

public class HighPass extends Filter {
	double cutOff;

	public HighPass(double temp) {
		this.cutOff = temp;
	}

	@Override
	public Waveform process(Waveform input) {
		return input;
	}
}
