package working_projects.GhostHunting;

import java.awt.*;

public class MouseSearcher {

    private PointerInfo pointerInfo;
    private Point point;

    //Looking for mouse coordinates
    public int CoordinatesOfTheMouseX() {
        while (true) {
            pointerInfo = MouseInfo.getPointerInfo();
            point = pointerInfo.getLocation();
            int x = (int) point.getX();
            //return , returns the value of x to the int that is set as return type
            //this return gets the value and put it in "public INT CoordinatesOfTheMouseX" and now this value can be used
            return x;
        }

    }
    public int CoordinatesOfTheMouseY() {
        while (true) {
            pointerInfo = MouseInfo.getPointerInfo();
            point = pointerInfo.getLocation();
            int y = (int) point.getY();
            return y;
        }

    }

    public int NumberX(int x) {
        //for parameters, we need an int (number)
        while (true) {
            //after that we continue to refresh the value and return it to the user
            return x;
        }
    }

    public int NumberY(int y) {
        while (true) {
            return y;
        }
    }
}


