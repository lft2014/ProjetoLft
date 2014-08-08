/* This file was generated by SableCC (http://www.sablecc.org/). */

package Portugol.node;

import Portugol.analysis.*;

@SuppressWarnings("nls")
public final class TCaso extends Token
{
    public TCaso()
    {
        super.setText("caso");
    }

    public TCaso(int line, int pos)
    {
        super.setText("caso");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCaso(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCaso(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCaso text.");
    }
}
