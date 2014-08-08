/* This file was generated by SableCC (http://www.sablecc.org/). */

package Portugol.node;

import Portugol.analysis.*;

@SuppressWarnings("nls")
public final class AAstAtribuicao extends PAstAtribuicao
{
    private PAstVarDef _astVarDef_;
    private PExpGeral _expGeral_;

    public AAstAtribuicao()
    {
        // Constructor
    }

    public AAstAtribuicao(
        @SuppressWarnings("hiding") PAstVarDef _astVarDef_,
        @SuppressWarnings("hiding") PExpGeral _expGeral_)
    {
        // Constructor
        setAstVarDef(_astVarDef_);

        setExpGeral(_expGeral_);

    }

    @Override
    public Object clone()
    {
        return new AAstAtribuicao(
            cloneNode(this._astVarDef_),
            cloneNode(this._expGeral_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAstAtribuicao(this);
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

    public PExpGeral getExpGeral()
    {
        return this._expGeral_;
    }

    public void setExpGeral(PExpGeral node)
    {
        if(this._expGeral_ != null)
        {
            this._expGeral_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expGeral_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._astVarDef_)
            + toString(this._expGeral_);
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

        if(this._expGeral_ == child)
        {
            this._expGeral_ = null;
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

        if(this._expGeral_ == oldChild)
        {
            setExpGeral((PExpGeral) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}