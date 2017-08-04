package sample.media;

import javax.sound.sampled.*;
import java.io.*;

public class OpenFiles {
    private String code;
    public String getCode() {
        return code;
    }


        //method to read text File and output PrivateUserCode like a String
    public String openTextFile(File file){
        try(
                BufferedReader br = new BufferedReader(new FileReader(file))
                ){
            br.readLine();
            code = br.readLine();
            System.out.println(code);

        } catch (FileNotFoundException e) {
            System.err.println("Cant find text file !!!");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Input Output error !!!!");
            e.printStackTrace();
        }
        return code;
    }

    public void openMp3File(File file){
        try (
                AudioInputStream input = AudioSystem.getAudioInputStream(file)
                ){
            Clip clip = AudioSystem.getClip();
            clip.open(input);
            clip.start();
        } catch (UnsupportedAudioFileException e) {
            System.err.println("Wrong music file FORMAT!!!");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("File dosent existed ");
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            System.err.println("Wrong music file PATH !!");
            e.printStackTrace();
        }
    }
}
