package _06_duck;

public class Corgi {
int LengthOfLegs;
String name;
void roll() {
	System.out.println("Tucker rolled.");
}
void sit(){
	System.out.println("Tucker sat.");
}
Corgi(String name, int LengthOfLegs){
	this.name = name;
	this.LengthOfLegs = LengthOfLegs;
}
}
