package com.ant.config.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*pour que la classe F travaille avec les annotations il faut qu'il soit un composant spring
et pour q'il soit un composant spring il faut au minimum avoir l'annotation @Component*/
@Component("f1")
public class F {

	private E e;

	
 /*
* ( a partir de la version spring 4.3 on peut faire l'injection dans le
* constructeur sans l'utilisation de l'annoation Autowired)
*/
	@Autowired
	public F(E e) {
		super();
		this.e = e;
	}

	public void m() {
		e.show();
	}
}
