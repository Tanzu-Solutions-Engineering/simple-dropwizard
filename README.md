# simple-dropwizard

Simple DropWizard application

## Usage (CloudFoundry)

```
git clone https://github.com/Pivotal-Field-Engineering/simple-dropwizard.git
mvn clean package
cf push
```

## Usage (Local)

```
git clone https://github.com/Pivotal-Field-Engineering/simple-dropwizard.git
mvn clean package
java -jar target/simple-dropwizard-1.0.0-SNAPSHOT.jar server src/main/resources/dropwizard-application.yml
```


