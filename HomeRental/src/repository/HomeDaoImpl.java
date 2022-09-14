package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import mdoel.Car;
import mdoel.Home;

public class HomeDaoImpl implements IHomeDao {
	private static final String STR = "insert into car values(?,?,?,?,?,?,?)";
	private static final String DELETE_USERS_SQL = "delete from car where id=(?)";
	private static final String GET_ALL_DETAILS_USERS_SQL = "select * from car ";
	private static final String GET_DETAILS_BY_NAME_USERS_SQL = "select * from car where name= (?)";
	private static final String GET_DETAILS_BY_ID_USERS_SQL = "select * from car where id= (?)";
	private static final String UPDATE_DETAILS = "update car set name=(?),brand=(?),colour=(?),model=(?),variant=(?),CHARGES_PER_DAY=(?) where id=(?)";
	private static final String UPDATE_NAME = "update car set name=(?) where id=(?)";
	private static final String UPDATE_ID = "update car set id=(?) where id=(?)";
	private static final String UPDATE_BRAND = "update car set brand=(?) where id=(?)";
	private static final String UPDATE_COLOUR = "update car set colour=(?) where id=(?)";
	private static final String UPDATE_MODEL = "update car set model=(?) where id=(?)";
	private static final String UPDATE_VARIANT = "update car set variant=(?) where id=(?)";
	private static final String UPDATE_CHARGES = "update car set CHARGES_PER_DAY=(?) where id=(?)";
	@Override
	public Home addCar(Home car) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
		PreparedStatement prep = connection.prepareStatement(STR);

		int addrNo = car.getAddNo();
		String loc = car.getLoc();
		String style = car.getStyle();
		String paint = car.getPaint();
		String bhk = car.getBhk();
		String floor = car.getFloor();
		int rent = car.getRent();

		prep.setInt(1, addrNo);
		prep.setString(2, loc);
		prep.setString(3, style);
		prep.setString(4, paint);
		prep.setString(5, bhk);
		prep.setString(6, floor);
		prep.setInt(7, rent);

		prep.addBatch();

