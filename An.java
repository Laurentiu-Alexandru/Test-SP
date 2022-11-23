package org.example;

import java.util.ArrayList;
import java.util.List;

public class An implements Element, Visitee {
    String an;

    List<Element> ListofAni = new ArrayList<>();
    public An(String an) {
        this.an=an;
    }


    @Override
    public void add(Element e) {
    ListofAni.add(e);
    }

    @Override
    public void accept(PrintVisitor printVisitor) {
        printVisitor.visitAn(this);
    }

    @Override
    public void accept(Visitor v) {
        v.visitAn(this);
    }

    public String getTitle() {
        return an;
    }

    public Element get(int i) {
       return ListofAni.get(i);
    }
}
