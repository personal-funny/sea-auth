package com.sea.auth.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by chris on 17-7-22.
 */
@RestController
public class AuthApi {
  @RequestMapping({ "/user", "/me" })
  public Map<String, String> user(Principal principal) {
    Map<String, String> map = new LinkedHashMap<>();
    map.put("name", principal.getName());
    return map;
  }
}
