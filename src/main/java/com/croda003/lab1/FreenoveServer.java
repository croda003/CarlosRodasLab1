/**
 * 
 */
package com.croda003.lab1;

import java.sql.Time;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**Freenove Firmware Server Class
 * @author crodas
 *
 */
public class FreenoveServer extends App implements SelfCheckCapable {
	
	
	
	private int storageSize;
	private int serverNumber;
	private Time upTime;
	private String serverLocation;
	
	
	public void checkVersionNumber() {
		//Check Firmware version number with repository
	}
	
	public void retrieveVersionNUmber() {
		//retrieves firmware version number from repository
	}
	
	public void searchVersionNumber() {
		//searches firmware version number requested by Freenove app
	}
	
	public void retrieveFirmware() {
		//retrieves firmware update requested by Freenove app
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "FreenoveServer";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	

}
