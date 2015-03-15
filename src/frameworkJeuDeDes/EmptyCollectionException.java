package frameworkJeuDeDes;

@SuppressWarnings("serial")
public class EmptyCollectionException extends Exception {
	public EmptyCollectionException() {
		super("On ne peut créer un itérateur avec un tableau vide.");
	}
}
