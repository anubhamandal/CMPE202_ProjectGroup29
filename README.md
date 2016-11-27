[![Stories in Ready](https://badge.waffle.io/veereshkamble/CMPE202_ProjectGroup29.png?label=ready&title=Ready)](https://waffle.io/veereshkamble/CMPE202_ProjectGroup29)
# CMPE202_ProjectGroup29 Random Coders
This repository is for the team project for CMPE202 under Prof. Paul Nguyen.  

# Graph Coloring  

## Basic Concept  
Color a graph (similar to a map), where no adjacent vertex/edge may have the same color.  In addition, graphs must use a minimum number of colors.  

## Design

We have decided the game to be designed as follows:  
1. Pre-built Graphs: Built the graph like continuous curve and fill the intersecting regions.  
2. Designing graphs with predefined shapes as objects and fill them with the given colors as shown  

## Running the game  

The multiplayer game requires that a server is running.  Try it out on localhost.
From base path...  
`make compile`  
`make run`  

### Docker -  local machine
Docker allows this game to be packaged and thrown onto the web.
Commands to run docker locally are as follows:  

1. Find out the local IP address via `docker-machine ls`.  The local ip address of the docker machine will be printed.  
2. Modify `MainMenu/GraphClient.java` to match this ip.  Docker machine will be running at port 80.
2. `make compile`  
3. `make app`  
4. `make docker-build`  
5. `make docker-run-bridge`
6. Docker machine will be running at docker-machine ip address at port 80  


### Multiple clients
Greenfoot IDE is one client, but for other clients, you will need the jar.  
On top right, there is a Share button.  
![Share button](./share.png)

Click Share, then go to Application.  
![Greenfoot export screen](./export.png)

Hit Export.  
The jar file will be compiled and stored in the path.  
Double click the jar file to run the second client.  




## TODO - Free-form graph creation.  Open Issues:  

1. What if a shape is completely encapsulated inside another shape?  (ie. Circle inside a larger square?).  We can deem the square to have the same color, but this is not ideal.  
2. What if a shape bisects another shape?  (ie. Oval bisects a rectangle)  Ideally, we would detect the bisection and make 2 shapes out of the rectangle.  However, based on OOP, the entire rectangle will have the same color.  

Solution #1: Have a way to detect bisection or complete encapsulation based on vertices.  (HARD)  
Solution #2: Use predefined maps (MED)  
Solution #3: Ask user to click inside the map to create vertices, and have program randomly connect the vertices to create shapes. (MED-HARD)  

