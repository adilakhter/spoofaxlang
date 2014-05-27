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

@SuppressWarnings("all") public class collect_vars_scope_0_0 extends Strategy 
{ 
  public static collect_vars_scope_0_0 instance = new collect_vars_scope_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("collect_vars_scope_0_0");
    Fail21313:
    { 
      IStrategoTerm term11455 = term;
      IStrategoConstructor cons541 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success11451:
      { 
        if(cons541 == Main._consScope_2)
        { 
          Fail21314:
          { 
            IStrategoTerm l_4173 = null;
            IStrategoTerm m_4173 = null;
            m_4173 = term.getSubterm(0);
            l_4173 = term.getSubterm(1);
            term = collect_vars_0_0.instance.invoke(context, l_4173);
            if(term == null)
              break Fail21314;
            term = termFactory.makeTuple(term, m_4173);
            term = diff_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21314;
            if(true)
              break Success11451;
          }
          term = term11455;
        }
        if(cons541 == Main._consLRule_1)
        { 
          IStrategoTerm e_4173 = null;
          IStrategoTerm f_4173 = null;
          IStrategoTerm g_4173 = null;
          IStrategoTerm arg7635 = term.getSubterm(0);
          e_4173 = arg7635;
          if(arg7635.getTermType() != IStrategoTerm.APPL || Main._consRule_3 != ((IStrategoAppl)arg7635).getConstructor())
            break Fail21313;
          f_4173 = arg7635.getSubterm(0);
          term = collect_all_1_0.instance.invoke(context, f_4173, lifted6465.instance);
          if(term == null)
            break Fail21313;
          g_4173 = term;
          term = collect_vars_0_0.instance.invoke(context, e_4173);
          if(term == null)
            break Fail21313;
          term = termFactory.makeTuple(term, g_4173);
          term = diff_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21313;
        }
        else
        { 
          break Fail21313;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}