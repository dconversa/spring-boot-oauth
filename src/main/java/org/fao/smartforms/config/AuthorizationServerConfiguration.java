package org.fao.smartforms.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;


/**
 * This annotation enables the authorization /oauth/authorize
 * and the token /oauth/token endpoints. This secures everything in the server except for the oauth endpoints, e.g. /oauth/authorize.
 * The user is responsible for securing the authorization endpoint. The token endpoint will be automatically 
 * secured using HTTP basic authentication on the client’s credentials.—in this case by 
 * using the username and password from the database. 
*/
@Configuration
@EnableOAuth2Sso
public class AuthorizationServerConfiguration extends WebSecurityConfigurerAdapter{

	
}
