package _06_duck;

public class CorgiRunner {
public static void main(String[] args) {
	Duck duck = new Duck("donuts",5);
duck.quack();
duck.waddle();
Corgi corgi = new Corgi("Tucker", 8);
corgi.roll();
corgi.sit();
}
}
