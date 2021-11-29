package service;

public class BooleanFunctionRepresentation {
    public void printPDNF(String[] x, String[] y, String[] z, String[] F) {
        StringBuilder res = new StringBuilder("ДДНФ =");
        for (int i = 0; i < x.length; i++) {
            if (F[i].equals("1")) {
                if (x[i].equals("0")) {
                    res.append(" ¯x");
                } else {
                    res.append(" x");
                }
                if (y[i].equals("0")) {
                    res.append("¯y");
                } else {
                    res.append("y");
                }
                if (z[i].equals("0")) {
                    res.append("¯z");
                } else {
                    res.append("z");
                }
                res.append(" v");
            }
        }
        System.out.println(res.toString().replaceFirst(".$", " "));
    }

    public void printPCNF(String[] x, String[] y, String[] z, String[] F) {
        StringBuilder res = new StringBuilder("ДКНФ = ");
        for (int i = 0; i < x.length; i++) {
            if (F[i].equals("0")) {
                if (x[i].equals("1")) {
                    res.append("(¯x");
                } else {
                    res.append("(x");
                }
                if (y[i].equals("1")) {
                    res.append(" v ¯y");
                } else {
                    res.append(" v y");
                }
                if (z[i].equals("1")) {
                    res.append(" v ¯z)");
                } else {
                    res.append(" v z)");
                }
            }
        }
        System.out.println(res);
    }
}
