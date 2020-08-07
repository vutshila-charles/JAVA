package intermediateJava;

public class AnimalTest {

	public static void main(String[] args) //args allows for taking crap from other classes into the main class
	{
		// TODO Auto-generated method stub
		Animal cat = new Cat();
		Cat cats = new Cat();
		Animal snake = new Animal()
				{
			public void Sound()
			{
				System.out.println("Pssssss");
			}
				};
				
		
		
				Swims shark = ()->System.out.println("A Shark Dives");//lamda expression
				
				
				Swims CatFish = () ->System.out.println("A catfish Dives");
				
				
				
				CatFish.Dive();
				shark.Dive();
				shark.swim();
				cat.Sound();
				cats.Scratch();
				cats.Dive();
				snake.Sound();

}
}