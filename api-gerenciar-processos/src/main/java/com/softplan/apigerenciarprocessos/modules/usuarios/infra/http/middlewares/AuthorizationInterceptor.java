// package com.softplan.apigerenciarprocessos.modules.usuarios.infra.http.middlewares;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.context.SecurityContextHolder;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
// import org.springframework.web.servlet.HandlerInterceptor;

// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// import com.softplan.apigerenciarprocessos.modules.usuarios.services.AuthenticationService;
// import com.softplan.apigerenciarprocessos.shared.configs.JwtUtil;

// public class AuthorizationInterceptor implements HandlerInterceptor {
    
//     @Autowired
//     private AuthenticationService authenticationService;

//     @Autowired
//     private JwtUtil jwtUtil;

//     @Override
//     public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

        
//         // String auth = request.getHeader("Authorization");
//         // String uri = request.getRequestURI();
//         // System.out.println("********************** AuthorizationInterceptor preHandle" + !uri.contains("sessoes"));

//         // if ((uri == null || !uri.contains("sessoes")) && (auth == null || auth.isEmpty())) {
//         //     response.setStatus(401);
//         //     return false;
//         // }

//         // return true;

        
//         String authorizationHeader = request.getHeader("Authorization");
//         String uri = request.getRequestURI();
        
//         if ((uri == null || !uri.contains("sessoes")) && (authorizationHeader == null || authorizationHeader.isEmpty())) {
//             response.setStatus(401);
//             return false;
//         } else {
            
//             String username = null;
//             String jwt = null;
            
//             if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
//                 jwt = authorizationHeader.substring(7);
//                 username = jwtUtil.extractUsername(jwt);
//                 if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//                     System.out.println("********************** AuthorizationInterceptor preHandle" + authorizationHeader);
        
//                     UserDetails userDetails = this.authenticationService.loadUserByUsername(username);
        
//                     if (jwtUtil.validateToken(jwt, userDetails)) {
        
//                         UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
//                                 userDetails, null, userDetails.getAuthorities());
//                         usernamePasswordAuthenticationToken
//                                 .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//                         SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
//                         return true;
//                     }
//                 }
//             }
//             return true;
//         }
//     }
// }
