package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.Country;

public class CountrySerializer 
{
	private Country theCountry;
	
	public CountrySerializer(Country theCountry)
	{
		this.theCountry = theCountry;
	}
	
	public void writeToFile()
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("C:\\WorldCup\\country.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this.theCountry);
			oos.close();
		}
		catch(IOException ioex)
		{
			System.out.println(ioex.getMessage());
		}
		
	}
	
	
}
