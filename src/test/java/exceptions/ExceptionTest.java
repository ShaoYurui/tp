package exceptions;

import static org.junit.jupiter.api.Assertions.assertThrows;

import clue.CheckedClueTrackerBuilder;
import investigation.Investigation;
import org.junit.jupiter.api.Test;
import parser.Parser;
import scene.SceneList;
import scene.SceneListBuilder;
import storage.GameDataFileDecoder;
import storage.GameDataFileManager;
import suspect.SuspectList;
import ui.Ui;

public class ExceptionTest {
    private static final Ui ui = new Ui();
    private static final String GAME_DATA_FILE_NAME = "GameData.txt";
    private static final GameDataFileDecoder dataFile =
            new GameDataFileDecoder(ui, new GameDataFileManager(GAME_DATA_FILE_NAME));

//    @Test
//    public void throwInvalidSuspectExceptionTest() {
//
//        try {
//            SceneList sceneList = SceneListBuilder.buildSceneList(ui, dataFile);
//            SuspectList clueTracker = CheckedClueTrackerBuilder.buildClueTracker();
//
//            Investigation investigation = new Investigation(clueTracker);
//            assertThrows(InvalidSuspectException.class, () -> investigation.investigateScene(0, sceneList));
//
//        } catch (MissingSceneFileException e) {
//            ui.printMissingSceneFileMessage();
//        }
//
//    }

    //@Test
    //public void throwInvalidClueExceptionTest() {
    //    Ui ui = new Ui();
    //    String GAME_DATA_FILE_NAME = "GameData.txt";
    //    GameDataFileDecoder dataFile =
    //            new GameDataFileDecoder(ui, new GameDataFileManager(GAME_DATA_FILE_NAME));
    //    try {
    //        SceneList sceneList = SceneListBuilder.buildSceneList(ui, dataFile);
    //        SuspectList clueTracker = CheckedClueTrackerBuilder.buildClueTracker();
    //
    //        Investigation investigation = new Investigation(sceneList, clueTracker);
    //        investigation.restartGame();
    //        assertThrows(InvalidSuspectException.class, () -> investigation.investigateScene(10));
    //    } catch (MissingSceneFileException e) {
    //        ui.printMissingSceneFileMessage();
    //    }
    //}
}
