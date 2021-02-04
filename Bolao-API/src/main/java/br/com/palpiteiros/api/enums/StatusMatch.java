package br.com.palpiteiros.api.enums;

import lombok.Getter;

@Getter
public enum StatusMatch {
	VISITING_TEAM_WIN("Vitória do time visitante"), HOME_TEAM_WIN("Vitória do time de casa"), DRAW("Empate");

	private String value;

	private StatusMatch(String value) {
		this.value = value;
	}

}
