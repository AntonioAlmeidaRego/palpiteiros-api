package br.com.palpiteiros.api.enums;

import lombok.Getter;

@Getter
public enum ChampionshipType {
	RACING_POINTS_CHAMPIONSHIP("Campeonato de pontos corridos"), ELIMINATORY_PHASE("Fase Eliminatória");

	private String value;
	
	/*Metodo que retorna o valor do enum sem ser default
	 * Obs.: O valor default do enum é type.name*/
	public static String fromValue(String source) {

		if (source.equals(ChampionshipType.ELIMINATORY_PHASE.name())) {
			return ChampionshipType.ELIMINATORY_PHASE.getValue();
		}

		return ChampionshipType.RACING_POINTS_CHAMPIONSHIP.getValue();
	}

	private ChampionshipType(String value) {
		this.value = value;
	}
}
