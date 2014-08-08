/* This file was generated by SableCC (http://www.sablecc.org/). */

package Portugol.analysis;

import java.util.*;
import Portugol.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPAstPrograma().apply(this);
        outStart(node);
    }

    public void inAAstPrograma(AAstPrograma node)
    {
        defaultIn(node);
    }

    public void outAAstPrograma(AAstPrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAstPrograma(AAstPrograma node)
    {
        inAAstPrograma(node);
        {
            List<PConjComandos> copy = new ArrayList<PConjComandos>(node.getConjComandos());
            Collections.reverse(copy);
            for(PConjComandos e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PAstDeclaracoes> copy = new ArrayList<PAstDeclaracoes>(node.getAstDeclaracoes());
            Collections.reverse(copy);
            for(PAstDeclaracoes e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outAAstPrograma(node);
    }

    public void inADclAstDeclaracoes(ADclAstDeclaracoes node)
    {
        defaultIn(node);
    }

    public void outADclAstDeclaracoes(ADclAstDeclaracoes node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADclAstDeclaracoes(ADclAstDeclaracoes node)
    {
        inADclAstDeclaracoes(node);
        {
            List<PAstDeclconj> copy = new ArrayList<PAstDeclconj>(node.getAstDeclconj());
            Collections.reverse(copy);
            for(PAstDeclconj e : copy)
            {
                e.apply(this);
            }
        }
        outADclAstDeclaracoes(node);
    }

    public void inAVazioAstDeclaracoes(AVazioAstDeclaracoes node)
    {
        defaultIn(node);
    }

    public void outAVazioAstDeclaracoes(AVazioAstDeclaracoes node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioAstDeclaracoes(AVazioAstDeclaracoes node)
    {
        inAVazioAstDeclaracoes(node);
        outAVazioAstDeclaracoes(node);
    }

    public void inAMultiplasAstDeclconj(AMultiplasAstDeclconj node)
    {
        defaultIn(node);
    }

    public void outAMultiplasAstDeclconj(AMultiplasAstDeclconj node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiplasAstDeclconj(AMultiplasAstDeclconj node)
    {
        inAMultiplasAstDeclconj(node);
        if(node.getAstVarDef() != null)
        {
            node.getAstVarDef().apply(this);
        }
        if(node.getAstDclVarLista() != null)
        {
            node.getAstDclVarLista().apply(this);
        }
        if(node.getAstTipo() != null)
        {
            node.getAstTipo().apply(this);
        }
        outAMultiplasAstDeclconj(node);
    }

    public void inASimplesAstDeclconj(ASimplesAstDeclconj node)
    {
        defaultIn(node);
    }

    public void outASimplesAstDeclconj(ASimplesAstDeclconj node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimplesAstDeclconj(ASimplesAstDeclconj node)
    {
        inASimplesAstDeclconj(node);
        if(node.getAstVarDef() != null)
        {
            node.getAstVarDef().apply(this);
        }
        if(node.getAstTipo() != null)
        {
            node.getAstTipo().apply(this);
        }
        outASimplesAstDeclconj(node);
    }

    public void inAConstAstDeclconj(AConstAstDeclconj node)
    {
        defaultIn(node);
    }

    public void outAConstAstDeclconj(AConstAstDeclconj node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstAstDeclconj(AConstAstDeclconj node)
    {
        inAConstAstDeclconj(node);
        if(node.getAstValor() != null)
        {
            node.getAstValor().apply(this);
        }
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outAConstAstDeclconj(node);
    }

    public void inAIdAstVarDef(AIdAstVarDef node)
    {
        defaultIn(node);
    }

    public void outAIdAstVarDef(AIdAstVarDef node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdAstVarDef(AIdAstVarDef node)
    {
        inAIdAstVarDef(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outAIdAstVarDef(node);
    }

    public void inAVetorAstVarDef(AVetorAstVarDef node)
    {
        defaultIn(node);
    }

    public void outAVetorAstVarDef(AVetorAstVarDef node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVetorAstVarDef(AVetorAstVarDef node)
    {
        inAVetorAstVarDef(node);
        if(node.getDirColchete() != null)
        {
            node.getDirColchete().apply(this);
        }
        if(node.getNInt() != null)
        {
            node.getNInt().apply(this);
        }
        if(node.getEsqColchete() != null)
        {
            node.getEsqColchete().apply(this);
        }
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outAVetorAstVarDef(node);
    }

    public void inAMultiplasAstDclVarLista(AMultiplasAstDclVarLista node)
    {
        defaultIn(node);
    }

    public void outAMultiplasAstDclVarLista(AMultiplasAstDclVarLista node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiplasAstDclVarLista(AMultiplasAstDclVarLista node)
    {
        inAMultiplasAstDclVarLista(node);
        if(node.getAstVarDef() != null)
        {
            node.getAstVarDef().apply(this);
        }
        if(node.getAstDclVarLista() != null)
        {
            node.getAstDclVarLista().apply(this);
        }
        outAMultiplasAstDclVarLista(node);
    }

    public void inASimplesAstDclVarLista(ASimplesAstDclVarLista node)
    {
        defaultIn(node);
    }

    public void outASimplesAstDclVarLista(ASimplesAstDclVarLista node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimplesAstDclVarLista(ASimplesAstDclVarLista node)
    {
        inASimplesAstDclVarLista(node);
        if(node.getAstVarDef() != null)
        {
            node.getAstVarDef().apply(this);
        }
        outASimplesAstDclVarLista(node);
    }

    public void inAIntAstTipo(AIntAstTipo node)
    {
        defaultIn(node);
    }

    public void outAIntAstTipo(AIntAstTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntAstTipo(AIntAstTipo node)
    {
        inAIntAstTipo(node);
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        outAIntAstTipo(node);
    }

    public void inARealAstTipo(ARealAstTipo node)
    {
        defaultIn(node);
    }

    public void outARealAstTipo(ARealAstTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealAstTipo(ARealAstTipo node)
    {
        inARealAstTipo(node);
        if(node.getReal() != null)
        {
            node.getReal().apply(this);
        }
        outARealAstTipo(node);
    }

    public void inACAstTipo(ACAstTipo node)
    {
        defaultIn(node);
    }

    public void outACAstTipo(ACAstTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACAstTipo(ACAstTipo node)
    {
        inACAstTipo(node);
        if(node.getCaractere() != null)
        {
            node.getCaractere().apply(this);
        }
        outACAstTipo(node);
    }

    public void inAIntAstValor(AIntAstValor node)
    {
        defaultIn(node);
    }

    public void outAIntAstValor(AIntAstValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntAstValor(AIntAstValor node)
    {
        inAIntAstValor(node);
        if(node.getNInt() != null)
        {
            node.getNInt().apply(this);
        }
        outAIntAstValor(node);
    }

    public void inANrealAstValor(ANrealAstValor node)
    {
        defaultIn(node);
    }

    public void outANrealAstValor(ANrealAstValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANrealAstValor(ANrealAstValor node)
    {
        inANrealAstValor(node);
        if(node.getNReal() != null)
        {
            node.getNReal().apply(this);
        }
        outANrealAstValor(node);
    }

    public void inAStrAstValor(AStrAstValor node)
    {
        defaultIn(node);
    }

    public void outAStrAstValor(AStrAstValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStrAstValor(AStrAstValor node)
    {
        inAStrAstValor(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStrAstValor(node);
    }

    public void inAExparitmeticaExpGeral(AExparitmeticaExpGeral node)
    {
        defaultIn(node);
    }

    public void outAExparitmeticaExpGeral(AExparitmeticaExpGeral node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExparitmeticaExpGeral(AExparitmeticaExpGeral node)
    {
        inAExparitmeticaExpGeral(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAExparitmeticaExpGeral(node);
    }

    public void inAExpLExpGeral(AExpLExpGeral node)
    {
        defaultIn(node);
    }

    public void outAExpLExpGeral(AExpLExpGeral node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpLExpGeral(AExpLExpGeral node)
    {
        inAExpLExpGeral(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outAExpLExpGeral(node);
    }

    public void inAMaisExp(AMaisExp node)
    {
        defaultIn(node);
    }

    public void outAMaisExp(AMaisExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaisExp(AMaisExp node)
    {
        inAMaisExp(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outAMaisExp(node);
    }

    public void inAMenosExp(AMenosExp node)
    {
        defaultIn(node);
    }

    public void outAMenosExp(AMenosExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenosExp(AMenosExp node)
    {
        inAMenosExp(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outAMenosExp(node);
    }

    public void inAMultiplicacaoExp(AMultiplicacaoExp node)
    {
        defaultIn(node);
    }

    public void outAMultiplicacaoExp(AMultiplicacaoExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiplicacaoExp(AMultiplicacaoExp node)
    {
        inAMultiplicacaoExp(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outAMultiplicacaoExp(node);
    }

    public void inADivisaoExp(ADivisaoExp node)
    {
        defaultIn(node);
    }

    public void outADivisaoExp(ADivisaoExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivisaoExp(ADivisaoExp node)
    {
        inADivisaoExp(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outADivisaoExp(node);
    }

    public void inANumerointExp(ANumerointExp node)
    {
        defaultIn(node);
    }

    public void outANumerointExp(ANumerointExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumerointExp(ANumerointExp node)
    {
        inANumerointExp(node);
        if(node.getNInt() != null)
        {
            node.getNInt().apply(this);
        }
        outANumerointExp(node);
    }

    public void inAIdExp(AIdExp node)
    {
        defaultIn(node);
    }

    public void outAIdExp(AIdExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdExp(AIdExp node)
    {
        inAIdExp(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outAIdExp(node);
    }

    public void inAExpExp(AExpExp node)
    {
        defaultIn(node);
    }

    public void outAExpExp(AExpExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpExp(AExpExp node)
    {
        inAExpExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAExpExp(node);
    }

    public void inAStrExp(AStrExp node)
    {
        defaultIn(node);
    }

    public void outAStrExp(AStrExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStrExp(AStrExp node)
    {
        inAStrExp(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStrExp(node);
    }

    public void inANlogExpLogica(ANlogExpLogica node)
    {
        defaultIn(node);
    }

    public void outANlogExpLogica(ANlogExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANlogExpLogica(ANlogExpLogica node)
    {
        inANlogExpLogica(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        if(node.getNao() != null)
        {
            node.getNao().apply(this);
        }
        outANlogExpLogica(node);
    }

    public void inAOubinExpLogica(AOubinExpLogica node)
    {
        defaultIn(node);
    }

    public void outAOubinExpLogica(AOubinExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOubinExpLogica(AOubinExpLogica node)
    {
        inAOubinExpLogica(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outAOubinExpLogica(node);
    }

    public void inAXorbinExpLogica(AXorbinExpLogica node)
    {
        defaultIn(node);
    }

    public void outAXorbinExpLogica(AXorbinExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAXorbinExpLogica(AXorbinExpLogica node)
    {
        inAXorbinExpLogica(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outAXorbinExpLogica(node);
    }

    public void inAEbinExpLogica(AEbinExpLogica node)
    {
        defaultIn(node);
    }

    public void outAEbinExpLogica(AEbinExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEbinExpLogica(AEbinExpLogica node)
    {
        inAEbinExpLogica(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outAEbinExpLogica(node);
    }

    public void inAIgualExpLogica(AIgualExpLogica node)
    {
        defaultIn(node);
    }

    public void outAIgualExpLogica(AIgualExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIgualExpLogica(AIgualExpLogica node)
    {
        inAIgualExpLogica(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outAIgualExpLogica(node);
    }

    public void inADiferenteExpLogica(ADiferenteExpLogica node)
    {
        defaultIn(node);
    }

    public void outADiferenteExpLogica(ADiferenteExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADiferenteExpLogica(ADiferenteExpLogica node)
    {
        inADiferenteExpLogica(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outADiferenteExpLogica(node);
    }

    public void inAMaiorExpLogica(AMaiorExpLogica node)
    {
        defaultIn(node);
    }

    public void outAMaiorExpLogica(AMaiorExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorExpLogica(AMaiorExpLogica node)
    {
        inAMaiorExpLogica(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outAMaiorExpLogica(node);
    }

    public void inAMaiorIgualExpLogica(AMaiorIgualExpLogica node)
    {
        defaultIn(node);
    }

    public void outAMaiorIgualExpLogica(AMaiorIgualExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorIgualExpLogica(AMaiorIgualExpLogica node)
    {
        inAMaiorIgualExpLogica(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outAMaiorIgualExpLogica(node);
    }

    public void inAMenorExpLogica(AMenorExpLogica node)
    {
        defaultIn(node);
    }

    public void outAMenorExpLogica(AMenorExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorExpLogica(AMenorExpLogica node)
    {
        inAMenorExpLogica(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outAMenorExpLogica(node);
    }

    public void inAMenorIgualExpLogica(AMenorIgualExpLogica node)
    {
        defaultIn(node);
    }

    public void outAMenorIgualExpLogica(AMenorIgualExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorIgualExpLogica(AMenorIgualExpLogica node)
    {
        inAMenorIgualExpLogica(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outAMenorIgualExpLogica(node);
    }

    public void inALeiaConjComandos(ALeiaConjComandos node)
    {
        defaultIn(node);
    }

    public void outALeiaConjComandos(ALeiaConjComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALeiaConjComandos(ALeiaConjComandos node)
    {
        inALeiaConjComandos(node);
        if(node.getAstLeia() != null)
        {
            node.getAstLeia().apply(this);
        }
        {
            List<PConjComandos> copy = new ArrayList<PConjComandos>(node.getConjComandos());
            Collections.reverse(copy);
            for(PConjComandos e : copy)
            {
                e.apply(this);
            }
        }
        outALeiaConjComandos(node);
    }

    public void inAEscrevaConjComandos(AEscrevaConjComandos node)
    {
        defaultIn(node);
    }

    public void outAEscrevaConjComandos(AEscrevaConjComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEscrevaConjComandos(AEscrevaConjComandos node)
    {
        inAEscrevaConjComandos(node);
        if(node.getAstEscreva() != null)
        {
            node.getAstEscreva().apply(this);
        }
        {
            List<PConjComandos> copy = new ArrayList<PConjComandos>(node.getConjComandos());
            Collections.reverse(copy);
            for(PConjComandos e : copy)
            {
                e.apply(this);
            }
        }
        outAEscrevaConjComandos(node);
    }

    public void inAAtribuicaoConjComandos(AAtribuicaoConjComandos node)
    {
        defaultIn(node);
    }

    public void outAAtribuicaoConjComandos(AAtribuicaoConjComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtribuicaoConjComandos(AAtribuicaoConjComandos node)
    {
        inAAtribuicaoConjComandos(node);
        if(node.getAstAtribuicao() != null)
        {
            node.getAstAtribuicao().apply(this);
        }
        {
            List<PConjComandos> copy = new ArrayList<PConjComandos>(node.getConjComandos());
            Collections.reverse(copy);
            for(PConjComandos e : copy)
            {
                e.apply(this);
            }
        }
        outAAtribuicaoConjComandos(node);
    }

    public void inACondicionalConjComandos(ACondicionalConjComandos node)
    {
        defaultIn(node);
    }

    public void outACondicionalConjComandos(ACondicionalConjComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACondicionalConjComandos(ACondicionalConjComandos node)
    {
        inACondicionalConjComandos(node);
        if(node.getAstComandoSe() != null)
        {
            node.getAstComandoSe().apply(this);
        }
        {
            List<PConjComandos> copy = new ArrayList<PConjComandos>(node.getConjComandos());
            Collections.reverse(copy);
            for(PConjComandos e : copy)
            {
                e.apply(this);
            }
        }
        outACondicionalConjComandos(node);
    }

    public void inAEnquantoConjComandos(AEnquantoConjComandos node)
    {
        defaultIn(node);
    }

    public void outAEnquantoConjComandos(AEnquantoConjComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnquantoConjComandos(AEnquantoConjComandos node)
    {
        inAEnquantoConjComandos(node);
        if(node.getAstComandoEnquanto() != null)
        {
            node.getAstComandoEnquanto().apply(this);
        }
        {
            List<PConjComandos> copy = new ArrayList<PConjComandos>(node.getConjComandos());
            Collections.reverse(copy);
            for(PConjComandos e : copy)
            {
                e.apply(this);
            }
        }
        outAEnquantoConjComandos(node);
    }

    public void inARepitaConjComandos(ARepitaConjComandos node)
    {
        defaultIn(node);
    }

    public void outARepitaConjComandos(ARepitaConjComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARepitaConjComandos(ARepitaConjComandos node)
    {
        inARepitaConjComandos(node);
        if(node.getAstComandoRepita() != null)
        {
            node.getAstComandoRepita().apply(this);
        }
        {
            List<PConjComandos> copy = new ArrayList<PConjComandos>(node.getConjComandos());
            Collections.reverse(copy);
            for(PConjComandos e : copy)
            {
                e.apply(this);
            }
        }
        outARepitaConjComandos(node);
    }

    public void inAFacaConjComandos(AFacaConjComandos node)
    {
        defaultIn(node);
    }

    public void outAFacaConjComandos(AFacaConjComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFacaConjComandos(AFacaConjComandos node)
    {
        inAFacaConjComandos(node);
        if(node.getAstComandoPara() != null)
        {
            node.getAstComandoPara().apply(this);
        }
        {
            List<PConjComandos> copy = new ArrayList<PConjComandos>(node.getConjComandos());
            Collections.reverse(copy);
            for(PConjComandos e : copy)
            {
                e.apply(this);
            }
        }
        outAFacaConjComandos(node);
    }

    public void inAFacaPassoConjComandos(AFacaPassoConjComandos node)
    {
        defaultIn(node);
    }

    public void outAFacaPassoConjComandos(AFacaPassoConjComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFacaPassoConjComandos(AFacaPassoConjComandos node)
    {
        inAFacaPassoConjComandos(node);
        if(node.getAstParaPasso() != null)
        {
            node.getAstParaPasso().apply(this);
        }
        {
            List<PConjComandos> copy = new ArrayList<PConjComandos>(node.getConjComandos());
            Collections.reverse(copy);
            for(PConjComandos e : copy)
            {
                e.apply(this);
            }
        }
        outAFacaPassoConjComandos(node);
    }

    public void inAAvalieConjComandos(AAvalieConjComandos node)
    {
        defaultIn(node);
    }

    public void outAAvalieConjComandos(AAvalieConjComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAvalieConjComandos(AAvalieConjComandos node)
    {
        inAAvalieConjComandos(node);
        if(node.getAstAvalie() != null)
        {
            node.getAstAvalie().apply(this);
        }
        {
            List<PConjComandos> copy = new ArrayList<PConjComandos>(node.getConjComandos());
            Collections.reverse(copy);
            for(PConjComandos e : copy)
            {
                e.apply(this);
            }
        }
        outAAvalieConjComandos(node);
    }

    public void inAVazioConjComandos(AVazioConjComandos node)
    {
        defaultIn(node);
    }

    public void outAVazioConjComandos(AVazioConjComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioConjComandos(AVazioConjComandos node)
    {
        inAVazioConjComandos(node);
        outAVazioConjComandos(node);
    }

    public void inASimplesAstLeia(ASimplesAstLeia node)
    {
        defaultIn(node);
    }

    public void outASimplesAstLeia(ASimplesAstLeia node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimplesAstLeia(ASimplesAstLeia node)
    {
        inASimplesAstLeia(node);
        if(node.getAstVarDef() != null)
        {
            node.getAstVarDef().apply(this);
        }
        outASimplesAstLeia(node);
    }

    public void inACompostaAstLeia(ACompostaAstLeia node)
    {
        defaultIn(node);
    }

    public void outACompostaAstLeia(ACompostaAstLeia node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACompostaAstLeia(ACompostaAstLeia node)
    {
        inACompostaAstLeia(node);
        if(node.getAstVarvirgula() != null)
        {
            node.getAstVarvirgula().apply(this);
        }
        outACompostaAstLeia(node);
    }

    public void inAAstAtribuicao(AAstAtribuicao node)
    {
        defaultIn(node);
    }

    public void outAAstAtribuicao(AAstAtribuicao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAstAtribuicao(AAstAtribuicao node)
    {
        inAAstAtribuicao(node);
        if(node.getExpGeral() != null)
        {
            node.getExpGeral().apply(this);
        }
        if(node.getAstVarDef() != null)
        {
            node.getAstVarDef().apply(this);
        }
        outAAstAtribuicao(node);
    }

    public void inASimplesAstEscreva(ASimplesAstEscreva node)
    {
        defaultIn(node);
    }

    public void outASimplesAstEscreva(ASimplesAstEscreva node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimplesAstEscreva(ASimplesAstEscreva node)
    {
        inASimplesAstEscreva(node);
        if(node.getExpGeral() != null)
        {
            node.getExpGeral().apply(this);
        }
        outASimplesAstEscreva(node);
    }

    public void inACompostaAstEscreva(ACompostaAstEscreva node)
    {
        defaultIn(node);
    }

    public void outACompostaAstEscreva(ACompostaAstEscreva node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACompostaAstEscreva(ACompostaAstEscreva node)
    {
        inACompostaAstEscreva(node);
        if(node.getAstExpvirgula() != null)
        {
            node.getAstExpvirgula().apply(this);
        }
        outACompostaAstEscreva(node);
    }

    public void inASimplesAstComandoSe(ASimplesAstComandoSe node)
    {
        defaultIn(node);
    }

    public void outASimplesAstComandoSe(ASimplesAstComandoSe node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimplesAstComandoSe(ASimplesAstComandoSe node)
    {
        inASimplesAstComandoSe(node);
        {
            List<PConjComandos> copy = new ArrayList<PConjComandos>(node.getConjComandos());
            Collections.reverse(copy);
            for(PConjComandos e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outASimplesAstComandoSe(node);
    }

    public void inACompletoAstComandoSe(ACompletoAstComandoSe node)
    {
        defaultIn(node);
    }

    public void outACompletoAstComandoSe(ACompletoAstComandoSe node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACompletoAstComandoSe(ACompletoAstComandoSe node)
    {
        inACompletoAstComandoSe(node);
        {
            List<PConjComandos> copy = new ArrayList<PConjComandos>(node.getConjComandos());
            Collections.reverse(copy);
            for(PConjComandos e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outACompletoAstComandoSe(node);
    }

    public void inAEnquantoAstComandoEnquanto(AEnquantoAstComandoEnquanto node)
    {
        defaultIn(node);
    }

    public void outAEnquantoAstComandoEnquanto(AEnquantoAstComandoEnquanto node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnquantoAstComandoEnquanto(AEnquantoAstComandoEnquanto node)
    {
        inAEnquantoAstComandoEnquanto(node);
        {
            List<PConjComandos> copy = new ArrayList<PConjComandos>(node.getConjComandos());
            Collections.reverse(copy);
            for(PConjComandos e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outAEnquantoAstComandoEnquanto(node);
    }

    public void inARepitaAstComandoRepita(ARepitaAstComandoRepita node)
    {
        defaultIn(node);
    }

    public void outARepitaAstComandoRepita(ARepitaAstComandoRepita node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARepitaAstComandoRepita(ARepitaAstComandoRepita node)
    {
        inARepitaAstComandoRepita(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        {
            List<PConjComandos> copy = new ArrayList<PConjComandos>(node.getConjComandos());
            Collections.reverse(copy);
            for(PConjComandos e : copy)
            {
                e.apply(this);
            }
        }
        outARepitaAstComandoRepita(node);
    }

    public void inAParaAstComandoPara(AParaAstComandoPara node)
    {
        defaultIn(node);
    }

    public void outAParaAstComandoPara(AParaAstComandoPara node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaAstComandoPara(AParaAstComandoPara node)
    {
        inAParaAstComandoPara(node);
        {
            List<PConjComandos> copy = new ArrayList<PConjComandos>(node.getConjComandos());
            Collections.reverse(copy);
            for(PConjComandos e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getAstComplemento1() != null)
        {
            node.getAstComplemento1().apply(this);
        }
        if(node.getNInt() != null)
        {
            node.getNInt().apply(this);
        }
        if(node.getAstVarDef() != null)
        {
            node.getAstVarDef().apply(this);
        }
        outAParaAstComandoPara(node);
    }

    public void inAAstComplemento1(AAstComplemento1 node)
    {
        defaultIn(node);
    }

    public void outAAstComplemento1(AAstComplemento1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAstComplemento1(AAstComplemento1 node)
    {
        inAAstComplemento1(node);
        if(node.getNInt() != null)
        {
            node.getNInt().apply(this);
        }
        outAAstComplemento1(node);
    }

    public void inAAstParaPasso(AAstParaPasso node)
    {
        defaultIn(node);
    }

    public void outAAstParaPasso(AAstParaPasso node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAstParaPasso(AAstParaPasso node)
    {
        inAAstParaPasso(node);
        {
            List<PConjComandos> copy = new ArrayList<PConjComandos>(node.getConjComandos());
            Collections.reverse(copy);
            for(PConjComandos e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getAstComplemento2() != null)
        {
            node.getAstComplemento2().apply(this);
        }
        if(node.getNInt() != null)
        {
            node.getNInt().apply(this);
        }
        if(node.getAstVarDef() != null)
        {
            node.getAstVarDef().apply(this);
        }
        outAAstParaPasso(node);
    }

    public void inAAstComplemento2(AAstComplemento2 node)
    {
        defaultIn(node);
    }

    public void outAAstComplemento2(AAstComplemento2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAstComplemento2(AAstComplemento2 node)
    {
        inAAstComplemento2(node);
        if(node.getNInt() != null)
        {
            node.getNInt().apply(this);
        }
        outAAstComplemento2(node);
    }

    public void inAAstAvalie(AAstAvalie node)
    {
        defaultIn(node);
    }

    public void outAAstAvalie(AAstAvalie node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAstAvalie(AAstAvalie node)
    {
        inAAstAvalie(node);
        if(node.getAstSenaoAvalie() != null)
        {
            node.getAstSenaoAvalie().apply(this);
        }
        {
            List<PAstCaso> copy = new ArrayList<PAstCaso>(node.getAstCaso());
            Collections.reverse(copy);
            for(PAstCaso e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpGeral() != null)
        {
            node.getExpGeral().apply(this);
        }
        outAAstAvalie(node);
    }

    public void inAAstCaso(AAstCaso node)
    {
        defaultIn(node);
    }

    public void outAAstCaso(AAstCaso node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAstCaso(AAstCaso node)
    {
        inAAstCaso(node);
        {
            List<PConjComandos> copy = new ArrayList<PConjComandos>(node.getConjComandos());
            Collections.reverse(copy);
            for(PConjComandos e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getAstValor() != null)
        {
            node.getAstValor().apply(this);
        }
        outAAstCaso(node);
    }

    public void inASenaoAstSenaoAvalie(ASenaoAstSenaoAvalie node)
    {
        defaultIn(node);
    }

    public void outASenaoAstSenaoAvalie(ASenaoAstSenaoAvalie node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASenaoAstSenaoAvalie(ASenaoAstSenaoAvalie node)
    {
        inASenaoAstSenaoAvalie(node);
        {
            List<PConjComandos> copy = new ArrayList<PConjComandos>(node.getConjComandos());
            Collections.reverse(copy);
            for(PConjComandos e : copy)
            {
                e.apply(this);
            }
        }
        outASenaoAstSenaoAvalie(node);
    }

    public void inAVazioAstSenaoAvalie(AVazioAstSenaoAvalie node)
    {
        defaultIn(node);
    }

    public void outAVazioAstSenaoAvalie(AVazioAstSenaoAvalie node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioAstSenaoAvalie(AVazioAstSenaoAvalie node)
    {
        inAVazioAstSenaoAvalie(node);
        outAVazioAstSenaoAvalie(node);
    }

    public void inASimplesAstVarvirgula(ASimplesAstVarvirgula node)
    {
        defaultIn(node);
    }

    public void outASimplesAstVarvirgula(ASimplesAstVarvirgula node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimplesAstVarvirgula(ASimplesAstVarvirgula node)
    {
        inASimplesAstVarvirgula(node);
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        if(node.getAstVarDef() != null)
        {
            node.getAstVarDef().apply(this);
        }
        outASimplesAstVarvirgula(node);
    }

    public void inACompostaAstVarvirgula(ACompostaAstVarvirgula node)
    {
        defaultIn(node);
    }

    public void outACompostaAstVarvirgula(ACompostaAstVarvirgula node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACompostaAstVarvirgula(ACompostaAstVarvirgula node)
    {
        inACompostaAstVarvirgula(node);
        if(node.getAstVarvirgula() != null)
        {
            node.getAstVarvirgula().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        if(node.getAstVarDef() != null)
        {
            node.getAstVarDef().apply(this);
        }
        outACompostaAstVarvirgula(node);
    }

    public void inASimplesAstExpvirgula(ASimplesAstExpvirgula node)
    {
        defaultIn(node);
    }

    public void outASimplesAstExpvirgula(ASimplesAstExpvirgula node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimplesAstExpvirgula(ASimplesAstExpvirgula node)
    {
        inASimplesAstExpvirgula(node);
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        if(node.getExpGeral() != null)
        {
            node.getExpGeral().apply(this);
        }
        outASimplesAstExpvirgula(node);
    }

    public void inACompostaAstExpvirgula(ACompostaAstExpvirgula node)
    {
        defaultIn(node);
    }

    public void outACompostaAstExpvirgula(ACompostaAstExpvirgula node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACompostaAstExpvirgula(ACompostaAstExpvirgula node)
    {
        inACompostaAstExpvirgula(node);
        if(node.getAstExpvirgula() != null)
        {
            node.getAstExpvirgula().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        if(node.getExpGeral() != null)
        {
            node.getExpGeral().apply(this);
        }
        outACompostaAstExpvirgula(node);
    }
}