package ru.gb.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		List<Ticket> ticketList = context.getBean(InformationBoard.class).newTicket();
		for (int i = 0; i < ticketList.size(); i++) {
			System.out.println(ticketList.get(i));
		}


	}

}
