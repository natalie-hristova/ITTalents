package notepad;

public class SimpleNotePad implements INotepad {

	protected Page[] pages;
	protected final int NUMBER_OF_PAGES;

	SimpleNotePad(int numberOfPages) {
		if (numberOfPages > 0) {
			NUMBER_OF_PAGES = numberOfPages;
			this.pages = new Page[NUMBER_OF_PAGES];
		} else {
			NUMBER_OF_PAGES = 10;
			this.pages = new Page[NUMBER_OF_PAGES];
		}
		for (int i = 0; i < pages.length; i++) {
			pages[i] = new Page();
		}
	}

	@Override
	public void addTextToPage(int page, String text) {
		if (isGivenPageCorrect(page)) {
			pages[page - 1].addText(text);
		}
	}

	@Override
	public void changeTextOnPage(int page, String text) {
		if (isGivenPageCorrect(page)) {
			pages[page - 1].deleteText();
			pages[page - 1].addText(text);
		}
	}

	@Override
	public void deleteTextFromPage(int page) {
		if (isGivenPageCorrect(page)) {
			pages[page - 1].deleteText();
		}

	}

	@Override
	public void printAllPages() {
		for (int i = 0; i < pages.length; i++) {
			System.out.println( pages[i].review());
		}
	}

	private boolean isGivenPageCorrect(int page) {
		if (page > 0 && page <= NUMBER_OF_PAGES) {
			return true;
		} else
			return false;
	}

	@Override
	public boolean searchWord(String word) {
		for (int i = 0; i < pages.length; i++) {
			if (pages[i].searchWord(word)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
	for (int i = 0; i < pages.length; i++) {
		if (pages[i].containsDigits()) {
			pages[i].review();
		}
	}
		
	}

	@Override
	public void addTitle(String title, int page) {
		if (isGivenPageCorrect(page)) {
			this.pages[page-1].setTitle(title);
		}
		
	}
}
