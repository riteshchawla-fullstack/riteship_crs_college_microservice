package com.riteship.crs.college.microservice.configs;

//@Configuration
public class RiteShipSimpleMongoConfig {

    /*@Bean
    public MongoClient mongo() {
        ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017/RiteShip_CRS_College_MicroService");
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();

        return MongoClients.create(mongoClientSettings);
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), "RiteShip_CRS_College_MicroService");
    }*/
}
