### Creational Patterns
1. Creational patterns are related to creation of objects

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

##
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
 


