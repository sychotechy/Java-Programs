class SampleClass{
	void display(){
		System.out.println("This is sample class");
	}
	protected void finalize(){
		System.out.println("Garbage collected");
	}
}
public class GarbageCollector{
	public static void main(String[] args){
		SampleClass s1 = new SampleClass();
		SampleClass s2 = new SampleClass();
		s1 = null;
		s2 = null;
		System.gc();
	}
}
