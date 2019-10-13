package com.madtech.superschoolapi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

import com.madtech.superschoolapi.models.School;
import com.madtech.superschoolapi.util.Database;

public class SchoolDao {

	private Database db;
	private Connection connection;
	private Statement statement;
	private PreparedStatement preparedStatement;

	public SchoolDao() {
		this.db = new Database();
		this.connection = db.connect();

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
			school.setUpdatedBy(rs.getString("updateBy"));
			school.setCreatedDateTime(rs.getTimestamp("createdDateTime"));
			school.setUpdatedDateTime(rs.getTimestamp("updatedDateTime"));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return school;
	}

	public School getSchoolById(String id) {
		
		String query;
		ResultSet resultSet;
		School school = null;
		
		try {
			query = "SELECT * FROM school WHERE id = " + id;
			resultSet = statement.executeQuery(query);
			school = this.mapSchoolData(resultSet);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return school;
	}
	
//	public boolean insertSchool(School school) {
//		String query;
//		
//		try {
//			query = "INSERT INTO school" +
//					"(id, name, board, startedDate, joinedDate, website, primaryContact, secondaryContact, primaryEmail, secondaryEmail, languages,) VALUES ()";
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}

	@Override
	protected void finalize() throws Throwable {
		if(!this.statement.isClosed()) this.statement.close();
		if(!this.connection.isClosed()) this.connection.close();
		super.finalize();
	}

}
