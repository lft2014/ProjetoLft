/* This file was generated by SableCC (http://www.sablecc.org/). */

package Portugol.node;

import Portugol.analysis.*;

@SuppressWarnings("nls")
public final class ASimplesAstDclVarLista extends PAstDclVarLista
{
    private PAstVarDef _astVarDef_;

    public ASimplesAstDclVarLista()
    {
        // Constructor
    }

    public ASimplesAstDclVarLista(
        @SuppressWarnings("hiding") PAstVarDef _astVarDef_)
    {
        // Constructor
        setAstVarDef(_astVarDef_);

    }

    @Override
    public Object clone()
    {
        return new ASimplesAstDclVarLista(
            cloneNode(this._astVarDef_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimplesAstDclVarLista(this);
    }

    public PAstVarDef getAstVarDef()
    {
        return this._astVarDef_;
    }

    public void setAstVarDef(PAstVarDef node)
    {
        if(this._astVarDef_ != null)
        {
            this._astVarDef_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._astVarDef_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._astVarDef_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._astVarDef_ == child)
        {
            this._astVarDef_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._astVarDef_ == oldChild)
        {
            setAstVarDef((PAstVarDef) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
