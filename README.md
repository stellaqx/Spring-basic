# Intro
Following [tutorial](https://www.youtube.com/watch?v=vtPkZShrvXQ&list=TLPQMjQwNTIwMjAdTxuqRJIm3A&index=1) on YouTube.

# Starting Server 
In IntelliJ, open `DemoApplication.main()` class, hit run.

Client: Paw.

# Deploy
In IntelliJ, open `Maven` menu, and under `Lifecycle`, click `install`.

Find `demo-0.0.1-SNAPSHOT.jar` under project `target/` folder. Open in terminal.

Run `java -jar demo-0.0.1-SNAPSHOT.jar` to start the server, make sure the port is not already in use.

Validate the server is running as expected by navigating to Chrome, go to `localhost:8080/api/v1/person`

Now we can distribute our server to thousands to clients.
