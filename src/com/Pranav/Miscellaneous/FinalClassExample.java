package com.Pranav.Miscellaneous;

public class FinalClassExample 
{
    final void m1() 
    {
        System.out.println("This is a final method.");
    }
}

class B extends FinalClassExample 
{
    void m12()
    { 
        // COMPILE-ERROR! Can't override.
        System.out.println("Illegal!");
    }
}