/**
 * 
 */
package com.croda003.lab1;


import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**Raspberry Pi Class
 * @author crodas
 *
 */
public class RaspberryPi extends FreenoveSmartCar implements SelfCheckCapable {
	
	private float modelVersion;
	private int ramSize;
	private String cpuType;
	
	
	
public void checkFirmwareVersion() {
	//checks Firmware version installed on the SD card
}

public void flashFirmware() {
	//Installs firmware on SD card
}



@Override
public String getComponentName() {
	// TODO Auto-generated method stub
	return "RaspberryPi";
}

@Override
public boolean selfCheck() {
	// TODO Auto-generated method stub
	return SelfCheckUtils.randomCheck(0.3);
}








	
	
	

}
