package ru.Artur.firstMVC.dao;

import org.springframework.jdbc.core.RowMapper;
import ru.Artur.firstMVC.models.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        Person person = new Person();
        person.setEmail(resultSet.getString("email"));
        person.setAge(resultSet.getInt("age"));
        person.setId(resultSet.getInt("id"));
        person.setName(resultSet.getString("name"));
        return person;
    }
}
