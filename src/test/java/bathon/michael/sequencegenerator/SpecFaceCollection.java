package bathon.michael.sequencegenerator;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/8/16.
 */
public class SpecFaceCollection {

    FaceCollection testEmo;

    @Before
    public void setUp(){

        testEmo = new FaceCollection();
        testEmo.setEmoji();


    }

    @Test
    public void testGetEmoji(){

        String expected = "(∩｀-´)⊃━☆ﾟ.*･｡ﾟ";

        String actual = testEmo.getEmoji(1);

        assertEquals("Fails if the emoji retrieved doesn't match the expected", expected, actual);

    }



}
