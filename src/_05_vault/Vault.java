package _05_vault;

import java.util.Random;

public class Vault {
	int SecretCode = 0;
	Vault(int SecretCode){
		this.SecretCode = SecretCode;
	}
	boolean tryCode(int number) {
		if(number == 2024) {
			return true;
		}
		else {
		return false;
		}
}
public static void main(String[] args) {
	Vault vault = new Vault(new Random().nextInt(1000000));
	JamesBond jb = new JamesBond();
	System.out.println(jb.findCode(vault));
}
}
