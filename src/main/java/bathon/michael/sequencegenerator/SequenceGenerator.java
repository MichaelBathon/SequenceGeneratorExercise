package bathon.michael.sequencegenerator;

import java.util.ArrayList;

/**
 * Created by michaelbathon on 2/8/16.
 */
public class SequenceGenerator {

    boolean isOddNumber = false;

    boolean isLetters = false;

    boolean isEmoji = false;


    public String createSequence(int startRange, int endRange, String request, String NumLettersOrEmoji){

        if(request.equals("odd")){
            isOddNumber = true;
        }

        if(request.equals("letters")){
            isLetters = true;
        }

        if(NumLettersOrEmoji.equals("emoji")){
            isEmoji = true;
                FaceCollection faces = new FaceCollection();
                faces.setEmoji();
                startRange = 0;
                endRange = faces.emojis.size();

            return iterateSequence(startRange, endRange, faces.emojis);

        }

        return iterateSequence(startRange, endRange);



    }


    private String iterateSequence(int startRange, int endRange) {


        String sequence = "";

        for (int i = startRange; i <= endRange; i++) {

            if (isLetters) {
                sequence += ((char) (i)) + " ";
            } else {
                if (!isOddNumber) {
                        sequence += i + " ";
                } else {
                    if (i % 2 == 1)
                        sequence += i + " ";
                }
            }
        }


        return sequence;
    }


    private String iterateSequence(int startRange, int endRange, ArrayList arrayList){


        String sequence = "";

        for (int i = startRange; i < endRange; i++) {

                if (!isOddNumber) {
                    sequence += arrayList.get(i) + " ";
                } else {
                    if (i % 2 == 1)
                        sequence += arrayList.get(i) + " ";
                }
            }

        return sequence;
    }




}
