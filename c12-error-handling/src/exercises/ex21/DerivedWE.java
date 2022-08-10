package exercises.ex21;

class DerivedWE extends BaseWithException {
	// Produces compile-time error:
	//unreported exceptionExcept1
	//! public DerivedWE() {}
	// Gives compile error: call to super must be
	// first statement in constructor:
	//! public DerivedWE() {
	//!     try {
	//!         super();
	//!     } catch(Except1 ex1) {
	//!     }
	//! }
	public DerivedWE() throws MyException {
	}
}
