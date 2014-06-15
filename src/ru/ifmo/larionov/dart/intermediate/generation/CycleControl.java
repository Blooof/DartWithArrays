package ru.ifmo.larionov.dart.intermediate.generation;

import com.google.common.base.Preconditions;
import org.objectweb.asm.Label;

import java.util.Stack;

/**
 * @author Oleg Larionov
 */
public class CycleControl {
    private Stack<Point> points = new Stack<>();

    public void save(Label a, Label b) {
        points.push(new Point(a, b));
    }

    public Label getBreak() {
        Preconditions.checkArgument(points.size() > 0, "Cannot break out of cycle.");
        return points.peek().breakLabel;
    }

    public Label getContinue() {
        Preconditions.checkArgument(points.size() > 0, "Cannot continue out of cycle.");
        return points.peek().continueLabel;
    }

    public void drop() {
        points.pop();
    }

    private static class Point {
        private Label breakLabel;
        private Label continueLabel;

        private Point(Label breakLabel, Label continueLabel) {
            this.breakLabel = breakLabel;
            this.continueLabel = continueLabel;
        }
    }
}
