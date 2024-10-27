import es.urjc.grafo.ABII.Algorithms.Algorithm;
import es.urjc.grafo.ABII.Algorithms.Algorithm2;
import org.junit.jupiter.api.Test;


public class Algorithm2Test {

    Algorithm algorithm = new Algorithm2();

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