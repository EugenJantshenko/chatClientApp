package chat;

import chat.operations.logic.ClientWindow;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
		ClientWindow clientWindow = new ClientWindow();
	}
}

