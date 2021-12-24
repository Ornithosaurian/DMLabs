package service;

public class Tree {
    public static StringBuilder treeTraversal(TreePart root) {
        StringBuilder output = new StringBuilder();
        if (root.actRoot == ' ') {
            output.append(root.root);
            output.append(' ');
        } else {
            switch (root.actRoot) {
                case ('+') -> {
                    output.append('+');
                    output.append(treeTraversal(root.branch1));
                    output.append(treeTraversal(root.branch2));
                }
                case ('-') -> {
                    output.append('-');
                    output.append(treeTraversal(root.branch1));
                    output.append(treeTraversal(root.branch2));
                }
                case ('*') -> {
                    output.append('*');
                    output.append(treeTraversal(root.branch1));
                    output.append(treeTraversal(root.branch2));

                }
                case ('/') -> {
                    output.append('/');
                    output.append(treeTraversal(root.branch1));
                    output.append(treeTraversal(root.branch2));

                }
                case ('^') -> {
                    output.append('^');
                    output.append(treeTraversal(root.branch1));
                    output.append(treeTraversal(root.branch2));
                }
            }
        }

        return output;
    }

    public static void calculatePoland(StringBuilder input) {
        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' ||
                    input.charAt(i) == '/' || input.charAt(i) == '^') {
                input.replace(i, input.length() - 1, calculateInputSt(input.substring(i + 1),
                        input.charAt(i)).toString());
                System.out.println(input);

            }
        }
    }

    public static StringBuilder calculateInputSt(String input, char act) {
        StringBuilder output = new StringBuilder();
        String[] numbers = input.split(" ");

        switch (act) {
            case ('+') -> output.append(Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]));
            case ('-') -> output.append(Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]));
            case ('*') -> output.append(Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]));
            case ('/') -> output.append(Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]));
            case ('^') -> output.append((int) Math.pow(Double.parseDouble(numbers[0]), Double.parseDouble(numbers[1])));
        }
        if (numbers.length > 2) {
            output.append(" ");
            for (int i = 2; i < numbers.length; i++) {
                output.append(numbers[i]);
            }
        }
        return output;
    }

}
