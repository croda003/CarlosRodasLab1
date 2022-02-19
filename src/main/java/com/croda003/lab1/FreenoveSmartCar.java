/**
 * 
 */
package com.croda003.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * @author crodas
 *
 */
public class FreenoveSmartCar implements GenericComponent {

	
	private RaspberryPi myRaspberryPi;
	private SdCard mySDCard;
	private App myApp;
	private WiFiCard myWifiCard;
	private FreenoveServer myFreenoveServer;
	private FirmwareRepository myFirmwareRepository;




	/**Smart car Class
	 * @param args
	 * 
	 */
	
	public FreenoveSmartCar() {
		myRaspberryPi = new RaspberryPi();
		mySDCard = new SdCard();
		myWifiCard = new WiFiCard();
		myFreenoveServer = new FreenoveServer();
		myApp = new App();
		myFirmwareRepository = new FirmwareRepository();
	}
	
	private String lights;
	private boolean wheels;
	private boolean motors;
	private boolean camera;
	private String Wificard;
	private boolean raspberryPi;
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}




	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Freenove Smart Car";
	}




	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}




	@Override
	public List<SelfCheckCapable> getSubComponents() {
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, myRaspberryPi, mySDCard, myWifiCard,myFreenoveServer, myApp, myFirmwareRepository); // add all your sub components
		return internalComponents;
	}

}
