package matrix;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;

import static org.junit.Assert.assertThat;

public class MatrixMultiplicationTest {
    double[][] firstMatrix = {
            new double[]{1d, 5d},
            new double[]{2d, 3d},
            new double[]{1d, 7d}
    };

    double[][] secondMatrix = {
            new double[]{1d, 2d, 3d, 7d},
            new double[]{5d, 2d, 8d, 1d}
    };
    double[][] expected = {
            new double[]{26d, 12d, 43d, 12d},
            new double[]{17d, 10d, 30d, 17d},
            new double[]{36d, 16d, 59d, 14d}
    };
    double[][] expectedFake = {
            new double[]{26d, 12d, 43d, 12d},
            new double[]{18d, 10d, 30d, 17d},
            new double[]{36d, 16d, 59d, 14d}
    };
    private MatrixMultiplication matrixMultiplication;
    @Before
    public void setUp(){
        matrixMultiplication = new MatrixMultiplication();
    }
    @Test
    public void MultiplyTwoMatrix_GivesCorrectOutput(){
        double[][] result = matrixMultiplication.multiplyMatrices(firstMatrix,secondMatrix);
        Assert.assertEquals(expected,result);
    }
    @Test
    public void multiplyTwoMatrix_ReturnWrongOutput (){
        double[][] result = matrixMultiplication.multiplyMatrices(firstMatrix,secondMatrix);
        Assert.assertNotEquals(expectedFake,result);
    }
}