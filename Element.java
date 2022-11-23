package org.example;

public interface Element {

    void add(Element e);

    void accept(PrintVisitor printVisitor);
}
