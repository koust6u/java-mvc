package com.interface21.webmvc.servlet.mvc;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.interface21.webmvc.servlet.ModelAndView;

public interface HandlerAdapter {

    ModelAndView adapt(HttpServletRequest request, HttpServletResponse response) throws Exception;

    boolean support(HttpServletRequest request);
}