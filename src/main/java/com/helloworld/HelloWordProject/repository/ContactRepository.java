package com.helloworld.HelloWordProject.repository;

import com.helloworld.HelloWordProject.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

// import java.sql.PreparedStatement;
// import java.sql.SQLException;
// import java.sql.Timestamp;
// import java.time.LocalDateTime;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.jdbc.core.PreparedStatementSetter;
// import com.helloworld.HelloWordProject.mapper.ContactRowMapper;
// import org.springframework.beans.factory.annotation.Autowired;


/*
@Repository stereotype annotation is used to add a bean of this class
type to the Spring context and indicate that given Bean is used to perform
DB related operations and
* */
@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer> {

    List<Contact> findByStatus(String status);

    // private final JdbcTemplate jdbcTemplate;

    // @Autowired
    // public ContactRepository(JdbcTemplate jdbcTemplate) {
    //     this.jdbcTemplate = jdbcTemplate;
    // }

    // public int saveContactMsg(Contact contact) {
    //     String sql = "insert into contact_msg (name,mobile_num,email,subject,message,status," +
    //             "created_at,created_by) values (?,?,?,?,?,?,?,?)";
    //     return jdbcTemplate.update(sql, contact.getName(), contact.getMobileNum(),
    //             contact.getEmail(), contact.getSubject(), contact.getMessage(),
    //             contact.getStatus(), contact.getCreatedAt(), contact.getCreatedBy());
    // }

    // public List<Contact> findMsgsWithStatus(String status) {
    //     String sql = "select * from contact_msg where status = ?";
    //     return jdbcTemplate.query(sql, new PreparedStatementSetter() {
    //         public void setValues(PreparedStatement preparedStatement) throws SQLException {
    //             preparedStatement.setString(1, status);
    //         }
    //     }, new ContactRowMapper());
    // }

    // public int updateMsgStatus(int contactId, String status, String updatedBy) {
    //     String sql = "update contact_msg set status = ?, updated_by = ?, updated_at = ? where contact_id = ?";
    //     return jdbcTemplate.update(sql, new PreparedStatementSetter() {
    //         public void setValues(PreparedStatement preparedStatement) throws SQLException {
    //             preparedStatement.setString(1, status);
    //             preparedStatement.setString(2, updatedBy);
    //             preparedStatement.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
    //             preparedStatement.setInt(4, contactId);
    //         }
    //     });
    // }

}