package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student implements Element, Visitee{
    String nume;
    String mail;

    List<Element> ListofStudent = new ArrayList<>();
    public Student(String nume, String mail) {
        this.nume=nume;
        this.mail=mail;
    }


    @Override
    public void add(Element e) {
        ListofStudent.add(e);
    }

    @Override
    public void accept(PrintVisitor printVisitor) {
        printVisitor.visitStudent(this);
    }


    public String getTitle() {
        return nume + ", " + mail;
    }

    public Element get(int i) {
        return ListofStudent.get(i);
    }

    @Override
    public void accept(Visitor v) {
        v.visitStudent(this);

    }
}
