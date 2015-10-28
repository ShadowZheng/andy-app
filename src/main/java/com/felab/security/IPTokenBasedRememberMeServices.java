package com.felab.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.rememberme.TokenBasedRememberMeServices;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by azheng on 10/28/2015.
 */
public class IPTokenBasedRememberMeServices extends TokenBasedRememberMeServices {

    private static final ThreadLocal<HttpServletRequest> requestHolder = new ThreadLocal<HttpServletRequest>();

    public HttpServletRequest getContext() {
        return requestHolder.get();
    }

    public void setContext(HttpServletRequest context) {
        requestHolder.set(context);
    }

    // 获取用户IP
    protected String getUserIPAddress(HttpServletRequest request) {
        return request.getRemoteAddr();
    }

    @Override
    public void onLoginSuccess(HttpServletRequest request, HttpServletResponse response, Authentication successfulAuthentication) {
        setContext(request);
        super.onLoginSuccess(request, response, successfulAuthentication);
    }
}
