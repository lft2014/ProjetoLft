/* This file was generated by SableCC (http://www.sablecc.org/). */

package Portugol.node;

import Portugol.analysis.*;

@SuppressWarnings("nls")
public final class ACompostaAstLeia extends PAstLeia
{
    private PAstVarvirgula _astVarvirgula_;

    public ACompostaAstLeia()
    {
        // Constructor
    }

    public ACompostaAstLeia(
        @SuppressWarnings("hiding") PAstVarvirgula _astVarvirgula_)
    {
        // Constructor
        setAstVarvirgula(_astVarvirgula_);

    }

    @Override
    public Object clone()
    {
        return new ACompostaAstLeia(
            cloneNode(this._astVarvirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACompostaAstLeia(this);
    }

    public PAstVarvirgula getAstVarvirgula()
    {
        return this._astVarvirgula_;
    }

    public void setAstVarvirgula(PAstVarvirgula node)
    {
        if(this._astVarvirgula_ != null)
        {
            this._astVarvirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._astVarvirgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._astVarvirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._astVarvirgula_ == child)
        {
            this._astVarvirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._astVarvirgula_ == oldChild)
        {
            setAstVarvirgula((PAstVarvirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
