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
    Fail23223:
    { 
      IStrategoTerm y_4809 = null;
      TermReference z_4809 = new TermReference();
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23223;
      y_4809 = term.getSubterm(0);
      if(z_4809.value == null)
        z_4809.value = term.getSubterm(1);
      else
        if(z_4809.value != term.getSubterm(1) && !z_4809.value.match(term.getSubterm(1)))
          break Fail23223;
      IStrategoTerm term12551 = term;
      Success12443:
      { 
        Fail23224:
        { 
          IStrategoTerm a_4810 = null;
          a_4810 = term;
          term = termFactory.makeTuple(y_4809, trans.const4597);
          term = gt_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23224;
          term = a_4810;
          { 
            IStrategoTerm h_4810 = null;
            term = inc_0_0.instance.invoke(context, y_4809);
            if(term == null)
              break Fail23223;
            term = termFactory.makeTuple(trans.const4597, term);
            term = range_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail23223;
            lifted6929 lifted69290 = new lifted6929();
            lifted69290.z_4809 = z_4809;
            term = map_1_0.instance.invoke(context, term, lifted69290);
            if(term == null)
              break Fail23223;
            h_4810 = term;
            term = separate_by_0_1.instance.invoke(context, h_4810, trans.const4614);
            if(term == null)
              break Fail23223;
            if(true)
              break Success12443;
          }
        }
        term = term12551;
        if(z_4809.value == null)
          break Fail23223;
        term = (IStrategoTerm)termFactory.makeListCons(z_4809.value, (IStrategoList)trans.constNil4);
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}