/* This file was generated by SableCC (http://www.sablecc.org/). */

package Portugol.node;

import Portugol.analysis.*;

@SuppressWarnings("nls")
public final class ASimplesAstDeclconj extends PAstDeclconj
{
    private PAstTipo _astTipo_;
    private PAstVarDef _astVarDef_;

    public ASimplesAstDeclconj()
    {
        // Constructor
    }

    public ASimplesAstDeclconj(
        @SuppressWarnings("hiding") PAstTipo _astTipo_,
        @SuppressWarnings("hiding") PAstVarDef _astVarDef_)
    {
        // Constructor
        setAstTipo(_astTipo_);

        setAstVarDef(_astVarDef_);

    }

    @Override
    public Object clone()
    {
        return new ASimplesAstDeclconj(
            cloneNode(this._astTipo_),
            cloneNode(this._astVarDef_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimplesAstDeclconj(this);
    }

    public PAstTipo getAstTipo()
    {
        return this._astTipo_;
    }

    public void setAstTipo(PAstTipo node)
    {
        if(this._astTipo_ != null)
        {
            this._astTipo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._astTipo_ = node;
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
            + toString(this._astTipo_)
            + toString(this._astVarDef_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._astTipo_ == child)
        {
            this._astTipo_ = null;
            return;
        }

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
        if(this._astTipo_ == oldChild)
        {
            setAstTipo((PAstTipo) newChild);
            return;
        }

        if(this._astVarDef_ == oldChild)
        {
            setAstVarDef((PAstVarDef) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
