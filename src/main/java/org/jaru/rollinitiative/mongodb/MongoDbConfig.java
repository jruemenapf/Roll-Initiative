package org.jaru.rollinitiative.mongodb;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoFactoryBean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * @author Jan
 */
@Configuration
public class MongoDbConfig {

    protected final static String USER_NAME = "rollini";
    protected final static String USER_PASSWORD = "rollini";
    protected final static String DB_NAME = "dirty";
    protected final static String DB_HOST = "ds053539";
    protected final static int DB_PORT = 53539;


    public @Bean MongoDbFactory mongoDbFactory() throws Exception {
        return new SimpleMongoDbFactory(new MongoClient(DB_HOST, DB_PORT), DB_NAME, new UserCredentials(USER_NAME, USER_PASSWORD));
    }

    public @Bean MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }
}
