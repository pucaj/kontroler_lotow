package com.company.draw_decorators.image_decorators;

import com.company.ships.Statek;
import com.company.states.State;

import java.awt.*;

public class DrawImageWithSquareBorder extends State {
    private State inner;

    public DrawImageWithSquareBorder(State inner) {
        this.inner = inner;
    }

    @Override
    public void drawImg(Statek context, Graphics2D g) {
        final float[] dash1 = {3.0f};
        final BasicStroke dashed =
                new BasicStroke(3.0f,
                        BasicStroke.CAP_BUTT,
                        BasicStroke.JOIN_MITER,
                        2.0f, dash1, 0.0f);
        g.setStroke(dashed);
        g.drawRect((int) context.getPozycja().x - 20, (int) context.getPozycja().y - 20, 40, 40);
        inner.drawImg(context, g);
    }
}
