package mike.uebl.iban;

public class WrongIban extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public WrongIban() {
    }
    public WrongIban(String msg) {
        super(msg);
    }
}