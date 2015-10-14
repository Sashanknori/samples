package com.test.mdcfilters;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.MDC;

public class MDCFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		try {
			MDC.put("server", request.getServerName());
			MDC.put("port", String.valueOf(request.getServerPort()));
			MDC.put("remoteAddress", request.getRemoteAddr());
			MDC.put("transactionId", UUID.randomUUID().toString());
			MDC.put("protocol", request.getProtocol());
			chain.doFilter(request, response);

		} finally {
			MDC.clear();
		}

	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

}
