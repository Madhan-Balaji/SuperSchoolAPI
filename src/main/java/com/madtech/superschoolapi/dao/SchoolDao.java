package com.madtech.superschoolapi.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.sql.Date;
import java.util.UUID;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.madtech.superschoolapi.models.School;
import com.madtech.superschoolapi.util.Database;

public class SchoolDao {

	private Database db;
	private Connection connection;
	private Statement statement;
	private PreparedStatement preparedStatement;
	private CallableStatement callableStatement;

	public static void main(String args[]) {
		SchoolDao dao = new SchoolDao();
		dao.getAllSchool();
		ObjectMapper m = new ObjectMapper();
		School schools = dao.getSchoolById("9d72efb5-13db-4d70-971c-dd1df3411ec5");
		try {
			System.out.println(m.writeValueAsString(schools));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public SchoolDao() {
		this.db = new Database();
		this.connection = db.connect();
		this.preparedStatement = null;
		this.callableStatement = null;

		try {
			this.statement = this.connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private String generateSchoolId() {
		return UUID.randomUUID().toString();
	}

	private School mapSchoolData(ResultSet rs) {

		School school = new School();

		try {
			school.setId(rs.getString("id"));
			school.setName(rs.getString("name"));
			school.setStartedDate(rs.getDate("startedDate"));
			school.setJoinedDate(rs.getDate("joinedDate"));
			school.setWebsite(rs.getString("website"));
			school.setPrimaryContact(rs.getDouble("primaryContact"));
			school.setSecondaryContact(rs.getDouble("secondaryContact"));
			school.setPrimaryEmail(rs.getString("primaryEmail"));
			school.setSecondaryEmail(rs.getString("secondaryEmail"));
			school.setBoard(rs.getString("board"));
			school.setLanguages(rs.getString("languages"));
			school.setKinderGardenAvailable(rs.getBoolean("kinderGardenAvailable"));
			school.setPrimaryAvailable(rs.getBoolean("primaryAvailable"));
			school.setSecondaryAvailable(rs.getBoolean("secondaryAvailable"));
			school.setHigherSecondaryAvailable(rs.getBoolean("higherSecondaryAvailable"));
			school.setGovernmentAided(rs.getBoolean("governmentAided"));
			school.setInternational(rs.getBoolean("international"));
			school.setSmartSchool(rs.getBoolean("smartSchool"));
			school.setDescription(rs.getString("description"));
			school.setLogo(rs.getString("logo"));
			school.setImage1(rs.getString("image1"));
			school.setImage2(rs.getString("image2"));
			school.setImage3(rs.getString("image3"));
			school.setDoorNo(rs.getString("doorNo"));
			school.setStreet(rs.getString("street"));
			school.setArea(rs.getString("area"));
			school.setCity(rs.getString("city"));
			school.setPincode(rs.getInt("pincode"));
			school.setCreatedBy(rs.getString("createdBy"));
			school.setUpdatedBy(rs.getString("updatedBy"));
			school.setCreatedDateTime(rs.getTimestamp("createdDateTime"));
			school.setUpdatedDateTime(rs.getTimestamp("updatedDateTime"));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return school;
	}

	public ArrayList<School> getAllSchool(){
		String query;
		ResultSet resultSet;
		ArrayList<School> schools = new ArrayList<School>();
		try {
			query = "SELECT * FROM school";
			resultSet = this.statement.executeQuery(query);
			while (resultSet.next()) {
				schools.add(this.mapSchoolData(resultSet));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return schools;
		
	}
	
	public School getSchoolById(String id) {
		
		String query;
		ResultSet resultSet;
		School school = null;
		
		try {
			query = "SELECT * FROM school WHERE id = '" + id + "'";
			resultSet = this.statement.executeQuery(query);
			school = this.mapSchoolData(resultSet);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return school;
	}
	
	public boolean insertSchool(School school) {
		String query;
		boolean result = false;
		try {
			query = "{CALL insertSchool(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
			
			this.callableStatement = connection.prepareCall(query);
			this.callableStatement.setString(1, this.generateSchoolId());
			this.callableStatement.setString(2, school.getName());
			this.callableStatement.setString(3, school.getBoard());
			this.callableStatement.setDate(4, school.getStartedDate());
			this.callableStatement.setDate(5, school.getJoinedDate());
			this.callableStatement.setString(6, school.getWebsite());
			this.callableStatement.setDouble(7, school.getPrimaryContact());
			this.callableStatement.setDouble(8, school.getSecondaryContact());
			this.callableStatement.setString(9, school.getPrimaryEmail());
			this.callableStatement.setString(10, school.getSecondaryEmail());
			this.callableStatement.setString(11, school.getLanguages());
			this.callableStatement.setBoolean(12, school.isKinderGardenAvailable());
			this.callableStatement.setBoolean(13, school.isPrimaryAvailable());
			this.callableStatement.setBoolean(14, school.isSecondaryAvailable());
			this.callableStatement.setBoolean(15, school.isHigherSecondaryAvailable());
			this.callableStatement.setBoolean(16, school.isGovernmentAided());
			this.callableStatement.setBoolean(17,  school.isInternational());
			this.callableStatement.setBoolean(18, school.isSmartSchool());
			this.callableStatement.setString(19, school.getDescription());
			this.callableStatement.setString(20, school.getLogo());
			this.callableStatement.setString(21, school.getImage1());
			this.callableStatement.setString(22, school.getImage2());
			this.callableStatement.setString(23, school.getImage3());
			this.callableStatement.setString(24, school.getDoorNo());
			this.callableStatement.setString(25, school.getStreet());
			this.callableStatement.setString(26, school.getArea());
			this.callableStatement.setString(27, school.getCity());
			this.callableStatement.setInt(28, school.getPincode());
			this.callableStatement.setString(29, school.getCreatedBy());
			this.callableStatement.setString(30, school.getUpdatedBy());
			this.callableStatement.setTimestamp(31, school.getCreatedDateTime());
			this.callableStatement.setTimestamp(32, school.getUpdatedDateTime());
			
			result = this.callableStatement.execute();
			this.callableStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	protected void finalize() throws Throwable {
		if(!this.statement.isClosed()) this.statement.close();
		if(!this.connection.isClosed()) this.connection.close();
		super.finalize();
	}

}
