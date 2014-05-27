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

@SuppressWarnings("all") public class explode_string_p__0_1 extends Strategy 
{ 
  public static explode_string_p__0_1 instance = new explode_string_p__0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_k_4211)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference k_4211 = new TermReference(ref_k_4211);
    context.push("explode_string_p__0_1");
    Fail21531:
    { 
      IStrategoTerm term11637 = term;
      Success11562:
      { 
        Fail21532:
        { 
          IStrategoTerm l_4211 = null;
          IStrategoTerm m_4211 = null;
          IStrategoTerm n_4211 = null;
          IStrategoTerm o_4211 = null;
          lifted6569 lifted65690 = new lifted6569();
          lifted65690.k_4211 = k_4211;
          term = split_at_1_0.instance.invoke(context, term, lifted65690);
          if(term == null)
            break Fail21532;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail21532;
          l_4211 = term.getSubterm(0);
          m_4211 = term.getSubterm(1);
          o_4211 = term;
          term = this.invoke(context, m_4211, k_4211.value);
          if(term == null)
            break Fail21532;
          n_4211 = term;
          term = o_4211;
          IStrategoList list185;
          list185 = checkListTail(n_4211);
          if(list185 == null)
            break Fail21532;
          term = (IStrategoTerm)termFactory.makeListCons(l_4211, list185);
          if(true)
            break Success11562;
        }
        term = term11637;
        term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3);
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}