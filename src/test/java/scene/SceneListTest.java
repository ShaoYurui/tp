package scene;

import org.junit.jupiter.api.Test;
import storage.GameDataFileDecoder;
import storage.GameDataFileManager;
import ui.Ui;

import java.io.FileNotFoundException;

public class SceneListTest {

    @Test
    public void scenesTest() throws FileNotFoundException {
        Ui ui = new Ui();
        GameDataFileDecoder datafile = new GameDataFileDecoder(ui,new GameDataFileManager("GameData.txt"));
<<<<<<< HEAD
        datafile.setCurrentSceneIndex(0);
        SceneList sceneList = SceneListBuilder.buildSceneList(ui,datafile);
=======
        datafile.setFile(0);
        SceneList sceneList = SceneListBuilder.buildSceneList(datafile);
>>>>>>> cc98a81c041efe0e8df351a01c50dd3041083b88
        Scene currentScene = sceneList.getCurrentScene();
        currentScene.runScene();

        sceneList.updateSceneNumber();
        currentScene = sceneList.getCurrentScene();

        System.out.println(currentScene.getSuspectList().getSuspectAvailableClues("Father"));
        System.out.println(currentScene.getSuspectList().toString());
        System.out.println(currentScene.getSuspectList().getAllClues());

        currentScene.getSuspectList().setClueChecked("Father",
                sceneList.getCurrentScene().getSuspectList().getAllAvailableClues().get(0));
        System.out.println(currentScene.getSuspectList().getAllAvailableClues());

        System.out.println("------------------------------------------");
        currentScene.runScene();
    }

    @Test
    public void scene2Test() throws FileNotFoundException {
        Ui ui = new Ui();
        GameDataFileDecoder datafile = new GameDataFileDecoder(ui,new GameDataFileManager("GameData.txt"));
<<<<<<< HEAD
        datafile.setCurrentSceneIndex(0);
        SceneList sceneList = SceneListBuilder.buildSceneList(ui,datafile);
=======
        datafile.setFile(0);
        SceneList sceneList = SceneListBuilder.buildSceneList(datafile);
>>>>>>> cc98a81c041efe0e8df351a01c50dd3041083b88

        Scene currentScene = sceneList.getCurrentScene();
        currentScene.runScene();

        currentScene = sceneList.getCurrentScene();
        System.out.println("------------------------------------------");
        currentScene.runScene();

        currentScene = sceneList.getCurrentScene();
        System.out.println("------------------------------------------");
        currentScene.runScene();
    }
}
