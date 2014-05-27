package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted6724 extends Strategy 
{ 
  TermReference m_4725;

  TermReference n_4725;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24216:
    { 
      IStrategoTerm term12160 = term;
      IStrategoConstructor cons612 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success12830:
      { 
        if(cons612 == Main._consRec_2)
        { 
          Fail24217:
          { 
            if(true)
              break Success12830;
          }
          term = term12160;
        }
        if(cons612 == Main._consSVar_1)
        { 
          IStrategoTerm arg8071 = term.getSubterm(0);
          if(m_4725.value == null)
            m_4725.value = arg8071;
          else
            if(m_4725.value != arg8071 && !m_4725.value.match(arg8071))
              break Fail24216;
          IStrategoList annos695 = arg8071.getAnnotations();
          if(annos695.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos695).isEmpty())
            break Fail24216;
          if(n_4725.value == null)
            n_4725.value = ((IStrategoList)annos695).head();
          else
            if(n_4725.value != ((IStrategoList)annos695).head() && !n_4725.value.match(((IStrategoList)annos695).head()))
              break Fail24216;
          IStrategoTerm arg8072 = ((IStrategoList)annos695).tail();
          if(arg8072.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8072).isEmpty())
            break Fail24216;
        }
        else
        { 
          break Fail24216;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}