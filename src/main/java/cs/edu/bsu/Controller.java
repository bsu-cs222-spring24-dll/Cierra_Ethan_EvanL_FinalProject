package cs.edu.bsu;

import java.io.IOException;

public class Controller
{
    public void runTravelGuide() throws IOException {
        TravelGuide console = new TravelGuide();
        String output=console.stateSearcher();

        console.parkSearcher(output);

        InputLogic logic = new InputLogic();
        String search=logic.noStateExists();
        logic.enterDifferentState(search);

    }
}
