package com.JoseLPadi.bases;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TabHost;
public class MainActivity extends FragmentActivity {
	
	//My tabhost
    private TabHost tabHost;
  

    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Resources res = getResources();
		tabHost = (TabHost)findViewById(android.R.id.tabhost);
		
        tabHost.setup();
        
        TabHost.TabSpec spec=tabHost.newTabSpec("mitab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("",res.getDrawable(android.R.drawable.ic_btn_speak_now));
        tabHost.addTab(spec);
         
        spec=tabHost.newTabSpec("mitab2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("",res.getDrawable(android.R.drawable.ic_btn_speak_now));
        tabHost.addTab(spec);
         
        tabHost.setCurrentTab(0);
      //  initializeTabs();

        
	}
		
}
