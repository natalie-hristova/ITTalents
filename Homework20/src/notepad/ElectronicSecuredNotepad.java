package notepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IÅlectronicDevice, ISecureNotepad {

	private boolean isStarted;

	public ElectronicSecuredNotepad(String password, int numberOfPages) {
		super(password, numberOfPages);
	}

	@Override
	public void start() {
		this.isStarted = true;

	}

	@Override
	public void stop() {
		this.isStarted = false;
	}

	@Override
	public boolean isStarted() {
		return this.isStarted;
	}

	@Override
	public void addTextToPage(int page, String text) {
		if (isStarted) {
			super.addTextToPage(page, text);
		}

	}

	@Override
	public void addTitle(String title, int page) {
		if (isStarted) {
			super.addTitle(title, page);
		}
	}

	@Override
	public void changeTextOnPage(int page, String text) {
		if (isStarted) {
			super.changeTextOnPage(page, text);
		}

	}

	@Override
	public void deleteTextFromPage(int page) {
		if (isStarted) {
			super.deleteTextFromPage(page);
		}
	}

	@Override
	public void printAllPages() {
		if (isStarted) {
		super.printAllPages();	
		}
	}

	@Override
	public boolean searchWord(String word) {
		if (isStarted) {
		return 	super.searchWord(word);
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		if (isStarted) {
			super.printAllPagesWithDigits();
		}

	}

	@Override
	public void changePassword() {
		if (isStarted) {
			super.changePassword();
		}
	}

}
