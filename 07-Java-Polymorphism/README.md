# Java Polymorphism Project

## Overview
This project demonstrates the core concepts of Polymorphism in Java. It showcases how objects can take on multiple forms and how behaviors can be altered at runtime based on the specific object instance. 

The project is divided into two main parts:
1. **Pacific Car Company**: Simulates a basic vehicle inheritance structure with polymorphic method overriding.
2. **Car R&D Company**: Focuses on designing a scalable structure for different engine types (Gas, Electric, Hybrid) and utilizing polymorphism in simulating engine starts and driving behaviors.

## Project Structure

- `org.example.company`: Contains the base `Car` class and its specific implementations (`Mitsubishi`, `Holden`, `Ford`).
- `org.example.arge`: Contains the `CarSkeleton` base class and its specific engine-type implementations (`GasPoweredCar`, `ElectricCar`, `HybridCar`).

## Key Concepts Applied

- **Inheritance**: Creating hierarchical relationships between sınıflar (e.g., `Car` as a parent class for specific car models).
- **Method Overriding**: Redefining parent methods in child classes to provide specific behaviors (`startEngine()`, `accelerate()`, `brake()`).
- **Encapsulation**: Using `private` access modifiers for class fields and providing `getter` methods.
- **Polymorphism**: Treating objects of different classes uniformly through a common parent reference, allowing dynamic method resolution at runtime.

## Usage

To run the simulation and test the polymorphic behaviors:
1. Open the project in IntelliJ IDEA.
2. Navigate to the `Main` or `MainTest` class.
3. Run the application to see the console output reflecting the overridden methods for different car types.
