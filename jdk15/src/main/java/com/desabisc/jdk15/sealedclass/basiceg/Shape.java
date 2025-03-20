package com.desabisc.jdk15.sealedclass.basiceg;

/**
 * Sealed Classes (Preview)
 * JEP 360: This feature allows developers to define classes or interfaces that can only be extended
 * or implemented by a limited set of subclasses.
 * This provides greater control over class hierarchies and helps improve code maintainability.
 * Use Case: Sealed classes are useful when you want to define a fixed set of related classes or interfaces.
 */
public sealed class Shape permits Circle, Square {
}