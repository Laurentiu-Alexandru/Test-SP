package org.example;

public class PrintVisitor implements Visitor{
    @Override
    public void visitGrupa(Grupa s) {
        System.out.println(s.getTitle());

        int i = 0;
        while (true) {
            try {
                Element child = s.get(i);
                ((Visitee)child).accept(this);
            }
            catch (Exception e) {
                return;
            }
        }

    }

    @Override
    public void visitSemigrupa(Semigrupa s) {
        System.out.println(s.getTitle());

        int i = 0;
        while (true) {
            try {
                Element child = s.get(i);
                ((Visitee)child).accept(this);
            }
            catch (Exception e) {
                return;
            }
        }

    }

    @Override
    public void visitStudent(Student st) {

        System.out.println(st.getTitle());

        int i = 0;
        while (true) {
            try {
                Element child = st.get(i);
                ((Visitee)child).accept(this);
            }
            catch (Exception e) {
                return;
            }
        }

    }

    @Override
    public void visitAn(An an) {
        System.out.println(an.getTitle());

        int i = 0;
        while (true) {
            try {
                Element child = an.get(i);
                ((Visitee)child).accept(this);
            }
            catch (Exception e) {
                return;
            }
        }

    }
}
