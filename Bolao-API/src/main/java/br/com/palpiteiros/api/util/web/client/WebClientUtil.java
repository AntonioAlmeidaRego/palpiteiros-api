package br.com.palpiteiros.api.util.web.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.RequestBodySpec;
import org.springframework.web.reactive.function.client.WebClient.RequestHeadersSpec;

/*Classe útil para utilizar o WebClient nos demais pacotes do projeto*/

/* Esta classe tem como intuito de reutilizar os metodos do proprio WebClient*/

@Service
public class WebClientUtil {
	@Autowired
	private WebClient webClient;

	/*Método Get sem header*/
	public Object get(String uri, Class<?> classEntity, Object... uriVariables) {
		try {
			return getPrimary(uri, classEntity, uriVariables)
					   .retrieve()
					   .bodyToMono(classEntity)
					   .block();
		} catch (Exception e) {
		}
		return null;
	}
	
	/*Método Get com header*/
	public Object get(String uri, String headerName, String [] headerValues, Class<?> classEntity, Object... uriVariables) {
		try {
			return getPrimary(uri, classEntity, uriVariables)
					   .header(headerName, headerValues)
					   .retrieve()
					   .bodyToMono(classEntity)
					   .block();
		} catch (Exception e) {
		}
		return null;
	}
	
	// metodo auxiliar para o metodo get
	private RequestHeadersSpec<?> getPrimary(String uri, Class<?> classEntity, Object... uriVariables) {
		return webClient 
				.get()
				.uri(uri, uriVariables);
	}
	
	// metodo auxiliar para o metodo post
	private RequestBodySpec postPrimary(String uri){
		return webClient
				.post()
				.uri(uri);
	}
	
	// metodo auxiliar para o metodo put
	private RequestBodySpec putPrimary(String uri, Object ...uriVariables) {
		return webClient 
			.put()
			.uri(uri, uriVariables);
	}

	/*Método Post com retorno da Resposta e sem header*/
	
	public Object post(String uri, Object object, Class<?> classEntity) {
		try {
			return postPrimary(uri)
					   .body(BodyInserters.fromObject(object))
					   .retrieve()
					   .bodyToMono(classEntity)
					   .block();
		} catch (Exception e) {
		}
		return null;
	}
	
	/*Método Post com retorno da Resposta e com header*/
	public Object post(String uri, String headerName, String [] headerValues, Object object, Class<?> classEntity) {
		try {
			return postPrimary(uri)
					   .header(headerName, headerValues)
					   .body(BodyInserters.fromObject(object))
					   .retrieve()
					   .bodyToMono(classEntity)
					   .block();
		} catch (Exception e) {
		}
		return null;
	}
	
	/*Método Post sem retorno da Resposta e com header*/
	public void postLessResponse(String uri, String headerName, String [] headerValues, Object object, Class<?> classEntity) {
		try {
			postPrimary(uri)
				.header(headerName, headerValues)
				.body(BodyInserters.fromObject(object))
				.retrieve()
				.bodyToMono(classEntity)
				.block();
		} catch (Exception e) {
		}
	}
	
	/*Método Post sem retorno da Resposta e sem header*/
	public void postLessResponse(String uri, Object object, Class<?> classEntity) {
		try {
			postPrimary(uri)
				.body(BodyInserters.fromObject(object))
				.retrieve()
				.bodyToMono(classEntity)
				.block();
		} catch (Exception e) {
		}
	}
	
	/*Método Put com retorno da Resposta e sem header*/
	public Object put(String uri, Object object, Class<?> classEntity, Object ...uriVariables) {
		try {
			return putPrimary(uri, uriVariables)
					   .body(BodyInserters.fromObject(object))
					   .retrieve()
					   .bodyToMono(classEntity)
					   .block();
		} catch (Exception e) {
		}
		return null;
	}
	
	/*Método Put sem retorno da Resposta e com header*/
	public Object put(String uri, String headerName, String [] headerValues, Object object, Class<?> classEntity, Object ...uriVariables) {
		try {
			return putPrimary(uri, uriVariables)
					   .header(headerName, headerValues)
					   .body(BodyInserters.fromObject(object))
					   .retrieve()
					   .bodyToMono(classEntity)
					   .block();
		} catch (Exception e) {
		}
		return null;
	}
	
	/*Método Put sem retorno da Resposta e com header*/
	public void putLessResponse(String uri, String headerName, String [] headerValues, Object object, Class<?> classEntity, Object ...uriVariables) {
		try {
			putPrimary(uri, uriVariables)
				.header(headerName, headerValues)
				.body(BodyInserters.fromObject(object))
				.retrieve()
				.bodyToMono(classEntity)
				.block();
		} catch (Exception e) {
		}
	}
	
	/*Método Put sem retorno da Resposta e sem header*/
	public void putLessResponse(String uri, Object object, Class<?> classEntity, Object ...uriVariables) {
		try {
			putPrimary(uri, uriVariables)
				.body(BodyInserters.fromObject(object))
				.retrieve()
				.bodyToMono(classEntity)
				.block();
		} catch (Exception e) {
		}
	}
	
	/*Método Delete sem header*/
	public void delete(String uri, Object ...uriVariables) {
		try {
			webClient
			    .delete()
			    .uri(uri, uriVariables)
			    .exchange()
			    .block();
		} catch (Exception e) {
		}
	}	
	
	/*Método Delete com header*/
	public void delete(String uri, String headerName, String [] headerValues, Object ...uriVariables) {
		try {
			webClient
			    .delete()
			    .uri(uri, uriVariables)
			    .header(headerName, headerValues)
			    .exchange()
			    .block();
		} catch (Exception e) { 
		}
	}	
}
