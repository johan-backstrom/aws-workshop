package com.github.johan.backstrom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;

@Component
public class MariadbClient {

    @Value("${mariadb.host}")
    String host;

    @Value("${mariadb.database}")
    String database;

    @Value("${mariadb.username}")
    String user;

    @Value("${mariadb.password}")
    String password;


    public List<Person> getPeople() {

        Sql2o sql2o = new Sql2o("jdbc:mariadb://" + host + ":3306/" + database, user, password);
        String sql = "SELECT id, firstName, lastName FROM Person";

        try (Connection con = sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(Person.class);
        }
    }
}