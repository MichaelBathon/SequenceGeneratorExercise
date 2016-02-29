package bathon.michael.sequencegenerator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by michaelbathon on 2/8/16.
 */
public class FaceCollection {

    ArrayList<String> emojis;


    private void emojiCreator(){
        emojis = new ArrayList<String>(Arrays.asList("ಠ_ರೃ", "(∩｀-´)⊃━☆ﾟ.*･｡ﾟ", "( ˇ෴ˇ )", "ʕ•̫͡•ʕ•̫͡•ʔ•̫͡•ʔ", "(⊙.☉)7",
                "(=ↀωↀ=)", "(^._.^)ﾉ", "༼⍨༽", "ʕ•ᴥ•ʔ", "(҂`з´).っ︻デ═一", "ఠ_ఠ", "(ノ°ο°)ノ", "(ᗒᗣᗕ)՞o==}::::::::::::>", "(ᴗ˳ᴗ)",
                "ᓬᗸᗳ[▓▓]ꍞ", "()(◍.◍)()", "凸(｀0´)凸", "(･｀ｪ´･)つ", "(╯°□°）╯︵ ┻━┻", "凸(⊙▂⊙✖ )", "┌П┐(►˛◄’!)", "ヽ(≧Д≦)ノ", "Σ(▼□▼メ)",
                "凸(｀⌒´メ)凸", "(ꈨຶꎁꈨຶ)۶”", "<(_ _)>", "(✪㉨✪)", "(ó㉨ò)", "(￣(ｴ)￣)", "(^(I)^)"));




    }

    public void setEmoji(){
        emojiCreator();
    }

    public String getEmoji(int index){
        return emojis.get(index);
    }




}
