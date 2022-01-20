package de.dagere.peass;

import kieker.monitoring.core.controller.MonitoringController;
import kieker.monitoring.core.registry.ControlFlowRegistry;
import kieker.monitoring.core.registry.SessionRegistry;
import de.dagere.kopeme.kieker.record.DurationRecord;

public class Callee {

    private static final kieker.monitoring.core.controller.IMonitoringController _kieker_sourceInstrumentation_controller = kieker.monitoring.core.controller.MonitoringController.getInstance();

    private static final kieker.monitoring.timer.ITimeSource _kieker_sourceInstrumentation_TIME_SOURCE = _kieker_sourceInstrumentation_controller.getTimeSource();

    protected void method1() {
        if (!Callee._kieker_sourceInstrumentation_controller.isMonitoringEnabled()) {
            innerMethod();
            return;
        }
        final String _kieker_sourceInstrumentation_signature = "protected void de.dagere.peass.Callee.method1()";;
              final long _kieker_sourceInstrumentation_tin =_kieker_sourceInstrumentation_TIME_SOURCE.getTime();
;
        try {
            innerMethod();
            return;
        } finally {
            // measure after
final long _kieker_sourceInstrumentation_tout = _kieker_sourceInstrumentation_TIME_SOURCE.getTime();
_kieker_sourceInstrumentation_controller.newMonitoringRecord(new DurationRecord(_kieker_sourceInstrumentation_signature, _kieker_sourceInstrumentation_tin, _kieker_sourceInstrumentation_tout));
        }
    }

    private void innerMethod() {
        if (!Callee._kieker_sourceInstrumentation_controller.isMonitoringEnabled()) {
            try {
                Thread.sleep(20);
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
            return;
        }
        final String _kieker_sourceInstrumentation_signature = "private void de.dagere.peass.Callee.innerMethod()";;
              final long _kieker_sourceInstrumentation_tin =_kieker_sourceInstrumentation_TIME_SOURCE.getTime();
;
        try {
            try {
                Thread.sleep(20);
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
            return;
        } finally {
            // measure after
final long _kieker_sourceInstrumentation_tout = _kieker_sourceInstrumentation_TIME_SOURCE.getTime();
_kieker_sourceInstrumentation_controller.newMonitoringRecord(new DurationRecord(_kieker_sourceInstrumentation_signature, _kieker_sourceInstrumentation_tin, _kieker_sourceInstrumentation_tout));
        }
    }

    protected void method2() {
        // This change should not be detected by PeASS since it is not covered by a test
        System.out.println("This has changed");
    }

    public Callee() {
        if (!Callee._kieker_sourceInstrumentation_controller.isMonitoringEnabled()) {
        }
        final String _kieker_sourceInstrumentation_signature = "public new de.dagere.peass.Callee.<init>()";;
              final long _kieker_sourceInstrumentation_tin =Callee._kieker_sourceInstrumentation_TIME_SOURCE.getTime();
;
        // measure after
final long _kieker_sourceInstrumentation_tout = Callee._kieker_sourceInstrumentation_TIME_SOURCE.getTime();
Callee._kieker_sourceInstrumentation_controller.newMonitoringRecord(new DurationRecord(_kieker_sourceInstrumentation_signature, _kieker_sourceInstrumentation_tin, _kieker_sourceInstrumentation_tout));
    }
}
