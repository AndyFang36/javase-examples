package examples.s09_restrictions;

public class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

class PopFoul extends Foul {}

