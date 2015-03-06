package view;

import controller.WorldCupController;
import model.Country;

public class WorldCupApplication {

	public static void main(String[] args) 
	{
		//CREATE THE MODEL
		Country theDataModel = new Country("Ireland");
		
		//CONNECT THE CONTROLLER TO THE MODEL
		WorldCupController.getInstance().setDataModel(theDataModel);
		
		//CREATE THE VIEW
		WorldCupFrame wcf = new WorldCupFrame("World Cup 2015");
		wcf.setSize(600, 300);
		wcf.setVisible(true);
		
		//CONNECT THE CONTROLLER TO THE VIEW
		WorldCupController.getInstance().setGuiReference(wcf);

	}

}
