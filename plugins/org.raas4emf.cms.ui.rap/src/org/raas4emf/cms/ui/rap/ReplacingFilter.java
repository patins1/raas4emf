/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.rap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public final class ReplacingFilter implements Filter {
	private String from = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">";
	// private String to = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">";

	// private String to = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/REC-html40/strict.dtd\">";

	// private String to = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">";

	private String to = from;

	// private String to = "";

	public void init(FilterConfig filterConfig) throws ServletException {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest hr = (HttpServletRequest) request;
		if (!"startup=raas".equals(hr.getQueryString())) {
			chain.doFilter(request, response);
			return;
		}

		PrintWriter out = response.getWriter();
		CharResponseWrapper wrapper = new CharResponseWrapper((HttpServletResponse) response);
		chain.doFilter(request, wrapper);
		String content = wrapper.toString();
		if (content.contains(from))
			content = content.replace(from, to);
		else
			System.out.println("Could not repalce doctype!");
		// content = content.replace("</title>", "</title><meta http-equiv=\"X-UA-Compatible\" content=\"IE=IE8\" >");

		response.setContentLength(content.length());
		out.write(content);
		out.close();

	}
}
