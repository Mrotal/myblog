//package com.hacker9527.myblog.Config;
//
//
//
//import com.hacker9527.myblog.shrio.Realm;
//import org.apache.shiro.mgt.SessionsSecurityManager;
//import org.apache.shiro.mgt.SecurityManager;
//import org.apache.shiro.session.mgt.SessionManager;
//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
//import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
//import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
//import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
//import org.crazycake.shiro.RedisCacheManager;
//import org.crazycake.shiro.RedisSessionDAO;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.servlet.Filter;
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
///**
// * @author Mrotal
// * @create 2020-10-22-12:48
// */
//@Configuration
//public class ShiroConfig {
//
////    @Autowired
////    RedisSessionDAO redisSessionDAO;
////
////    @Autowired
////    RedisCacheManager redisCacheManager;
//
//    @Bean
//    public SessionManager sessionManager(RedisSessionDAO redisSessionDAO) {
//        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
//
//        // inject redisSessionDAO
//        sessionManager.setSessionDAO(redisSessionDAO);
//
//        // other stuff...
//
//        return sessionManager;
//    }
//
//    @Bean
//    public SessionsSecurityManager securityManager(Realm realm, SessionManager sessionManager,RedisCacheManager redisCacheManager) {
//        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager(realm);
//
//        //inject sessionManager
//        securityManager.setSessionManager(sessionManager);
//
//        // inject redisCacheManager
//        securityManager.setCacheManager(redisCacheManager);
//
//        // other stuff...
//
//        return securityManager;
//    }
//
//    @Bean
//    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
//        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
//        LinkedHashMap<String, String> map = new LinkedHashMap<>();
//        map.put("/**","authc");
//        chainDefinition.addPathDefinitions(map);
//        return chainDefinition;
//    }
//
//    @Bean
//    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager, ShiroFilterChainDefinition filterChainDefinition) {
//        ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
//        shiroFilter.setSecurityManager(securityManager);
//
////        HashMap<String, Filter> map = new HashMap<>();
////        map.put("jwt",);
////        shiroFilter.setFilters(map);
//
//        Map<String, String> chainMap = filterChainDefinition.getFilterChainMap();
//        shiroFilter.setFilterChainDefinitionMap(chainMap);
//        return shiroFilter;
//    }
//}
