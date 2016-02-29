package bathon.michael.sequencegenerator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/8/16.
 */
public class SpecSequenceGenerator {

    SequenceGenerator testGen;

    @Before
    public void setUp(){

        testGen = new SequenceGenerator();


    }

   /* @Test
    public void testCount(){

        int expected = 26;
        String actual = testGen.createSequence(26);

        assertEquals("Fails if the method doesn't print out the expected result", expected, actual);

    }

    @Test
    public void testLetters(){

        String x = testGen.generateLetterSequence(26);

        assertEquals("Fails if it doesn't return the string of letters A-Z", "A", x);

    }

    @Test
    public void testOddNumbers(){

        int expected = 26;

        String x = testGen.generateOddNumbersSequence(26);

        assertEquals("Fails if it doesn't return only the odds", expected, x);

    } */

    @Test
    public void testCreateSequence(){
        String expected = "a b c d e f g h i j k l m n o p q r s t u v w x y z ";

        String actual = testGen.createSequence(97, 122, "letters", "letters");

        assertEquals("Fails if the output sequence is not the letters a through z", expected, actual);

    }

    @Test
    public void testCreateSequenceOdd(){
        String expected = "1 3 5 7 9 11 13 15 17 19 21 23 25 ";

        String actual = testGen.createSequence(1, 26, "odd", "numbers");

        assertEquals("Fails if the generated sequence is not all odd numbers", expected, actual);
    }

    @Test
    public void testCreateSequenceAll(){
        String expected = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 ";

        String actual = testGen.createSequence(1,26, "all", "numbers");

        assertEquals("Fails if it doesn't print out the full sequence of numbers", expected, actual);

    }

    @Test
    public void testEmojiSequenceAll(){
        String expected = "ಠ_ರೃ (∩｀-´)⊃━☆ﾟ.*･｡ﾟ ( ˇ෴ˇ ) ʕ•̫͡•ʕ•̫͡•ʔ•̫͡•ʔ (⊙.☉)7 (=ↀωↀ=) (^._.^)ﾉ ༼⍨༽ ʕ•ᴥ•ʔ (҂`з´).っ︻デ═一 ఠ_ఠ (ノ°ο°)ノ (ᗒᗣᗕ)՞o==}::::::::::::> (ᴗ˳ᴗ) ᓬᗸᗳ[▓▓]ꍞ ()(◍.◍)() 凸(｀0´)凸 (･｀ｪ´･)つ (╯°□°）╯︵ ┻━┻ 凸(⊙▂⊙✖ ) ┌П┐(►˛◄’!) ヽ(≧Д≦)ノ Σ(▼□▼メ) 凸(｀⌒´メ)凸 (ꈨຶꎁꈨຶ)۶” <(_ _)> (✪㉨✪) (ó㉨ò) (￣(ｴ)￣) (^(I)^) ";

        String actual = testGen.createSequence(0, 30, "all", "emoji");

        assertEquals("Fails if it doesn't print out the ArrayList of Emojis", expected, actual);

    }

    @Test
    public void testOddEmojiSequence(){

        String expected = "(∩｀-´)⊃━☆ﾟ.*･｡ﾟ ʕ•̫͡•ʕ•̫͡•ʔ•̫͡•ʔ (=ↀωↀ=) ༼⍨༽ (҂`з´).っ︻デ═一 (ノ°ο°)ノ (ᴗ˳ᴗ) ()(◍.◍)() (･｀ｪ´･)つ 凸(⊙▂⊙✖ ) ヽ(≧Д≦)ノ 凸(｀⌒´メ)凸 <(_ _)> (ó㉨ò) (^(I)^) ";

        String actual = testGen.createSequence(0, 30, "odd", "emoji");

        assertEquals("Fails if it doesn't get the odd sequence emojis", expected, actual);


    }



}
