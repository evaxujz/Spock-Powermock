package com.xujz

import org.junit.runner.RunWith
import org.mockito.Mockito
import org.powermock.api.mockito.PowerMockito
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner
import org.powermock.modules.junit4.PowerMockRunnerDelegate
import org.spockframework.runtime.Sputnik
import spock.lang.Specification

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(Sputnik.class)
@PrepareForTest([Timer.class])
class TimerTest extends Specification {
    def "CurrentTimeSeconds"() {
        given:
        PowerMockito.mockStatic(Timer.class)
        Mockito.when(Timer.currentTimeSeconds()).thenReturn(1000L)

        expect:
        1000L == Timer.currentTimeSeconds()
    }

    def "TransferToSeconds"() {
    }
}
