package com.xujz

import spock.lang.Specification

class SubtracterTest extends Specification {
    def "Subtract"() {
        given:
        def subtracter = new Subtracter()

        expect:
        c == subtracter.subtract(a, b)

        where:
        a | b || c
        3 | 2  | 1
        5 | 3  | 2
    }
}
