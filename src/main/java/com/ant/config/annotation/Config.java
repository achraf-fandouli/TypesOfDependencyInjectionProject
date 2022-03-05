package com.ant.config.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // c'est une classe de configuration
@ComponentScan(basePackages = "com.ant.config.annotation") /*
* il va scanner les compoasants (pour chaque composant il va lui creer un bean)
*  en plus il faut préciser le package ou il va scanner.
*/
public class Config {

}
