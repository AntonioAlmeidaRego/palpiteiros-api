package br.com.palpiteiros.api.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Value;

/*Anotação útil para definir o host da api de consumo e ser utilizada por qualquer classe do projeto*/

@Value("${base.host}")
@Retention(RetentionPolicy.RUNTIME) // Será executada em tempo de compilação
@Target(ElementType.FIELD) // Somente os atributos poderão utilizar dessa anotação
public @interface BaseUrl {
}
