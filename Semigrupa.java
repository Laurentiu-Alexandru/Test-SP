package org.example;

import java.util.ArrayList;
import java.util.List;

public class Semigrupa implements Element, Visitee{
    String semigrno;

    List<Element> ListofSemigrupa = new ArrayList<>();
    public Semigrupa(String semigrno) {
        this.semigrno=semigrno;
    }

    @Override
    public void add(Element e) {
        ListofSemigrupa.add(e);
    }

    @Override
    public void accept(PrintVisitor printVisitor) {
        printVisitor.visitSemigrupa(this);
    }

    public Element get(int i) {
        return ListofSemigrupa.get(i);
    }

    public String getTitle() {
        return semigrno;
    }

    @Override
    public void accept(Visitor v) {
        v.visitSemigrupa(this);
    }
}
