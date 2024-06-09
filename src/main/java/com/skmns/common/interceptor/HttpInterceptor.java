package com.skmns.common.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HttpInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("===========================");
        System.out.println("Request URI : " + request.getRequestURI());
        System.out.println("===========================");

        // login session check 
        

        
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // 요청을 처리한 후 View를 렌더링하기 전에 실행되는 메소드
        // 요청에 대한 처리 결과를 모델에 추가하거나 뷰를 변경할 수 있음
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // 요청 처리가 완료된 후 실행되는 메소드
        // 요청의 완료 상태를 로깅하거나 리소스를 정리하는 등의 후처리 작업을 수행할 수 있음
    }
}
