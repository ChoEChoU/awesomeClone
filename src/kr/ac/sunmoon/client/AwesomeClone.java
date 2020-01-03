package kr.ac.sunmoon.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class AwesomeClone implements EntryPoint {
	public void onModuleLoad() {
		VerticalPanel mainPanel = new VerticalPanel();
		RootPanel.get().add(mainPanel);
		
		Label lbTest = new Label("ASD");
		mainPanel.add(lbTest);
	}
}
