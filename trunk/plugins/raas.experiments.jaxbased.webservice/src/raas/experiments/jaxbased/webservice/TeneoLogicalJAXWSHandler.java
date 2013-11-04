package raas.experiments.jaxbased.webservice;

import java.io.StringWriter;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;

public class TeneoLogicalJAXWSHandler implements LogicalHandler<LogicalMessageContext> {
	@Override
	public void close(MessageContext arg0) {
		System.out.println("close");
	}

	@Override
	public boolean handleFault(LogicalMessageContext arg0) {
		System.out.println("handleFault");
		return true;
	}

	@Override
	public boolean handleMessage(LogicalMessageContext messageContext) {
		boolean outbound = (Boolean) messageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		Object query = messageContext.get(MessageContext.QUERY_STRING);
		System.out.println("handleMessage: outbound=" + outbound + " query=" + query);
		Source request = messageContext.getMessage().getPayload();
		try {
			final StringWriter requestXmlWriter = new StringWriter();
			final Transformer trans = TransformerFactory.newInstance().newTransformer();
			trans.transform(request, new StreamResult(requestXmlWriter));
			final String requestXml = requestXmlWriter.toString();
			System.out.println(requestXml);
		} catch (Exception e) {
			// TransformerException, IOException, SAXException
			throw new RuntimeException("Conversion failed: " + e + ", in: " + request, e);
		}
		return true;
	}
}
