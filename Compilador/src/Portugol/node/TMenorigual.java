/* This file was generated by SableCC (http://www.sablecc.org/). */

package Portugol.node;

import Portugol.analysis.*;

@SuppressWarnings("nls")
public final class TMenorigual extends Token
{
    public TMenorigual()
    {
        super.setText("<=");
    }

    public TMenorigual(int line, int pos)
    {
        super.setText("<=");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMenorigual(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMenorigual(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMenorigual text.");
    }
}
