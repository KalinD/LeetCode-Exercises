import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplifyPathTest {
    SimplifyPath obj = new SimplifyPath();

    @Test
    void simplifyPath() {
        assertEquals("/home", obj.simplifyPath("/home/"));
        assertEquals("/", obj.simplifyPath("/../"));
        assertEquals("/home/foo", obj.simplifyPath("/home//foo/"));
        assertEquals("/c", obj.simplifyPath("/a/./b/../../c/"));
    }
}