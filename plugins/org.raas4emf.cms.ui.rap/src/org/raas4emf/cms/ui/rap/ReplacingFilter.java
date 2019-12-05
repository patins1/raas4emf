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

		// ((HttpServletResponse) response).addHeader("Access-Control-Allow-Origin", "null");
		((HttpServletResponse) response).addHeader("Access-Control-Allow-Origin", "*");
		((HttpServletResponse) response).addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");

		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String uri = httpRequest.getRequestURI();
		if (uri.startsWith(httpRequest.getContextPath()))
			uri = uri.substring(httpRequest.getContextPath().length());

		for (String token : new String[] { "/RepositoryRoot/", "/plugin/", "/WebContent/" }) {
			if (uri.contains(token)) {
				String url = uri.substring(0, uri.indexOf(token));
				if (httpRequest.getQueryString() != null && httpRequest.getQueryString().contains("servicehandler=")) {
					url += "?" + httpRequest.getQueryString();
				} else {
					String path = uri.substring(uri.indexOf(token) + 1);
					String filename = path.substring(path.lastIndexOf('/') + 1);
					url = url + "?servicehandler=downloadServiceHandler&artifact=" + path;
					if (httpRequest.getQueryString() != null) {
						url += "&" + httpRequest.getQueryString();
					}
					if (!url.contains("&filename=")) {
						url += "&filename=" + filename;
					}
				}
				System.out.println("Get " + url);
				request.getRequestDispatcher(url).forward(request, response);
				return;
			}
		}

		HttpServletRequest hr = (HttpServletRequest) request;
		if (true || !"GET".equals(hr.getMethod()) || hr.getParameterMap().containsKey("servicehandler") || hr.getPathInfo() != null) {
			chain.doFilter(request, response);
			return;
		}

		PrintWriter out = response.getWriter();
		CharResponseWrapper wrapper = new CharResponseWrapper((HttpServletResponse) response);
		chain.doFilter(request, wrapper);
		String content = wrapper.toString();
		to = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\">";
		to = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">";
		if (content.contains(from))
			content = content.replace(from, to);
		else
			Activator.err("Could not repalce doctype!");

		// content = content.replace("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=5,9,10;\" >", "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=11;\" >");
		// content = content.replace("</title>", "</title><meta http-equiv=\"X-UA-Compatible\" content=\"IE=IE8\" >");

		response.setContentLength(content.length());
		out.write(content);
		out.close();

	}
}
