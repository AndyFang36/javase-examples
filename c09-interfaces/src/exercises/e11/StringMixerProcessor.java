package exercises.e11;

import examples.book_9_3.interface_processor.*;

class StringMixerAdapter implements Processor {
	StringMixer stringMixer;

	public StringMixerAdapter(StringMixer temp) {
		this.stringMixer = temp;
	}

	@Override
	public String name() {
		return getClass().getSimpleName();
	}

	@Override
	public String process(Object input) {
		return stringMixer.startMix((String) input);
	}
}

public class StringMixerProcessor {
	public static void main(String[] args) {
		String s1 = "computer";
		String s2 = "science";
		Apply.process(new StringMixerAdapter(new StringMixer()), s1);
		Apply.process(new StringMixerAdapter(new StringMixer()), s2);
	}
}
