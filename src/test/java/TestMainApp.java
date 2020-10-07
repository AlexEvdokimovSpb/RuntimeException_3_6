import org.junit.Assert;
import org.junit.Test;

public class TestMainApp {
    MainApp mainapp;

    int[] arr = {1, 2, 4, 4, 2, 3, 4, 1, 7};
    int[] arrTest = { 1, 7};
    int[] arr1 = {4, 2, 0, 2, 3, 1, 7, 9};
    int[] arr1Test = {2, 0, 2, 3, 1, 7, 9};
    int[] arr2 = {1, 2, 1, 7};

    int[] arr3 = {1, 1, 1, 4, 4, 1, 4, 4};
    int[] arr4 = {1, 1, 1, 1, 1, 1};
    int[] arr5 = { 4, 4, 4, 4};
    int[] arr6 = { 1, 4, 4, 1, 1, 4, 3};

    @Test
    public void testTakeAfterFour() {
        Assert.assertArrayEquals(arrTest, mainapp.takeAfterFour(arr));
    }

    @Test
    public void testTakeAfterFour2() {
        Assert.assertArrayEquals(arr1Test, mainapp.takeAfterFour(arr1));
    }

    @Test (expected = RuntimeException.class)
    public void testTakeAfterFour3() {
        mainapp.takeAfterFour(arr2);
    }

    @Test
    public void testAreFourAndOne () {
        Assert.assertTrue(mainapp.areFourAndOne (arr3));
    }

    @Test
    public void testAreFourAndOne2 () {
        Assert.assertFalse(mainapp.areFourAndOne (arr4));
    }

    @Test
    public void testAreFourAndOne3 () {
        Assert.assertFalse(mainapp.areFourAndOne (arr5));
    }

    @Test
    public void testAreFourAndOne4 () {
        Assert.assertFalse(mainapp.areFourAndOne (arr6));
    }

}
