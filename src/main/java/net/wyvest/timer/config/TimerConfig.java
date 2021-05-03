package net.wyvest.timer.config;

import club.sk1er.vigilance.Vigilant;
import club.sk1er.vigilance.data.Property;
import club.sk1er.vigilance.data.PropertyType;

import java.awt.*;
import java.io.File;


/**
 * @author Wyvest
 */

public class TimerConfig extends Vigilant {

    @Property(
            type = PropertyType.SWITCH, name = "Toggle Mod",
            description = "Toggle the mod.",
            category = "General"
    )
    public static boolean modToggled;

    @Property(
            type = PropertyType.SWITCH, name = "Render Nothing",
            description = "Render nothing when the timer is off.",
            category = "Render"
    )
    public static boolean renderNothing;

    @Property(
            type = PropertyType.COLOR, name = "Text Color",
            description = "Change the text color for the HUD.",
            category = "Render", subcategory = "Color"
    )
    public static Color color = Color.WHITE;

    @Property(
            type = PropertyType.SWITCH, name = "Turn on Chroma",
            description = "Turn on Chroma. This overrides Text Color.",
            category = "Render", subcategory = "Color"
    )
    public static boolean chroma;

    @Property(
            type = PropertyType.SWITCH, name = "Make Chroma Text One Color",
            description = "Make the Chroma text one color that changes instead of each character being a different color.",
            category = "Render", subcategory = "Color"
    )
    public static boolean oneColorChroma;

    @Property(
            type = PropertyType.SWITCH, name = "Display Background",
            description = "Toggle the background of the HUD.",
            category = "Render"
    )
    public static boolean displayBackground;

    @Property(
            type = PropertyType.SWITCH, name = "Render Shadow",
            description = "Toggle the shadow of text in the timer.",
            category = "Render"
    )
    public static boolean renderShadow;

    @Property(
            type = PropertyType.SWITCH, name = "Show in GUIs",
            description = "Show in GUIs instead of hiding in GUIs.",
            category = "Render"
    )
    public static boolean showinGui;

    @Property(
            type = PropertyType.SWITCH, name = "Reset Timer When Exiting Worlds",
            description = "Reset the timer when a world is exited.",
            category = "General"
    )
    public static boolean resetWhenWorldExit;

    @Property(
            type = PropertyType.SWITCH, name = "Turn on Timer When Entering Worlds",
            description = "Turn on the timer when entering worlds.",
            category = "General"
    )
    public static boolean turnOnTimerWhenWorldEnter;

    @Property(type = PropertyType.NUMBER, name = "x", category = "Render", hidden = true)
    public static int x;

    @Property(type = PropertyType.NUMBER, name = "y", category = "Render", hidden = true)
    public static int y;

    public TimerConfig() {
        super(new File("./config/timerhud.toml"));
        initialize();
    }
}
