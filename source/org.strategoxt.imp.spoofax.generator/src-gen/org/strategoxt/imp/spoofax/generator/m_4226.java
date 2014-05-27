package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class m_4226 extends Strategy 
{ 
  public static final m_4226 instance = new m_4226();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28989:
    { 
      IStrategoTerm d_4226 = null;
      IStrategoTerm e_4226 = null;
      IStrategoTerm f_4226 = null;
      IStrategoTerm g_4226 = null;
      IStrategoTerm term10069 = term;
      Success11415:
      { 
        Fail28990:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail28990;
          term = generator.const7030;
          if(true)
            break Success11415;
        }
        term = term10069;
        IStrategoTerm term10070 = term;
        Success11416:
        { 
          Fail28991:
          { 
            IStrategoTerm h_4226 = null;
            IStrategoTerm i_4226 = null;
            IStrategoTerm j_4226 = null;
            IStrategoTerm k_4226 = null;
            IStrategoTerm l_4226 = null;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail28991;
            h_4226 = ((IStrategoList)term).head();
            i_4226 = ((IStrategoList)term).tail();
            IStrategoList annos917 = term.getAnnotations();
            l_4226 = annos917;
            j_4226 = h_4226;
            term = i_4226;
            if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
              break Fail28991;
            k_4226 = term;
            term = j_4226;
            if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consappl_2 != ((IStrategoAppl)term).getConstructor())
              break Fail28991;
            IStrategoTerm arg5910 = term.getSubterm(0);
            if(arg5910.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)arg5910).getConstructor())
              break Fail28991;
            IStrategoTerm arg5911 = arg5910.getSubterm(0);
            if(arg5911.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg5911).isEmpty())
              break Fail28991;
            IStrategoTerm arg5912 = ((IStrategoList)arg5911).head();
            if(arg5912.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg5912).getConstructor())
              break Fail28991;
            IStrategoTerm arg5913 = arg5912.getSubterm(0);
            if(arg5913.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consopt_1 != ((IStrategoAppl)arg5913).getConstructor())
              break Fail28991;
            IStrategoTerm arg5914 = arg5913.getSubterm(0);
            if(arg5914.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conslayout_0 != ((IStrategoAppl)arg5914).getConstructor())
              break Fail28991;
            IStrategoTerm arg5915 = ((IStrategoList)arg5911).tail();
            if(arg5915.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg5915).isEmpty())
              break Fail28991;
            IStrategoTerm arg5916 = ((IStrategoList)arg5915).head();
            if(arg5916.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg5916).getConstructor())
              break Fail28991;
            IStrategoTerm arg5917 = arg5916.getSubterm(0);
            if(arg5917.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conssort_1 != ((IStrategoAppl)arg5917).getConstructor())
              break Fail28991;
            IStrategoTerm arg5918 = arg5917.getSubterm(0);
            if(arg5918.getTermType() != IStrategoTerm.STRING || !"Module".equals(((IStrategoString)arg5918).stringValue()))
              break Fail28991;
            IStrategoTerm arg5919 = ((IStrategoList)arg5915).tail();
            if(arg5919.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg5919).isEmpty())
              break Fail28991;
            IStrategoTerm arg5920 = ((IStrategoList)arg5919).head();
            if(arg5920.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg5920).getConstructor())
              break Fail28991;
            IStrategoTerm arg5921 = arg5920.getSubterm(0);
            if(arg5921.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consopt_1 != ((IStrategoAppl)arg5921).getConstructor())
              break Fail28991;
            IStrategoTerm arg5922 = arg5921.getSubterm(0);
            if(arg5922.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conslayout_0 != ((IStrategoAppl)arg5922).getConstructor())
              break Fail28991;
            IStrategoTerm arg5923 = ((IStrategoList)arg5919).tail();
            if(arg5923.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg5923).isEmpty())
              break Fail28991;
            IStrategoTerm arg5924 = arg5910.getSubterm(1);
            if(arg5924.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conssort_1 != ((IStrategoAppl)arg5924).getConstructor())
              break Fail28991;
            IStrategoTerm arg5925 = arg5924.getSubterm(0);
            if(arg5925.getTermType() != IStrategoTerm.STRING || !"<START>".equals(((IStrategoString)arg5925).stringValue()))
              break Fail28991;
            IStrategoTerm arg5926 = arg5910.getSubterm(2);
            if(arg5926.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consno_attrs_0 != ((IStrategoAppl)arg5926).getConstructor())
              break Fail28991;
            IStrategoTerm arg5927 = term.getSubterm(1);
            if(arg5927.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg5927).isEmpty())
              break Fail28991;
            IStrategoTerm arg5928 = ((IStrategoList)arg5927).tail();
            if(arg5928.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg5928).isEmpty())
              break Fail28991;
            d_4226 = ((IStrategoList)arg5928).head();
            IStrategoTerm arg5929 = ((IStrategoList)arg5928).tail();
            if(arg5929.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg5929).isEmpty())
              break Fail28991;
            IStrategoTerm arg5930 = ((IStrategoList)arg5929).tail();
            if(arg5930.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg5930).isEmpty())
              break Fail28991;
            term = k_4226;
            if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
              break Fail28991;
            term = termFactory.annotateTerm(l_4226, checkListAnnos(termFactory, generator.constNil7));
            IStrategoList list368;
            list368 = checkListTail(k_4226);
            if(list368 == null)
              break Fail28991;
            term = termFactory.makeTuple(generator.constappl2, termFactory.makeAppl(SpoofaxGenerator._consappl_2, new IStrategoTerm[]{generator.constprod5, (IStrategoTerm)termFactory.makeListCons(d_4226, (IStrategoList)generator.constNil7)}), generator.constappl2);
            if(true)
              break Success11416;
          }
          term = term10070;
          IStrategoTerm n_4226 = null;
          IStrategoTerm p_4226 = null;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail28989;
          e_4226 = ((IStrategoList)term).head();
          IStrategoTerm arg5931 = ((IStrategoList)term).tail();
          if(arg5931.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg5931).isEmpty())
            break Fail28989;
          f_4226 = ((IStrategoList)arg5931).head();
          g_4226 = ((IStrategoList)arg5931).tail();
          p_4226 = term;
          term = (IStrategoTerm)termFactory.makeListCons(e_4226, (IStrategoList)generator.constNil7);
          term = this.invoke(context, term);
          if(term == null)
            break Fail28989;
          n_4226 = term;
          term = p_4226;
          IStrategoList list369;
          list369 = checkListTail(g_4226);
          if(list369 == null)
            break Fail28989;
          term = (IStrategoTerm)termFactory.makeListCons(f_4226, list369);
          term = this.invoke(context, term);
          if(term == null)
            break Fail28989;
          term = termFactory.makeTuple(n_4226, term);
          term = concat_modules_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28989;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}