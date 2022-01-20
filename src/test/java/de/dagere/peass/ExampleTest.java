package de.dagere.peass;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import kieker.monitoring.core.controller.MonitoringController;
import kieker.monitoring.core.registry.ControlFlowRegistry;
import kieker.monitoring.core.registry.SessionRegistry;
import de.dagere.kopeme.kieker.record.DurationRecord;
import de.dagere.kopeme.annotations.MaximalRelativeStandardDeviation;
import org.junit.rules.TestRule;
import org.junit.Rule;
import de.dagere.kopeme.junit.rule.KoPeMeRule;

public class ExampleTest {

    private static final kieker.monitoring.core.controller.IMonitoringController _kieker_sourceInstrumentation_controller = kieker.monitoring.core.controller.MonitoringController.getInstance();

    private static final kieker.monitoring.timer.ITimeSource _kieker_sourceInstrumentation_TIME_SOURCE = _kieker_sourceInstrumentation_controller.getTimeSource();

    @Test
    @de.dagere.kopeme.annotations.PerformanceTest(iterations = 6, warmup = 0, executeBeforeClassInMeasurement = false, logFullData = true, useKieker = true, timeout = 300000, repetitions = 5, redirectToNull = false, showStart = true, kiekerWaitTime = 5, dataCollectors = "ONLYTIME_NOGC")
    public void test() {
        if (!ExampleTest._kieker_sourceInstrumentation_controller.isMonitoringEnabled()) {
            final ExampleClazz exampleClazz = new ExampleClazz();
            exampleClazz.calleeMethod();
            assertNotNull(exampleClazz);
            return;
        }
        final String _kieker_sourceInstrumentation_signature = "public void de.dagere.peass.ExampleTest.test()";
        ;
        final long _kieker_sourceInstrumentation_tin = _kieker_sourceInstrumentation_TIME_SOURCE.getTime();
        ;
        try {
            final ExampleClazz exampleClazz = new ExampleClazz();
            exampleClazz.calleeMethod();
            assertNotNull(exampleClazz);
            return;
        } finally {
            // measure after
            final long _kieker_sourceInstrumentation_tout = _kieker_sourceInstrumentation_TIME_SOURCE.getTime();
            _kieker_sourceInstrumentation_controller.newMonitoringRecord(new DurationRecord(_kieker_sourceInstrumentation_signature, _kieker_sourceInstrumentation_tin, _kieker_sourceInstrumentation_tout));
        }
    }

    @Rule()
    public TestRule kopemeRule = new KoPeMeRule(this);
}
