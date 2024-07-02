package mid1.extends1.access.child;

import mid1.extends1.access.parents.Parents;

public class Child extends Parents {
    public void call() {
        publicValue = 1;
        protectedValue = 2;
        publicMethod();
        protectedMethod();
        printParent();
    }

}

