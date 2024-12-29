package org.example.extends1.access.child;

import org.example.extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectedValue = 1;

        publicMethod();
        protectedMethod();

        printParent();
    }
}

