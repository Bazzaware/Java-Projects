## Java Projects

Example of a java application using several different java projects.

* Main applicaion
    Uses classes from :
    * member-a project has Car class
    * member-b project has Cat class

### Main Project App.java
```java
package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Car car = new Car("Ford", "Capri");
        Cat cat = new Cat("Bagpuss", "Pink and White");

        System.out.print(car);
        System.out.print(cat);

    }
}
```
### member-a project Car class
```java
package com.example;

public class Car {
    private String _make;
    private String _model;

    public Car(String make, String model) {
        _make = make;
        _model = model;
    }

    public String toString() {
        return "Make: " + _make + "\nModel: " + _model;
    }
 
}
```

### member-b project Cat class
```java
package com.example;

public class Cat {
    private String _name;
    private String _colour;

    public Cat(String name, String colour) {
        _name = name;
        _colour = colour;
    }

    public String toString() {
        return "Name: " + _name + "\nColour: " + _colour;
    }

}
```
### Main pom

```xml
  <packaging>pom</packaging>
  <modules>
      <module>../car</module>
      <module>../cat</module>
  </modules>

  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>
    <!-- Additional dependencies -->
    <dependency>
      <groupId>com.example</groupId>
      <artifactId>member-a</artifactId>
      <version>1.0-SNAPSHOT</version>
    </dependency>
    <dependency>
      <groupId>com.example</groupId>
      <artifactId>member-b</artifactId>
      <version>1.0-SNAPSHOT</version>
    </dependency>
  </dependencies>

```


### Output from Main App
```
    Hello World!
    Make: Ford
    Model: CapriName: Bagpuss
    Colour: Pink and White  
```