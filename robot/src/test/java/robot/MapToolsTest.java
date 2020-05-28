package robot;

import com.sun.deploy.security.WIExplorerMyKeyStore;
import org.junit.Test;

import static org.junit.Assert.*;

public class MapToolsTest {

//    Direction direction=new Direction (WEST);
    Coordinates coorddep=new Coordinates (0,0);
    Coordinates coordatt=new Coordinates (-1,0);


    private boolean compareCoordonnees (Coordinates coord1, Coordinates coord2) {
        if (coord1.getX() == coord2.getX() &&
            coord1.getY() == coord2.getY() )
            return true;
            else return false;
    }

    @Test
    public void nextForwardPosition() {
                assertTrue(compareCoordonnees(MapTools.nextForwardPosition(coorddep, Direction.WEST),coordatt));
    }

    @Test
    public void nextBackwardPosition() {
    }

    @Test
    public void counterclockwise() {
    }

    @Test
    public void clockwise() {
    }
}