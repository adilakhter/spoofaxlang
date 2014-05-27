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

@SuppressWarnings("all") public class numbered_arguments_0_0 extends Strategy 
{ 
  public static numbered_arguments_0_0 instance = new numbered_arguments_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("numbered_arguments_0_0");
    Fail21747:
    { 
      IStrategoTerm g_4256 = null;
      TermReference h_4256 = new TermReference();
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21747;
      g_4256 = term.getSubterm(0);
      if(h_4256.value == null)
        h_4256.value = term.getSubterm(1);
      else
        if(h_4256.value != term.getSubterm(1) && !h_4256.value.match(term.getSubterm(1)))
          break Fail21747;
      IStrategoTerm term11842 = term;
      Success11734:
      { 
        Fail21748:
        { 
          IStrategoTerm i_4256 = null;
          i_4256 = term;
          term = termFactory.makeTuple(g_4256, trans.const4387);
          term = gt_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21748;
          term = i_4256;
          { 
            IStrategoTerm p_4256 = null;
            term = inc_0_0.instance.invoke(context, g_4256);
            if(term == null)
              break Fail21747;
            term = termFactory.makeTuple(trans.const4387, term);
            term = range_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21747;
            lifted6658 lifted66580 = new lifted6658();
            lifted66580.h_4256 = h_4256;
            term = map_1_0.instance.invoke(context, term, lifted66580);
            if(term == null)
              break Fail21747;
            p_4256 = term;
            term = separate_by_0_1.instance.invoke(context, p_4256, trans.const4404);
            if(term == null)
              break Fail21747;
            if(true)
              break Success11734;
          }
        }
        term = term11842;
        if(h_4256.value == null)
          break Fail21747;
        term = (IStrategoTerm)termFactory.makeListCons(h_4256.value, (IStrategoList)trans.constNil3);
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}