package Queue;

public class EmptyListException extends RuntimeException {
	EmptyListException(String error){
		super(error);
	}
}
