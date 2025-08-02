import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Assertions.assertEquals;
class TestCase02 {
    @Test
    @Tags("firstPriority")
    void testMethod01() {

    }
    
    @Test
    @Tag("firstPriority")
    void runTestcase02() {

    } 
    @Tags("fastTag")
    void testMethod03() {

    }
    
    @Test
    @Tag("slowTag")
    void runTestcase04() {

    }    
}
