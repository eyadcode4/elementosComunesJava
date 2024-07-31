package eyad.dev;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class CommonElementTest {

    @Test
    public void testFindCommonElements() {
        CommonElement commonElement = new CommonElement();

        ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(3, 4, 5, 6));

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 4));
        ArrayList<Integer> result = commonElement.findCommonElements(listA, listB);
        assertEquals(expected, result);
    }
}
