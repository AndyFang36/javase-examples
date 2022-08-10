package exercises.ex20;

public class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

class UmpireArgument extends BaseballException {
}

class PopFoul extends Foul {
}

