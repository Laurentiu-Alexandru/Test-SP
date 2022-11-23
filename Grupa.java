package org.example;

import java.util.ArrayList;
import java.util.List;

public class Grupa implements Element, Visitee{
    String grupno;
    List<Element> ListofContent = new ArrayList<>();

    public void add(Element e) {
        ListofContent.add(e);
    }


    @Override
    public void accept(PrintVisitor printVisitor) {
        printVisitor.visitGrupa(this);

    }

    public Grupa(String grupno) {
        this.grupno=grupno;
    }

    public String getTitle() {
        return grupno;
    }

    public Element get(int i) {
    return ListofContent.get(i);
    }

    @Override
    public void accept(Visitor v) {
        v.visitGrupa(this);
    }
}
