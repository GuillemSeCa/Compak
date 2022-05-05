package intermediateCode;

import entities.Token;
import entities.TokenDataPair;
import syntax.AbstractSyntaxTree;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class IntermediateCodeGenerator {

    private IntermediateCodeData intermediateCodeData;

    public IntermediateCodeGenerator() {
        this.intermediateCodeData = new IntermediateCodeData();
    }

    public void process(AbstractSyntaxTree abstractSyntaxTree, File out) throws IOException {
        abstractSyntaxTree.travelWithPriorityDepth(intermediateCodeData);
        // intermediateCodeData.printData();
        intermediateCodeData.generateIntermediateCodeFile(out);
    }
}
