## Strategy Pattern

- Strategy pattern is used when child classes extending from a common parent
override a method from parent but have same implementation for multiple child
classes.

- This leads to multiple child classes having duplicate implementation which can be
avoided using strategy pattern
- Strategy pattern creates a common interface which implements methods required by child classes and multiple implementing classes can have different implementations
of the same method. 
- Child classes can use any of the implementations available instead of creating
implementations of their own.

Reference: [strategy pattern](https://refactoring.guru/design-patterns/strategy)