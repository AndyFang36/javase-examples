package examples.book_9_3.filters;

public class BandPass extends Filter {
	double lowCutOff, highCutOff;

	public BandPass(double tempLow, double tempHigh) {
		lowCutOff = tempLow;
		highCutOff = tempHigh;
	}

	@Override
	public Waveform process(Waveform input) {
		return input;
	}
}
