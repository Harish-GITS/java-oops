package javaoops;

interface Readable{
	
	String datarate="8000 RPM";
	void read();
}

interface Writable{
	void write();
}
interface Storable{
	void store();
}

class File implements Readable, Writable, Storable{
	
	@Override
	public void read(){
		System.out.println("Using this function File can be Read");
	}

	@Override
	public void store() {
		System.out.println("Using this function File can be written");
		
	}

	@Override
	public void write() {
		System.out.println("Using this function File can be Stored");
		
		
	}
}
public class MultipleInterface {
public static void main(String[] args) {
	
	File f=new File();
	f.read();
	f.write();
	f.store();
	
	
}
}
