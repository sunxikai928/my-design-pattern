package com.github.sunxikai928.component.transparent;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by sunxikai on 18/12/25.
 */
public class Composite implements Component {
    private Vector vector = new Vector();

    @Override
    public Component getComposite() {
        return this;
    }

    @Override
    public void sampleOperation() {
        Enumeration enumeration = components();
        while (enumeration.hasMoreElements()) {
            ((Component) enumeration.nextElement()).sampleOperation();
        }
    }

    @Override
    public void add(Component component) {
        vector.addElement(component);
    }

    @Override
    public void remove(Component component) {
        vector.removeElement(component);
    }

    @Override
    public Enumeration components() {
        return vector.elements();
    }
}
