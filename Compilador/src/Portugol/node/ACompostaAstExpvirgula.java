/* This file was generated by SableCC (http://www.sablecc.org/). */

package Portugol.node;

import Portugol.analysis.*;

@SuppressWarnings("nls")
public final class ACompostaAstExpvirgula extends PAstExpvirgula
{
    private PExpGeral _expGeral_;
    private TVirgula _virgula_;
    private PAstExpvirgula _astExpvirgula_;

    public ACompostaAstExpvirgula()
    {
        // Constructor
    }

    public ACompostaAstExpvirgula(
        @SuppressWarnings("hiding") PExpGeral _expGeral_,
        @SuppressWarnings("hiding") TVirgula _virgula_,
        @SuppressWarnings("hiding") PAstExpvirgula _astExpvirgula_)
    {
        // Constructor
        setExpGeral(_expGeral_);

        setVirgula(_virgula_);

        setAstExpvirgula(_astExpvirgula_);

    }

    @Override
    public Object clone()
    {
        return new ACompostaAstExpvirgula(
            cloneNode(this._expGeral_),
            cloneNode(this._virgula_),
            cloneNode(this._astExpvirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACompostaAstExpvirgula(this);
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
            + toString(this._expGeral_)
            + toString(this._virgula_)
            + toString(this._astExpvirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expGeral_ == child)
        {
            this._expGeral_ = null;
            return;
        }

        if(this._virgula_ == child)
        {
            this._virgula_ = null;
            return;
        }

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
        if(this._expGeral_ == oldChild)
        {
            setExpGeral((PExpGeral) newChild);
            return;
        }

        if(this._virgula_ == oldChild)
        {
            setVirgula((TVirgula) newChild);
            return;
        }

        if(this._astExpvirgula_ == oldChild)
        {
            setAstExpvirgula((PAstExpvirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
