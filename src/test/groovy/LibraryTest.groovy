/*
 * This Spock specification was auto generated by running 'gradle init --type groovy-library'
 * by 'eric.shamow' at '11/3/15 10:41 AM' with Gradle 2.8
 *
 * @author eric.shamow, @date 11/3/15 10:41 AM
 */

import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        Library lib = new Library()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }
}
