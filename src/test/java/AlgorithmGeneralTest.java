import es.urjc.grafo.ABII.Algorithms.Algorithm;
import es.urjc.grafo.ABII.Model.Evaluator;
import es.urjc.grafo.ABII.Model.Instance;
import es.urjc.grafo.ABII.Model.Solution;
import org.junit.jupiter.api.Assertions;

import java.time.Duration;
import java.time.Instant;

public class AlgorithmGeneralTest {
    public static void generalTest(String instancePath, Algorithm algorithm, int maxTime, double expectedQuality) {
        try {
            Instance instance = new Instance(instancePath);
            Instant instant = Instant.now();
            Solution solution = algorithm.run(instance);
            Duration elapsedTime = Duration.between(instant, Instant.now());
            Assertions.assertTrue(Evaluator.isFeasible(solution, instance), "La solución no es factible");
            Assertions.assertTrue(elapsedTime.getSeconds() < maxTime, "El algoritmo ha tardado más de un minuto");
            double score = Evaluator.evaluate(solution, instance);
            Assertions.assertTrue(score >= expectedQuality, "La calidad de la solución no es suficiente");
        }
        catch (UnsupportedOperationException e) {
            Assertions.fail(algorithm.toString() + " no está implementado");
        }
    }
}
