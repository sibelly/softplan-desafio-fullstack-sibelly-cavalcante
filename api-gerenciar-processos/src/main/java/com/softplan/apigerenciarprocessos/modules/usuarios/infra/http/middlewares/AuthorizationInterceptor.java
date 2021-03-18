package com.softplan.apigerenciarprocessos.modules.usuarios.infra.http.middlewares;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthorizationInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

        String auth = request.getHeader("Authorization");
        String uri = request.getRequestURI();

        if ((uri == null || !uri.contains("sessoes")) && (auth == null || auth.isEmpty())) {
            response.setStatus(401);
            return false;
        }

        return true;
    }
}
