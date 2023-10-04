package com.garage.seguridadspring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

/***************************************************************************************/

// esta es la clase que habilita la seguridad web, para ello requiere 2 anotaciones

@Configuration
@EnableWebSecurity
public class SeguridadAppConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        // esto es para crear un usuairo temporal... los usuario deberian estar en el servidor
        // luego veremos como lo implementamos

        User.UserBuilder usuarios = User.withDefaultPasswordEncoder();

        // aca creamos el usuario y password para autenticar
        auth.inMemoryAuthentication().withUser(usuarios.username("Juan").password("123").roles("Administrator"));
        auth.inMemoryAuthentication().withUser(usuarios.username("Antonio").password("456").roles("User"));
        auth.inMemoryAuthentication().withUser(usuarios.username("Ana").password("789").roles("Ayudante"));
        auth.inMemoryAuthentication().withUser(usuarios.username("Laura").password("321").roles("Administrator"));
    }

/***************************************************************************************/

    // sobreescribiendo este metodo es para poder usar nuestros usuarios creo
    // este metodo se encara de configurar la seguridad en cuanto a login y demas...

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // nos mostrara un formulario
        http.authorizeRequests().anyRequest().authenticated().and().formLogin()
                .loginPage("/miFormularioDeLoginURL")                  // nombre del archivo del formulario
                .loginProcessingUrl("/autenticacionUsuario")     // URL donde se mapea
                .permitAll().and().logout().permitAll();

    }

/***************************************************************************************/

/***************************************************************************************/
}
