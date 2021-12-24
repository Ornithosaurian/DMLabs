package service;

public class ReversalTreeTraversal {

    public static StringBuilder reversalTreeTraversal(TreePart root) {
        StringBuilder output = new StringBuilder();

        if (root.actRoot == ' ') {
            output.append(root.root);
            output.append(' ');
        } else {
            switch (root.actRoot) {
                case ('+') -> {
                    output.append(reversalTreeTraversal(root.branch1));
                    output.append(reversalTreeTraversal(root.branch2));
                    output.append('+');
                }
                case ('-') -> {
                    output.append(reversalTreeTraversal(root.branch1));
                    output.append(reversalTreeTraversal(root.branch2));
                    output.append('-');
                }
                case ('*') -> {
                    output.append(reversalTreeTraversal(root.branch1));
                    output.append(reversalTreeTraversal(root.branch2));
                    output.append('*');

                }
                case ('/') -> {
                    output.append(reversalTreeTraversal(root.branch1));
                    output.append(reversalTreeTraversal(root.branch2));
                    output.append('/');

                }
                case ('^') -> {
                    output.append(reversalTreeTraversal(root.branch1));
                    output.append(reversalTreeTraversal(root.branch2));
                    output.append('^');
                }
            }
        }

        return output;
    }

    public static void calculateReversePoland(StringBuilder input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' ||
                    input.charAt(i) == '/' || input.charAt(i) == '^') {

                input.replace(0, i + 1, calculateInputStRev(input.substring(0, i - 1),
                        input.charAt(i)).toString());
                System.out.println(input);
            }
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' ||
                    input.charAt(i) == '/' || input.charAt(i) == '^') {

                input.replace(0, i + 1, calculateInputStRev(input.substring(0, i - 1),
                        input.charAt(i)).toString());
                System.out.println(input);
            }
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' ||
                    input.charAt(i) == '/' || input.charAt(i) == '^') {

                input.replace(0, i + 1, calculateInputStRev(input.substring(0, i - 1),
                        input.charAt(i)).toString());
                System.out.println(input);
            }
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' ||
                    input.charAt(i) == '/' || input.charAt(i) == '^') {

                input.replace(0, i + 1, calculateInputStRev(input.substring(0, i - 1),
                        input.charAt(i)).toString());
                System.out.println(input);
            }

        }
    }

    public static StringBuilder calculateInputStRev(String input, char act) {
        StringBuilder output = new StringBuilder();
        String[] numbers = input.split(" ");

        if (numbers.length > 2) {
            for (int i = 0; i < numbers.length - 2; i++) {
                output.append(numbers[i]);
                output.append(" ");
            }
        }
        switch (act) {
            case ('+') -> output.append(Integer.parseInt(numbers[numbers.length - 2]) +
                    Integer.parseInt(numbers[numbers.length - 1]));
            case ('-') -> output.append(Integer.parseInt(numbers[numbers.length - 2]) -
                    Integer.parseInt(numbers[numbers.length - 1]));
            case ('*') -> output.append(Integer.parseInt(numbers[numbers.length - 2]) *
                    Integer.parseInt(numbers[numbers.length - 1]));
            case ('/') -> output.append(Integer.parseInt(numbers[numbers.length - 2]) /
                    Integer.parseInt(numbers[numbers.length - 1]));
            case ('^') -> output.append((int) Math.pow(Double.parseDouble((numbers[numbers.length - 2])),
                    Double.parseDouble(numbers[numbers.length - 1])));
        }
        output.append(" ");
        return output;
    }

}
