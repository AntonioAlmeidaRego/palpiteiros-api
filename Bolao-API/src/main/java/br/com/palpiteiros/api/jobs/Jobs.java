package br.com.palpiteiros.api.jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.palpiteiros.api.consume.ApiFutConsome;

/*Class Jobs. Class Util para realizar ações quando o projeto é atualizado*/

@Component
public class Jobs implements ApplicationListener<ContextRefreshedEvent>{
	@Autowired
	private ApiFutConsome consome;
	
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		for (Long i = 1L; i <= 20; i++) {
			//consome.getTeam(i);
		}
	}

}
