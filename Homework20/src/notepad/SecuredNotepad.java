package notepad;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotePad implements ISecureNotepad {

	protected String password;

	public SecuredNotepad(String password, int numberOfPages) {
		super(numberOfPages);
		if (!isPassowordValid(password)) {
			System.out.println("Invalid password");
		} else {
			this.password = password;
		}
	}

	@Override
	public void addTextToPage(int page, String text) {
		if (isPasswordCorrect()) {
			System.out.println("Adding text to page " + page);
			super.addTextToPage(page, text);
		}
	}

	@Override
	public void changeTextOnPage(int page, String text) {
		if (isPasswordCorrect()) {
			System.out.println("Changing text on page "+ page);
			super.changeTextOnPage(page, text);
		}
	}

	@Override
	public void deleteTextFromPage(int page) {
		if (isPasswordCorrect()) {
			System.out.println("Deleting text on page "+ page);
			super.deleteTextFromPage(page);
		}

	}

	@Override
	public void printAllPages() {
		if (isPasswordCorrect()) {
			System.out.println("Printing all pages");
			super.printAllPages();
		}
	}

	private boolean isPasswordCorrect() {
		System.out.println("Enter password: ");
		Scanner sc = new Scanner(System.in);
		if (sc.next().equals(password)) {
			return true;
		} else {
			System.out.println("Wrong password");
			return false;
		}
	}

	private boolean isPassowordValid(String password) {
		if (password.equals(null) || password.length() < 6) {
			return false;
		}
		if(hasSmallLetter(password)&& hasBigLetter(password) && hasNumber(password)){
			return true;
		}
		return false;
	}

	private boolean hasNumber(String password) {
		char [] array = password.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (array[i]>='0' && array[i]<='9') {
				return true;
			}
		}
		return false;
	}

	private boolean hasBigLetter(String password) {
		char [] array = password.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (array[i]>='A' && array[i]<='Z') {
				return true;
			}
		}
		return false;
	}

	private boolean hasSmallLetter(String password){
		char [] array = password.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (array[i]>='a' && array[i]<='z') {
				return true;
			}
		}
		return false;
	}
	
	public void changePassword() {
		System.out.print("Old password.");
		if (isPasswordCorrect()) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter new password: ");
			String pass = sc.next();
			if (isPassowordValid(pass)) {
				this.password = pass;
				System.out.println("Password changed!");
			}
		}
	}

	@Override
	public boolean searchWord(String word) {
		if (isPasswordCorrect()) {
			System.out.println("Searching word ...");
		return super.searchWord(word);
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		if (isPasswordCorrect()) {
			System.out.println("Searching for DIGITS! ");
			super.printAllPagesWithDigits();
		}
	}
	
	
	@Override
	public void addTitle(String title, int page){
	if (isPasswordCorrect()) {
		System.out.println("Adding title...");
		super.addTitle(title, page);
	}
	}
}
