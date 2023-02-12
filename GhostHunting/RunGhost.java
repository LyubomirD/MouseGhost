package working_projects.GhostHunting;

import javax.swing.*;
public class RunGhost {

    public static void main(String[] args) throws InterruptedException {
        //initialisation (Creating objects)
        JWindowDimensions windowDimensions = new JWindowDimensions(new JWindow());
        MouseSearcher mouseSearcher = new MouseSearcher();

        //Objects and their functions
        windowDimensions.WindowCreation();
        while (true) {
            int numberX = mouseSearcher.NumberX(mouseSearcher.CoordinatesOfTheMouseX());
            int numberY = mouseSearcher.NumberY(mouseSearcher.CoordinatesOfTheMouseY());

            System.out.println("x:"+numberX + " " + "y:"+numberY);
            windowDimensions.window.setLocation(numberX - 50, numberY - 50);
            Thread.sleep(35);
        }

    }

}