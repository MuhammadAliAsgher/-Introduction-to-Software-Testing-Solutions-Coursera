import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class DemoTest {

    @Test
public void testIsTriangle_BoundaryConditions() {
    // Boundary conditions where sides exactly equal the sum of two others
    assertFalse(Demo.isTriangle(1, 2, 3));  // a + b = c
    assertFalse(Demo.isTriangle(3, 1, 2));  // a + c = b
    assertFalse(Demo.isTriangle(2, 3, 1));  // b + c = a
}

@Test
public void testIsTriangle_NegativeOrZeroSides() {
    // Negative and zero-length sides
    assertFalse(Demo.isTriangle(-1, 2, 3));
    assertFalse(Demo.isTriangle(0, 4, 5));
    assertFalse(Demo.isTriangle(0, 0, 0));
}

@Test
public void testIsTriangle_ExtremeDifferences() {
    // Extreme differences between side lengths
    assertFalse(Demo.isTriangle(1, 1, 1000));
    assertFalse(Demo.isTriangle(1000, 1, 1));
    assertFalse(Demo.isTriangle(1, 1000, 1));
}

@Test
public void testIsTriangle_FloatingPointPrecision() {
    // Floating-point precision issues
    assertTrue(Demo.isTriangle(0.1, 0.1, 0.1));
    assertFalse(Demo.isTriangle(0.1, 0.1, 0.3));
}


    // Test the isTriangle method
    @Test
    public void testIsTriangle_ValidTriangles() {
        assertTrue(Demo.isTriangle(3, 4, 5));
        assertTrue(Demo.isTriangle(5, 5, 5));
        assertTrue(Demo.isTriangle(6, 8, 10));
    }

    @Test
    public void testIsTriangle_InvalidTriangles() {
        assertFalse(Demo.isTriangle(1, 2, 3));
        assertFalse(Demo.isTriangle(0, 4, 5));
        assertFalse(Demo.isTriangle(-1, 2, 2));
    }

    @Test
    public void testIsTriangle_EdgeCases() {
        assertFalse(Demo.isTriangle(Double.MAX_VALUE, 1, 1));
        assertTrue(Demo.isTriangle(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE));
    }

    // Test the main method
    @Test
    public void testMain_ValidInput() {
        String input = "3\n4\n5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Demo.main(new String[]{});

        String output = out.toString();
        assertTrue(output.contains("This is a triangle."));
    }

    @Test
    public void testMain_InvalidInput() {
        String input = "1\n2\n3\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Demo.main(new String[]{});

        String output = out.toString();
        assertTrue(output.contains("This is not a triangle."));
    }
}
