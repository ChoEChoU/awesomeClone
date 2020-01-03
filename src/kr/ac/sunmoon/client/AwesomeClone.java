package kr.ac.sunmoon.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.gwtext.client.core.Margins;
import com.gwtext.client.core.RegionPosition;
import com.gwtext.client.widgets.Panel;
import com.gwtext.client.widgets.TabPanel;
import com.gwtext.client.widgets.Viewport;
import com.gwtext.client.widgets.form.HtmlEditor;
import com.gwtext.client.widgets.layout.BorderLayout;
import com.gwtext.client.widgets.layout.BorderLayoutData;
import com.gwtext.client.widgets.layout.FitLayout;  

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class AwesomeClone implements EntryPoint {
	public void onModuleLoad() {
		Panel panel = new Panel();  
        panel.setBorder(false);  
        panel.setPaddings(15);  
        panel.setLayout(new FitLayout());  
  
        Panel borderPanel = new Panel();  
        borderPanel.setLayout(new BorderLayout());  
  
        //add north panel  
        Panel northPanel = new Panel();  
        northPanel.setHtml("<center><p><font size='5'>Awesome</font></p></center>");
        northPanel.setHeight(32);
        borderPanel.add(northPanel, new BorderLayoutData(RegionPosition.NORTH));  
  
        //add south panel  
        Panel southPanel = new Panel();  
        southPanel.setHtml("<p>Keywords</p>");  
        southPanel.setHeight(100); 
        southPanel.setCollapsible(true);  
        southPanel.setTitle("Keywords");  
  
        BorderLayoutData southData = new BorderLayoutData(RegionPosition.SOUTH);  
        southData.setMinSize(100);  
        southData.setMaxSize(200);  
        southData.setMargins(new Margins(0, 0, 0, 0));  
        southData.setSplit(true);  
        borderPanel.add(southPanel, southData);  
  
        //add east panel  
        Panel eastPanel = new Panel();  
        eastPanel.setHtml("<p>east panel</p>");  
        eastPanel.setTitle("Figures of keywords");  
        eastPanel.setCollapsible(true);  
        eastPanel.setWidth(225);  
  
        BorderLayoutData eastData = new BorderLayoutData(RegionPosition.EAST);  
        eastData.setSplit(true);  
        eastData.setMinSize(175);  
        eastData.setMaxSize(400);  
        eastData.setMargins(new Margins(0, 0, 5, 0));  
  
        borderPanel.add(eastPanel, eastData);

        HtmlEditor htmlEditor = new HtmlEditor();
        TabPanel centerPanel = new TabPanel();	
		centerPanel.add(htmlEditor);
  
        borderPanel.add(centerPanel, new BorderLayoutData(RegionPosition.CENTER));  
  
        panel.add(borderPanel);  
  
        Viewport viewport = new Viewport(panel);  
	}
}
