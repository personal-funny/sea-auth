package com.sea.auth.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * Resource configure<br>
 *
 * Created by chris on 17-7-22.
 */
@Configuration
@EnableResourceServer
public class ResourceConfigure extends ResourceServerConfigurerAdapter {
  @Override
  public void configure(HttpSecurity http) throws Exception {
    // @formatter:off
    http.antMatcher("/me").authorizeRequests().anyRequest().authenticated();
    // @formatter:on
  }
}
