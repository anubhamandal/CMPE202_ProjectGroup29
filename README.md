# CMPE202_ProjectGroup29 Random Coders
This repository is for the team project for CMPE202 under Prof. Paul Nguyen.  

# Graph Coloring  

## Basic Concept  
Color a graph (similar to a map), where no adjacent vertex/edge may have the same color.  In addition, graphs must use a minimum number of colors.  

## Design

We have decided the game to be designed as follows:  
1. Pre-built Graphs: Built the graph like continuous curve and fill the intersecting regions.  
2. Designing graphs with predefined shapes as objects and fill them with the given colors as shown  


## TODO - Free-form graph creation.  Open Issues:  

1. What if a shape is completely encapsulated inside another shape?  (ie. Circle inside a larger square?).  We can deem the square to have the same color, but this is not ideal.  
2. What if a shape bisects another shape?  (ie. Oval bisects a rectangle)  Ideally, we would detect the bisection and make 2 shapes out of the rectangle.  However, based on OOP, the entire rectangle will have the same color.  

Solution #1: Have a way to detect bisection or complete encapsulation based on vertices.  (HARD)  
Solution #2: Use predefined maps (MED)  
Solution #3: Ask user to click inside the map to create vertices, and have program randomly connect the vertices to create shapes. (MED-HARD)  

