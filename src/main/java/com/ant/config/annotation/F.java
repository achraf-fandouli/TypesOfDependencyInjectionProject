package com.ant.config.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*pour que la classe F travaille avec les annotations il faut qu'il soit un composant spring
et pour q'il soit un composant spring il faut au minimum avoir l'annotation @Component*/
@Component("f1")
public class F {

	@Autowired // injection implicite(sans la creation de setter)
	private E e;

	public void m() {
		e.show();
	}
}
