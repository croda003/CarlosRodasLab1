/**
 * 
 */
package com.croda003.lab1;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**SD Card Class
 * @author crodas
 *
 */
public class SdCard extends RaspberryPi implements SelfCheckCapable {

	private int storageSize;

	private String formatType;
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "SdCard";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
}
