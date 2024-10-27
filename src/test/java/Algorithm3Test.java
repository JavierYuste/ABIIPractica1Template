import es.urjc.grafo.ABII.Algorithms.Algorithm;
import es.urjc.grafo.ABII.Algorithms.Algorithm3;
import org.junit.jupiter.api.Test;


public class Algorithm3Test {

    Algorithm algorithm = new Algorithm3();

    @Test
    public void testInstance1() {
        AlgorithmGeneralTest.generalTest(
                "src/main/resources/instances/instance1.txt",
                algorithm,
                60,
                0.0);
    }

    @Test
    public void testInstance2() {
        AlgorithmGeneralTest.generalTest(
                "src/main/resources/instances/instance1.txt",
                algorithm,
                60,
                0.0);
    }
}
