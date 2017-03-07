package notepad;

public interface INotepad {

	void addTextToPage(int page,String text);
	void addTitle(String title,int page);
	void changeTextOnPage(int page,String text);
	void deleteTextFromPage(int page);
	void printAllPages();
	boolean searchWord(String word);
	void printAllPagesWithDigits();

}
