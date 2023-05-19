package codeGenerator;

import scanner.token.Token;

public class CodeGeneratorFacade {
    public static CodeGenerator cg = new CodeGenerator();

    public static void semanticFunction(int semanticAction, Token lookAhead) {
        cg.semanticFunction(semanticAction, lookAhead);
    }

    public static void printMemory() {
        cg.printMemory();
    }
}
