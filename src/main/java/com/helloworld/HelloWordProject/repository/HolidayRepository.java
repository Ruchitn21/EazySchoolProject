package com.helloworld.HelloWordProject.repository;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.BeanPropertyRowMapper;
// import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.helloworld.HelloWordProject.model.Holiday;

@Repository
public interface HolidayRepository extends CrudRepository<Holiday, Integer> {

    // private final JdbcTemplate jdbcTemplate;

    // @Autowired
    // public HolidayRepository(JdbcTemplate jdbcTemplate) {
    //     this.jdbcTemplate = jdbcTemplate;
    // }

    // public List<Holiday> findAll() {
    //     String sql = "SELECT * FROM holidays";
    //     var rowMapper = BeanPropertyRowMapper.newInstance(Holiday.class);
    //     return jdbcTemplate.query(sql, rowMapper);
    // }
    
}
