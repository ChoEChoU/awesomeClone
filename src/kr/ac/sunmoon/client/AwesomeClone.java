package kr.ac.sunmoon.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Float;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.gwtext.client.core.Margins;
import com.gwtext.client.core.Position;
import com.gwtext.client.core.RegionPosition;
import com.gwtext.client.widgets.BoxComponent;
import com.gwtext.client.widgets.Button;
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
        BoxComponent northPanel = new BoxComponent();
		HTML logo = new HTML(
				"<font size='6' ><h1 style='color:Black ;'>Awesome</h1></font>");
		logo.addStyleName("logo");
		northPanel.setEl(logo.getElement());
		northPanel.setHeight(40);
		borderPanel.add(northPanel, new BorderLayoutData(RegionPosition.NORTH));  
  
        Button extrationBtn = new Button("Extration");
        extrationBtn.setSize("100px", "20px");
        
        //add south panel  
        Panel southPanel = new Panel();
        southPanel.setHeight(60); 
        southPanel.setCollapsible(true);
        southPanel.setTitle("Keywords");
        southPanel.add(extrationBtn);
  
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
