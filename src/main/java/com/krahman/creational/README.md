## Creational Patterns
Creational patterns are related to creation of objects

### Factory Method and Abstract Factory

There is a bit of debate in what exactly is the difference between simple factory, factory method 
and abstract factory..

Here is my current understanding
All three factory patterns try to achieve the following goals
1. Separate the object creation from teh decision of which object to create - avoid teh tight 
coupling and repetitive code
2. Add new products(factory produced-objects) and new factories without breaking the object creating
program
3. Keep the "which object to create" decision outside the code
    - DB
    - Config


1. Simple factory is the simplest form where factories where OCP(object creating program) is aware 
of concrete factory. So point no 2 above is not achieved. Factory takes a input from the user/OCP to 
decide which object to create. This is generally useful when the Object creation is a very simple 
process and OCP is fine to be aware of concrete factory
But usually this is a compromised solution as addition of new factories would require change in 
the OCP
2. Factory Method goes one step further and abstracts the factory itself. The factory interface has
a factory method, which can be implemented by number of factory subclasses. Which factory to be loaded 
can come from a configuration. Each factory subclass returns only one type of product.
So this pattern achieves all there points above.
A real world examples is 
https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html#getInstance--

The calendar's getInstance static method is the static method here. Although there is no separate 
factory object, this static method serves the purpose in this case
This method, depending upon the input (zone and or locale), will return a instance of calendar with 
specific zone and locale set.

3. Abstract factory comes into picture when the use case deals with family of products need to be 
returned from the factory. Best example is DocumentBuilderFactory
https://docs.oracle.com/javase/8/docs/api/javax/xml/parsers/DocumentBuilderFactory.html#newInstance--
There is family of jaxp implementations, we can load more than one library in teh class path.
Now depending upon the paramater passed, a suitable implementation is returned.
 

## Builder Pattern
<B><I>"Seperate the construction of complex object from its representation so that construction process can 
create many representations."</I></B>

The builder patterns intents are:
1. Avoid binacular constructor anti pattern 
2. When the object build involves below, separate the construction logic from data
    - too many parameters
    - order of building
    - different constructions   
  
  
 Director <---Builder(abstract) --- Concrete Builder -- product
             
                           
 In the builder pattern, product is the object being built.
 Builder has the abstract methods to set the data for building the product.    
 one or more concrete builders would know what data and to be used for building the product. Think 
 of this as the parameters to be passed in the constructor. Each concrete builder implements the 
 methods from abstract builder and sets the appropriate data.
 Director has the logic to create the product. It takes a builder(knows only the abstract builder)
 in the constructor and operates on the product product held in the builder.
 
 <B>What is not a builder pattern</B>
 1. A stringbuilder where ever append adds a string to the stringbuilder.
 2. An object creation thorugh chained set methods.
 
 Real world examples 
  - there are lot of examples showing a static class with different setter and build method. This in
  my opinion a related pattern but not a builder pattern. As this is not fully satisfying the intent 
  above - we should be able to add a new builder and pass it on to the director
  
  - this one is good: https://github.com/dparoulek/java-koans/tree/master/src/main/java/com/upgradingdave/koans/builder
  -  
  
  
 ### Singleton Pattern
 
 <B>Intent:</B>
 1. Only one instance of an object needs to be there
 2. Make the class itself is responsible for keeping track of its sole instance
 
<B>When to Use:</B>  
 1. There is no state being maintained in the singleton
 2. Resource management use cases
 3. When the object creation is an expensive process and there is no reason to create multiple
  instances
  
 <B>Real world examples</B>
 1. Java runtime is a very good example - Runtime singleton gives handle to runtime information like
  memory utilization, input and output streams etc
 2. Logger - there is no reason to have multiple logger instances
    - All the processes need a single unified way of logging
    - Better control on synchronizing file logs  
    [The debate around logging is - I can make teh static wtiteToLog method synchronized and force 
    the parallel threads to queue up. But static methods are anyway discouraged?? its more elegant 
    to implement singleton and synchronize on instance method writeToFile  ]
    
 Good link with examples:
 https://www.geeksforgeeks.org/java-singleton-design-pattern-practices-examples/ 
 
 Singleton can be implemented in multiple ways
 1. EagerLoad - not thread safe
 2. LazyLoad - not thread safe
 3. LazyLoad threadsafe
      - Synchronized method to get instance
      - Double check lock - synchronized block
      - Bill Pugh method - most favoured, no synchronization involved, teh way JVM creates the 
      static class members is sequential, so automatically synchronized. Only problem is, if the 
      object creation fails - not much control to handle.
 