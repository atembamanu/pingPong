import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class PingPongTest {

    @Test
    public void runPingPong_countUpToOne_ArrayList(){
        PingPong pingPong = new PingPong();
        List<Object> expectedValue = new ArrayList<>();
        expectedValue.add(1);

        assertEquals(expectedValue, pingPong.runPingPong(1));
    }

    @Test
    public void runPingPong_countUpToGivenNumber_ArrayList() {
        PingPong pingPong = new PingPong();
        List<Object> expectedValue = new ArrayList<>();
        expectedValue.add(1);
        expectedValue.add(2);
        assertEquals(expectedValue, pingPong.runPingPong(2));
    }

    @Test
    public void runPingPong_replaceMultiplesOf3_ArrayList() {
        PingPong pingPong = new PingPong();
        List<Object> expectedValue = new ArrayList<>();
        expectedValue.add(1);
        expectedValue.add(2);
        expectedValue.add("ping");
        assertEquals(expectedValue, pingPong.runPingPong(3));
    }

    @Test
    public void runPingPong_replaceMultipleOf5_ArrayList() {
        PingPong pingPong = new PingPong();
        List<Object>  expectedValue = new ArrayList<>();
        expectedValue.add(1);
        expectedValue.add(2);
        expectedValue.add("ping");
        expectedValue.add(4);
        expectedValue.add("pong");

        assertEquals(expectedValue, pingPong.runPingPong(5));

    }
    @Test
    public void runPingPong_replaceMultiplesOfBoth3And5_ArrayList() {
        PingPong pingPong = new PingPong();
        ArrayList<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        expectedOutput.add(2);
        expectedOutput.add("ping");
        expectedOutput.add(4);
        expectedOutput.add("pong");
        expectedOutput.add("ping");
        expectedOutput.add(7);
        expectedOutput.add(8);
        expectedOutput.add("ping");
        expectedOutput.add("pong");
        expectedOutput.add(11);
        expectedOutput.add("ping");
        expectedOutput.add(13);
        expectedOutput.add(14);
        expectedOutput.add("pingpong");
        assertEquals(expectedOutput, pingPong.runPingPong(15));
    }
}