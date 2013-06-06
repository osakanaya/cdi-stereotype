package org.jboss.as.quickstarts.cdi.interceptor;

import java.util.ArrayList;
import java.util.List;

public class History {
	private static List<String> itemHistory = new ArrayList<String>();
	
	public static List<String> getItemHistory() {
		return itemHistory;
	}
}
