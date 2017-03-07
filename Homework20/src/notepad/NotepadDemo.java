package notepad;

public class NotepadDemo {

	public static void main(String[] args) {

		
		ISecureNotepad noteSec1 = new SecuredNotepad("Gosho1", 3);
//		 noteSec1.addTitle("Bugs Bunny",1);
//		 noteSec1.addTextToPage(2, "Bugs Bunny is a gray rabbit.");
//		 noteSec1.changeTextOnPage(2, "He has a sense of homour.");
//		 noteSec1.addTextToPage(3," Sometimes he can be quite iritating.");
//		 noteSec1.printAllPages();
		 noteSec1.changePassword();
		 noteSec1.changePassword();
		 noteSec1.changePassword();
		 noteSec1.changePassword();
		 noteSec1.changePassword();
		 
		 noteSec1.printAllPages();
		ElectronicSecuredNotepad esnp = new ElectronicSecuredNotepad("bla2",5 );
		esnp.addTextToPage(1, "Tva nema da sraboti zashtoto ne e vklu4eno");
		esnp.start();
//		esnp.addTitle("Tom & Jerry",1);
//		esnp.addTextToPage(1, "Tom is a sweet gray cat.He is a little naiive sometimes.");
//		esnp.addTextToPage(2, "Jerry is a brown mouse.He is quite wise.");
//		esnp.printAllPages();
//		esnp.stop();
//		esnp.printAllPages();
//		esnp.changePassword();
//		esnp.addTitle("Tom ",1);
//	esnp.addTitle("Jerry",1);
	}

}
