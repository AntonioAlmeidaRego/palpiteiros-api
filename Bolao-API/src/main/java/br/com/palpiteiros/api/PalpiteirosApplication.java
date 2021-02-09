package br.com.palpiteiros.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import br.com.palpiteiros.api.annotations.BaseUrl;

@SpringBootApplication
public class PalpiteirosApplication {
	@BaseUrl
	private String url;

	@Bean
	public WebClient webClient(WebClient.Builder builder) {
		return builder
				.baseUrl(url)
				.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(PalpiteirosApplication.class, args);
	}

}
