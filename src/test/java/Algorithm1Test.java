import es.urjc.grafo.ABII.Algorithms.Algorithm;
import es.urjc.grafo.ABII.Algorithms.Algorithm1;
import org.junit.jupiter.api.Test;


public class Algorithm1Test {

    Algorithm algorithm = new Algorithm1();

    @Test
    public void testInstance1() {
        AlgorithmGeneralTest.generalTest(
                "src/main/resources/instances/ejemplo_1_n10_m2.txt",
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
