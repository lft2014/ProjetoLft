/* This file was generated by SableCC (http://www.sablecc.org/). */

package Portugol.node;

import Portugol.analysis.*;

@SuppressWarnings("nls")
public final class TAspaS extends Token
{
    public TAspaS()
    {
        super.setText("\'");
    }

    public TAspaS(int line, int pos)
    {
        super.setText("\'");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAspaS(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAspaS(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAspaS text.");
    }
}
