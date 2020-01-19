package com.company.states;

import com.company.ships.Statek;
import com.company.strategies.CollisionAvoidanceStrategy;

import java.awt.*;

public class InDangerState extends State {
    private CollisionAvoidanceStrategy collisionAvoidanceStrategy;

    @Override
    public void drawShape(Statek context, Graphics2D g) {
        g.setColor(context.getColor());
        context.drawShape(g);
    }

    public void avoid() {
        //TODO napisać implementację metody avoid() oraz strategie
    }
}
