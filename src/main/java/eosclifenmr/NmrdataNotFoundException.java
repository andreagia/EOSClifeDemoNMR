package eosclifenmr;

class NmrdataNotFoundException extends RuntimeException {

	NmrdataNotFoundException(Long id) {
		super("Could not find employee " + id);
	}
}
