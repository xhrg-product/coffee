package org.march.cc.sem;

public class LocalScope {

    private LocalScope parent;

    public LocalScope getParent() {
        return parent;
    }

    public void setParent(LocalScope parent) {
        this.parent = parent;
    }

}
