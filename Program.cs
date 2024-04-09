using System;

// Base class (parent class)
class Animal {
    // Base class method
    public void Eat() {
        Console.WriteLine("Animal is eating");
    }
}

// Derived class (child class) inheriting from Animal
class Dog : Animal {
    // Additional method specific to Dog class
    public void Bark() {
        Console.WriteLine("Dog is barking");
    }
}//child
//my name
class Program {
    static void Main(string[] args) {
        // Create an instance of the derived class
        Dog myDog = new Dog();

        // Call methods from the base class
        myDog.Eat(); // This will call the Eat() method from the Animal class

        // Call methods from the derived class
        myDog.Bark(); // This will call the Bark() method from the Dog class
    }
}
