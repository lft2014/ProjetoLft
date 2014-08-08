/* This file was generated by SableCC (http://www.sablecc.org/). */

package Portugol.node;

import Portugol.analysis.*;

@SuppressWarnings("nls")
public final class TVirgula extends Token
{
    public TVirgula()
    {
        super.setText(",");
    }

    public TVirgula(int line, int pos)
    {
        super.setText(",");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TVirgula(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTVirgula(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TVirgula text.");
    }
}
