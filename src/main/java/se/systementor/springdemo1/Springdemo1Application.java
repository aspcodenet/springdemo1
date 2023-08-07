package se.systementor.springdemo1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@SpringBootApplication
@RestController
public class Springdemo1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Springdemo1Application.class, args);
	}
	@GetMapping("/helloworld")
	public String hello() {
		return"Hello World!";
	}
	@GetMapping("/")
	public String homepage() {
		return "Startsidan";
	}


	@Override
	public void run(String... args) throws Exception {
		var scan = new Scanner(System.in);

		while(true){
			showMenu();
			System.out.print("Action:");
			int sel = Integer.parseInt ( scan.nextLine() );
			if(sel == 1) {
				listAllTeams();
			}
			else if(sel == 2) {

			}
			else if(sel == 3) {
			}
			else if(sel == 4) {
			}
			else if(sel == 9) break;
			else System.out.println("Invalid input, 1-4 or 9 please");
		}
	}

	private void listAllTeams() {
		System.out.println("Listar alla");
	}

	private void showMenu() {
		System.out.println("1. Lista alla lag");
		System.out.println("2. Skapa lag");
		System.out.println("3. Ändra lag");
		System.out.println("4. Se lag");
		System.out.println("9. Exit");
	}
}
