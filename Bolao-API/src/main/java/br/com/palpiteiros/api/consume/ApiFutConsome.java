package br.com.palpiteiros.api.consume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.palpiteiros.api.annotations.KeyAuthorization;
import br.com.palpiteiros.api.consume.model.Time;
import br.com.palpiteiros.api.util.rest.template.RestTemplateUtil;

/*Class Util para realizar os consumos da Api Futebol*/

@Service
public class ApiFutConsome {
	@Autowired
	private RestTemplateUtil util;
	@KeyAuthorization
	private String key;
	
	@SuppressWarnings("unchecked")
	public Time getTeam(Long id) {

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Authorization", key);

		ResponseEntity<Time> responseEntity = (ResponseEntity<Time>) util.get("/v1/times/" + id, httpHeaders,
				Time.class);

		if (responseEntity.getStatusCode().is2xxSuccessful()) {
			Time team = responseEntity.getBody();

			System.err.println(team);

			return team;
		}
		return null;
	}
}
