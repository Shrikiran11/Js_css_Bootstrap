package service;

import java.sql.SQLException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import mdoel.Car;
import mdoel.Home;
import repository.CarDaoImpl;
import repository.HomeDaoImpl;
import repository.ICarDao;
import repository.IHomeDao;

public class HomeServiceImpl implements IHomeService
{

	@Override
	public Home addCar(Home car) throws SQLException
	{
		IHomeDao idao=new HomeDaoImpl();
		idao.addCar(car);
		return null;
	}

	@Override
	public Home deleteCar(int tid) 
	{
		IHomeDao idao=new HomeDaoImpl();
		idao.deleteCar(tid);
		return null;
	}

	@Override
	public Home updateCar(Home car) throws SQLException 
	{
		IHomeDao idao=new HomeDaoImpl();
		idao2.updateCar(car);
		return null;
	}

	@Override
	public List<Home> getByName(String name) throws SQLException 
	{
		IHomeDao idao=new HomeDaoImpl();
		List<Car> carList1=null;
		carList1 =idao2.getByName(name);
		return carList1;
	}

	@Override
	public List<Home> getById(int id) throws SQLException {
		IHomeDao idao=new HomeDaoImpl();
		List<Car> carList2=null;
		carList2 =idao3.getById(id);
		return carList2;
	}

	@Override
	public List<Home> displayAll() throws SQLException 
	{
		IHomeDao idao=new HomeDaoImpl();
		List<Car> carList=null;
		carList =idao1.displayAll();
		return carList;
	}

	@Override
	public Home UpdateId(Home car) 
	{
		IHomeDao idao=new HomeDaoImpl();
		idao2.UpdateId(car);
		return null;
	}

	@Override
	public Home UpdateName(Home car) {
		IHomeDao idao=new HomeDaoImpl();
		idao2.UpdateName(car);
		return null;
	}

	@Override
	public Home UpdateBrand(Home car) {
		IHomeDao idao=new HomeDaoImpl();
		idao2.UpdateBrand(car);
		return null;
	}

	@Override
	public Home UpdateColour(Home car) {
		IHomeDao idao=new HomeDaoImpl();
		idao2.UpdateColour(car);
		return null;
	}

	@Override
	public Home UpdateModel(Home car) {
		IHomeDao idao=new HomeDaoImpl();
		idao2.UpdateModel(car);
		return null;
	}

	@Override
	public Home UpdateVariant(Home car) {
		IHomeDao idao=new HomeDaoImpl();
		idao2.UpdateVariant(car);
		return null;
	}

	@Override
	public Home UpdateCharges(Home car) {
		IHomeDao idao=new HomeDaoImpl();
		idao2.UpdateCharges(car);
		return null;
	}
	public static boolean isValidName(String name){
		Pattern namePattern=Pattern.compile("^[A-Za-z]{3,}$");
		Matcher nameMatcher=namePattern.matcher(name);
		return nameMatcher.matches();
	}
	public static boolean isValidBrand(String brand){
		Pattern namePattern=Pattern.compile("^[A-Za-z]{3,}$");
		Matcher nameMatcher=namePattern.matcher(brand);
		return nameMatcher.matches();
	}
	public static boolean isValidColour(String colour){
		Pattern namePattern=Pattern.compile("^[A-Za-z]{3,}$");
		Matcher nameMatcher=namePattern.matcher(colour);
		return nameMatcher.matches();
	}
	public static boolean isValidModel(String model){
		Pattern namePattern=Pattern.compile("^[A-Za-z]{3,}$");
		Matcher nameMatcher=namePattern.matcher(model);
		return nameMatcher.matches();
	}
	public static boolean isValidVariant(String variant){
		Pattern namePattern=Pattern.compile("^[A-Za-z]{3,}$");
		Matcher nameMatcher=namePattern.matcher(variant);
		return nameMatcher.matches();
	}
	public static boolean isValidId(int id) 
	{
		return (id>0);
	}public static boolean isValidAmount(int charges) 
	{
		return (charges>0);
	}

}
