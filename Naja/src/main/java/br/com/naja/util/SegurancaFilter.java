package br.com.naja.util;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/webapp/*") 
public class SegurancaFilter implements Filter {

	@Override
	public void destroy() {
	}	
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException { 
		Sessao sessao = (Sessao)((HttpServletRequest) request).getSession().getAttribute("sessao");

		if (sessao == null || sessao.getMensagem().getCod() > 0) { 
			String contextPath = ((HttpServletRequest) request).getContextPath();
			
			if (sessao != null) 
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(sessao.getMensagem().getTexto()));
			
			((HttpServletResponse) response).sendRedirect(contextPath + "/index.xhtml");
		} 	
		
		chain.doFilter(request, response);
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	} 	
	
}
