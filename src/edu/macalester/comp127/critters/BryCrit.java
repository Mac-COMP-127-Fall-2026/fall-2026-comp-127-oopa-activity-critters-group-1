package edu.macalester.comp127.critters;

import edu.macalester.graphics.Image;
import edu.macalester.graphics.Rectangle;

import java.awt.Color;

public class BryCrit extends Critter {
    private static final Color strokeColor = new Color(0, 0, 0);
    private static final Color fillColor = strokeColor;

    @Override
    protected void buildGraphics() {

        Rectangle leftLeg = new Rectangle(40, 125, 12.5, 40);
        leftLeg.setStrokeColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 4));

        Rectangle rightLeg = new Rectangle(60, 125, 12.5, 40);
        rightLeg.setStrokeColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 4));

        Image vin = new Image(0, 0, "BryantBB-vin.png");
        getGraphics().add(vin);

    }
}
