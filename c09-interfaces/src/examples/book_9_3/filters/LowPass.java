package examples.book_9_3.filters;

public class LowPass extends Filter {
	double cutOff;

	public LowPass(double temp) {
		this.cutOff = temp;
	}

	@Override
	public Waveform process(Waveform input) {
		return input; // Dummy processing
	}
}
