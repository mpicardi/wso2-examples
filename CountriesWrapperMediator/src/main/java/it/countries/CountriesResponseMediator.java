package it.countries;

import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

public class CountriesResponseMediator extends AbstractMediator {
	
	public boolean mediate(MessageContext context) {
		//System.out.println(context.getProperty("GetCitiesByCountryResult"));
		return true;
	}

}
