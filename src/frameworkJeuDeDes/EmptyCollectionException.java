package frameworkJeuDeDes;

@SuppressWarnings("serial")
public class EmptyCollectionException extends Exception {
	public EmptyCollectionException() {
		super("On ne peut cr�er un it�rateur avec un tableau vide.");
	}
}
