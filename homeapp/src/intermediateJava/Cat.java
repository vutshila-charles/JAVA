package intermediateJava;

class Cat extends Animal implements Swims{

	@Override
	public void Sound() {
		// TODO Auto-generated method stub
		super.Sound();
	}
	
	public void Scratch()
	{
		System.out.println("This thing is dangerous, ");
	}
	public void Dive()
	{
		System.out.println("jums");
	}

}
