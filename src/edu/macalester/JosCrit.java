package edu.macalester;

import edu.macalester.comp127.critters.Critter;
import edu.macalester.comp127.critters.Leg;
import edu.macalester.graphics.Image;
import edu.macalester.graphics.Rectangle;
import java.awt.Color;

public class JosCrit extends Critter{
    private static final Color strokeColor = new Color(175, 75, 0);
    private static final Color fillColor = strokeColor;

    @Override
    protected void buildGraphics() {

        Rectangle leftLeg = new Rectangle(21, 73.5, 12.5, 25.7);
        leftLeg.setStrokeColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 4));

        Rectangle rightLeg = new Rectangle(35, 73.5, 12.5, 25.7);
        rightLeg.setStrokeColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 4));

        Rectangle leftLeg2 = new Rectangle(61, 73.5, 12.5, 25.7);
        leftLeg2.setStrokeColor(strokeColor);
        leftLeg2.setFilled(true);
        leftLeg2.setFillColor(fillColor);
        addLeg(new Leg(leftLeg2, 4));

        Rectangle rightLeg2 = new Rectangle(75, 73.5, 12.5, 25.7);
        rightLeg2.setStrokeColor(strokeColor);
        rightLeg2.setFilled(true);
        rightLeg2.setFillColor(fillColor);
        addLeg(new Leg(rightLeg2, 4));

        Image squirrel = new Image(0, 0, "Squirrel.png");
        getGraphics().add(squirrel);
    }
}
