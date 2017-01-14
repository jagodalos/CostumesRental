package exceptions;

public class EmptyCartException extends Exception {
	public EmptyCartException(){
		super("You need to add items to your cart");
	}

}
