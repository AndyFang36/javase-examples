package examples.s03_adding;

import java.util.*;

class Snow {
}

class Powder extends Snow {
}

class Light extends Powder {
}

class Heavy extends Powder {
}

class Crusty extends Snow {
}

class Slush extends Snow {
}

public class AsListInterface {
	public static void main(String[] args) {
		List<Snow> snow1 = Arrays.asList(
			new Crusty(),
			new Slush(),
			new Powder()
		);

		// Won’t compile:
		//! List<Snow> snow2 = Arrays.<Powder>asList(new Light(), new Heavy());
		// Compiler says:
		// found : java.util.List<Powder>
		// required: java.util.List<Snow>

		// Collections.addAll() doesn’t get confused:
		List<Snow> snow3 = new ArrayList<>();
		Collections.addAll(snow3, new Light(), new Heavy());

		// Give a hint using an explicit
		// type argument specification:
		List<Snow> snow4 = Arrays.asList(new Light(), new Heavy());
	}
}
