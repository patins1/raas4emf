package raas.experiments.jaxbased.webservice;

import java.util.Collections;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class TeneoProtocalJAXWSHandler implements SOAPHandler<SOAPMessageContext> {
	@Override
	public void close(MessageContext arg0) {
	}

	@Override
	public boolean handleFault(SOAPMessageContext arg0) {
		return true;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext arg0) {
		return true;
	}

	@Override
	public Set<QName> getHeaders() {
		return Collections.EMPTY_SET;
	}
}
