package notepad;

public class Page {
	private String title="";
	private String text="";

	Page() {

	}

	Page(String title, String text) {
		this();
		this.title = title;
		this.text = text;
	}

	boolean searchWord(String word){
		if (word!= null && word.length()>0) {
			if (this.text.contains(word)) {
				return true;
			}
		}
		return false;
	}
	
	boolean containsDigits() {
		String numbers = "0123456789";
		for (int i = 0; i < this.text.length(); i++) {
			if (numbers.contains(Character.toString(text.charAt(i)))) {
				return true;
			}
		}
		return false;
	}
	
	void addText(String text) {
		this.text += text;
	}

	void setTitle(String title) {
		this.title = title;
	}

	void setText(String text) {
		this.text = text;
	}

	void deleteText() {
		this.text = "";
	}

	String review() {
		if (this.title.length()==0 && this.text.length()==0) {
			return "";
		}
		if (this.title.length()==0) {
			return this.text;
		}
		if (this.text.length()==0) {
			return this.title;
		}
		return this.title + "\n" + this.text;
	}
}
