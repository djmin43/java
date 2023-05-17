package io.javabrains.springbootsecurity;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

public class SecurityConfiguration extends WebSecurityConfiguration {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        // set your configuration on the auth objects

    }
}
