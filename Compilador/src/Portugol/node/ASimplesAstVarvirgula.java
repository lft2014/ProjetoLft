/* This file was generated by SableCC (http://www.sablecc.org/). */

package Portugol.node;

import Portugol.analysis.*;

@SuppressWarnings("nls")
public final class ASimplesAstVarvirgula extends PAstVarvirgula
{
    private PAstVarDef _astVarDef_;
    private TVirgula _virgula_;

    public ASimplesAstVarvirgula()
    {
        // Constructor
    }

    public ASimplesAstVarvirgula(
        @SuppressWarnings("hiding") PAstVarDef _astVarDef_,
        @SuppressWarnings("hiding") TVirgula _virgula_)
    {
        // Constructor
        setAstVarDef(_astVarDef_);

        setVirgula(_virgula_);

    }

    @Override
    public Object clone()
    {
        return new ASimplesAstVarvirgula(
            cloneNode(this._astVarDef_),
            cloneNode(this._virgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimplesAstVarvirgula(this);
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

    public TVirgula getVirgula()
    {
        return this._virgula_;
    }

    public void setVirgula(TVirgula node)
    {
        if(this._virgula_ != null)
        {
            this._virgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._virgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._astVarDef_)
            + toString(this._virgula_);
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

        if(this._virgula_ == child)
        {
            this._virgula_ = null;
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

        if(this._virgula_ == oldChild)
        {
            setVirgula((TVirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}