package org.example;

public interface Visitor {

    void visitGrupa(Grupa g);
    void visitSemigrupa(Semigrupa s);
    void visitStudent(Student st);

    void visitAn(An an);

}
