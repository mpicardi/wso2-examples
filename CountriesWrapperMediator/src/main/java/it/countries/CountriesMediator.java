package it.countries;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

public class CountriesMediator extends AbstractMediator {
	private final static Log LOGGER = LogFactory.getLog(CountriesMediator.class);
	public boolean mediate(MessageContext context) {
		System.out.println("--------------------------");
		System.out.println("-------MEDIATOR MSG STRING----------- FORZA NAPOLI SEMPRE");
		System.out.println("Mediator -> " +context.getMessageString());
		System.out.println("--------------------------");
		System.out.println("-------MEDIATOR PROPERTY STRING-----------");
		System.out.println(context.getProperty("web:CountryName"));
		
		return true;
	}
}
