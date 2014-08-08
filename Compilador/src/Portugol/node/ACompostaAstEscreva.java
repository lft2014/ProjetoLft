/* This file was generated by SableCC (http://www.sablecc.org/). */

package Portugol.node;

import Portugol.analysis.*;

@SuppressWarnings("nls")
public final class ACompostaAstEscreva extends PAstEscreva
{
    private PAstExpvirgula _astExpvirgula_;

    public ACompostaAstEscreva()
    {
        // Constructor
    }

    public ACompostaAstEscreva(
        @SuppressWarnings("hiding") PAstExpvirgula _astExpvirgula_)
    {
        // Constructor
        setAstExpvirgula(_astExpvirgula_);

    }

    @Override
    public Object clone()
    {
        return new ACompostaAstEscreva(
            cloneNode(this._astExpvirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACompostaAstEscreva(this);
    }

    public PAstExpvirgula getAstExpvirgula()
    {
        return this._astExpvirgula_;
    }

    public void setAstExpvirgula(PAstExpvirgula node)
    {
        if(this._astExpvirgula_ != null)
        {
            this._astExpvirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._astExpvirgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._astExpvirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._astExpvirgula_ == child)
        {
            this._astExpvirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._astExpvirgula_ == oldChild)
        {
            setAstExpvirgula((PAstExpvirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
