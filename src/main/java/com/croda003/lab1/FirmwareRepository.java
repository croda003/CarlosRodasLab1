/**
 * 
 */
package com.croda003.lab1;

import java.sql.Time;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * @author crodas
 *
 */
public class FirmwareRepository extends FreenoveServer implements SelfCheckCapable {

	
	private String firmwareVersions;
	private int arraySize;
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "FirmwareRepository";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	
	}
}