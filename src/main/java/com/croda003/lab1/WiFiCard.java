package com.croda003.lab1;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**Wifi Card Class
 * @author crodas
 *
 */

public class WiFiCard extends RaspberryPi implements SelfCheckCapable {
	
	
	
	private float radioFrequency;
	
	
	public void connectToWiFi() {
		//connects to Wifi via phone App
	}
	
	public void download() {
		//downloads files
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "WiFiCard";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
	

}
