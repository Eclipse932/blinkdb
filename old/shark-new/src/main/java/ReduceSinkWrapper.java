package shark.operators;

import org.apache.hadoop.hive.ql.exec.ReduceSinkOperator;
import org.apache.hadoop.hive.ql.exec.ExprNodeEvaluator;
import java.util.List;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector;
import org.apache.hadoop.hive.ql.metadata.HiveException;

// This class is used because we cannot call protected static methods from scala
public class ReduceSinkWrapper extends ReduceSinkOperator {
    public static StructObjectInspector initEvaluatorsAndReturnStruct(
        ExprNodeEvaluator[] evals, List<List<Integer>> distinctColIndices,
        List<String> outputColNames,
	int length, ObjectInspector rowInspector) 
        throws HiveException {

	return ReduceSinkOperator.initEvaluatorsAndReturnStruct(
	    evals,
	    distinctColIndices,
	    outputColNames,
	    length,
	    rowInspector);
    }
}