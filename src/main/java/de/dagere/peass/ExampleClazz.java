package de.dagere.peass;

import kieker.monitoring.core.controller.MonitoringController;
import kieker.monitoring.core.registry.ControlFlowRegistry;
import kieker.monitoring.core.registry.SessionRegistry;
import de.dagere.kopeme.kieker.record.DurationRecord;

public class ExampleClazz {

    private static final kieker.monitoring.core.controller.IMonitoringController _kieker_sourceInstrumentation_controller = kieker.monitoring.core.controller.MonitoringController.getInstance();

    private static final kieker.monitoring.timer.ITimeSource _kieker_sourceInstrumentation_TIME_SOURCE = _kieker_sourceInstrumentation_controller.getTimeSource();

    protected void calleeMethod() {
        if (!ExampleClazz._kieker_sourceInstrumentation_controller.isMonitoringEnabled()) {
            new Callee().method1();
            return;
        }
        final String _kieker_sourceInstrumentation_signature = "protected void de.dagere.peass.ExampleClazz.calleeMethod()";;
              final long _kieker_sourceInstrumentation_tin =_kieker_sourceInstrumentation_TIME_SOURCE.getTime();
;
        try {
            new Callee().method1();
            return;
        } finally {
            // measure after
final long _kieker_sourceInstrumentation_tout = _kieker_sourceInstrumentation_TIME_SOURCE.getTime();
_kieker_sourceInstrumentation_controller.newMonitoringRecord(new DurationRecord(_kieker_sourceInstrumentation_signature, _kieker_sourceInstrumentation_tin, _kieker_sourceInstrumentation_tout));
        }
    }

    public ExampleClazz() {
        if (!ExampleClazz._kieker_sourceInstrumentation_controller.isMonitoringEnabled()) {
        }
        final String _kieker_sourceInstrumentation_signature = "public new de.dagere.peass.ExampleClazz.<init>()";;
              final long _kieker_sourceInstrumentation_tin =ExampleClazz._kieker_sourceInstrumentation_TIME_SOURCE.getTime();
;
        // measure after
final long _kieker_sourceInstrumentation_tout = ExampleClazz._kieker_sourceInstrumentation_TIME_SOURCE.getTime();
ExampleClazz._kieker_sourceInstrumentation_controller.newMonitoringRecord(new DurationRecord(_kieker_sourceInstrumentation_signature, _kieker_sourceInstrumentation_tin, _kieker_sourceInstrumentation_tout));
    }
}
