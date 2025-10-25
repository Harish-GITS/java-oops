package javaoops;
interface Playable{
	void play();
	
}
class Guitar implements Playable{
	
	public void play() {
		System.out.println("The sound of a guitar is Tone or timbre");
	}
}
class Piono implements Playable{
	public void play() {
		System.out.println("The sound of a piano is rich, resonant, and expressive");
	}
}
public class InterfaceJava {
public static void main(String[] args) {
	
	Guitar git=new Guitar();
	git.play();
	
	Piono pio=new Piono();
	pio.play();	
}
}
