# Configuring Hibernate with Spring

This application shows how to configure Hibernate with Spring.
You can read a full description of the process in the [following article](https://allaroundjava.com)

## Project Structure
Project consists of four modules:
- HibernateSpring - root module
- Common - containing common classes - entity and a Dao interface
- ApplicationManaged - Presents how to configure Hibernate & Spring with Application managed EntityManagers with persitence.xml
- ContainerManaged - Configures Hibernate & Spring with Container Managed Entity Manager approach. This approach is fully xml-less

Both ApplicationManaged and ContainerManaged really differ by Spring configuration. The Dao classes which you can see are exactly the same.
Both submodules contain unit test classes which are exactly the same, however use their own Spring configuration.
Top level HibernateSpring module's .pom file contains all the relevant dependencies.

## Running the application
Clone the application with git and run
```mvn install```

This will run the unit tests which are contained in ApplicationManaged and ContainerManaged modules.

## Database
This application uses an in-memory database - H2. In order to run the tests you don't need to install a database of your own.
