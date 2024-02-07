package j11_상속.piano;

public class MusicMain {

	public static void main(String[] args) {
		
		Piano piano = new Piano(1);
		NewPiano newPiano = new NewPiano();
		NewViolin newViolin = new NewViolin(9);
		
		piano.piano();
		piano.soccer();
		System.out.println();
		newPiano.piano();
		newPiano.baseball();
		System.out.println();
		newViolin.piano();

	}

}