		int[] updateCounts = prep.executeBatch();
		System.out.println(Arrays.toString(updateCounts) + "ADDED");
		return null;
	}

	@Override
	public Home deleteCar(int tid) {
		try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
				"tiger");

				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USERS_SQL)) {
			preparedStatement.setInt(1, tid);

			System.out.println("DELETED ");
			// Step 3: Execute the query or update query
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// print SQL exception information
			System.err.println("SQLState: " + e.getSQLState());
			System.err.println("Error Code: " + e.getErrorCode());
			System.err.println("Message: " + e.getMessage());
		}
		return null;
	}

	@Override
	public Home updateCar(Home car) throws SQLException {

		try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
				"tiger"); PreparedStatement ps = connection.prepareStatement(UPDATE_DETAILS)) {
			int addrNo = car.getAddNo();
			String loc = car.getLoc();
			String style = car.getStyle();
			String paint = car.getPaint();
			String bhk = car.getBhk();
			String floor = car.getFloor();
			int rent = car.getRent();

			ps.setString(1, loc);
			ps.setString(2, style);
			ps.setString(3, paint);
			ps.setString(4, bhk);
			ps.setString(5, floor);
			ps.setInt(6, rent);
			ps.setInt(7, addrNo);

			int result = ps.executeUpdate();
			System.out.println("Number Of Record Updated" + result);
		} catch (SQLException e) {
			System.err.println("SQLState: " + e.getSQLState());
			System.err.println("Error Code: " + e.getErrorCode());
			System.err.println("Message: " + e.getMessage());
		}

		return null;
	}

	@Override
	public List<Home> getByName(String name) {

		int count = 0;
		List<Home> List1 = new ArrayList<Home>();
		ResultSet resultset1 = null;
		try (

				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
						"tiger");
				PreparedStatement ps = connection.prepareStatement(GET_DETAILS_BY_NAME_USERS_SQL)) {

			ps.setString(1, name);
			resultset1 = ps.executeQuery();

			while (resultset1.next()) {
				Home car = new Home();
				car.setAddNo(resultset1.getInt(1));
				car.setLoc(resultset1.getString(2));
				car.setStyle(resultset1.getString(3));
				car.setPaint(resultset1.getString(4));
				car.setBhk(resultset1.getString(5));
				car.setFloor(resultset1.getString(6));
				car.setRent(resultset1.getInt(7));
				List1.add(car);

				count++;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (count == 0) {
			return null;
		} else {
			return List1;
		}
	}

	@Override
	public List<Home> getById(int id) {
		int count = 0;
		List<Home> List2 = new ArrayList<Home>();
		ResultSet resultset2 = null;
		try (

				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
						"tiger");
				PreparedStatement ps = connection.prepareStatement(GET_DETAILS_BY_ID_USERS_SQL)) {

			ps.setInt(1, id);
			resultset2 = ps.executeQuery();

			while (resultset2.next()) {
				Home car = new Home();
				car.setId(resultset2.getInt(1));
				car.setName(resultset2.getString(2));
				car.setBrand(resultset2.getString(3));
				car.setColour(resultset2.getString(4));
				car.setModel(resultset2.getString(5));
				car.setVariant(resultset2.getString(6));
				car.setCharges(resultset2.getInt(7));
				List2.add(car);

				count++;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (count == 0) {
			return null;
		} else {
			return List2;
		}
	}

	@Override
	public List<Home> displayAll() throws SQLException {

		int count = 0;
		ResultSet resultset = null;

		List<Home> List = new ArrayList<Home>();
		try (

				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
						"tiger");
				PreparedStatement ps = connection.prepareStatement(GET_ALL_DETAILS_USERS_SQL)) {
			resultset = ps.executeQuery();

			while (resultset.next()) {
				Home car = new Home();
				car.setId(resultset.getInt(1));
				car.setName(resultset.getString(2));
				car.setBrand(resultset.getString(3));
				car.setColour(resultset.getString(4));
				car.setModel(resultset.getString(5));
				car.setVariant(resultset.getString(6));
				car.setCharges(resultset.getInt(7));
				List.add(car);

				count++;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (count == 0) {
			return null;
		} else {
			return List;
		}

	}

	@Override
	public Home UpdateId(Home car) {
		try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
				"tiger");
				PreparedStatement ps = connection.prepareStatement(UPDATE_ID)) {
			int id = car.getId();
			int id2 = car.getNumbers();
			ps.setInt(1,id2);
			ps.setInt(2,id);
			int result = ps.executeUpdate();
			System.out.println("ID Updated");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Home UpdateName(Home car) {
		try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
				"tiger");
				PreparedStatement ps = connection.prepareStatement(UPDATE_NAME)) {
			int id = car.getId();
			String name = car.getWords();
			
			ps.setString(1,name);
			ps.setInt(2,id);
			int result = ps.executeUpdate();
			System.out.println("Name Updated");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Home UpdateBrand(Home car) {
		try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
				"tiger");
				PreparedStatement ps = connection.prepareStatement(UPDATE_BRAND)) {
			int id = car.getId();
			String brand = car.getWords();
			
			ps.setString(1,brand);
			ps.setInt(2,id);
			int result = ps.executeUpdate();
			System.out.println("Brand Updated");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Home UpdateColour(Home car) {
		try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
				"tiger");
				PreparedStatement ps = connection.prepareStatement(UPDATE_COLOUR)) {
			int id = car.getId();
			String colour = car.getWords();
			
			ps.setString(1,colour);
			ps.setInt(2,id);
			int result = ps.executeUpdate();
			System.out.println("Colour Updated");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Home UpdateModel(Home car) {
		try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
				"tiger");
				PreparedStatement ps = connection.prepareStatement(UPDATE_MODEL)) {
			int id = car.getId();
			String model = car.getWords();
			
			ps.setString(1,model);
			ps.setInt(2,id);
			int result = ps.executeUpdate();
			System.out.println("Model Updated");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Home UpdateVariant(Home car) {
		try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
				"tiger");
				PreparedStatement ps = connection.prepareStatement(UPDATE_VARIANT)) {
			int id = car.getId();
			String variant = car.getWords();
			
			ps.setString(1,variant);
			ps.setInt(2,id);
			int result = ps.executeUpdate();
			System.out.println("Variant Updated");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Home UpdateCharges(Home car) {
		try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
				"tiger");
				PreparedStatement ps = connection.prepareStatement(UPDATE_CHARGES)) {
			int id = car.getId();
			int charges = car.getNumbers();
			ps.setInt(1,charges);
			ps.setInt(2,id);
			int result = ps.executeUpdate();
			System.out.println("Charges Updated");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
