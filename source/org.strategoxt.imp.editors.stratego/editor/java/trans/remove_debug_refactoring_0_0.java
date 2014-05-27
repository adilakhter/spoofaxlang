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

@SuppressWarnings("all") public class remove_debug_refactoring_0_0 extends Strategy 
{ 
  public static remove_debug_refactoring_0_0 instance = new remove_debug_refactoring_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("remove_debug_refactoring_0_0");
    Fail21241:
    { 
      IStrategoTerm e_4163 = null;
      IStrategoTerm f_4163 = null;
      IStrategoTerm g_4163 = null;
      IStrategoTerm h_4163 = null;
      IStrategoTerm i_4163 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 6)
        break Fail21241;
      e_4163 = term.getSubterm(1);
      term = bottomup_1_0.instance.invoke(context, e_4163, lifted6427.instance);
      if(term == null)
        break Fail21241;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(e_4163, term), (IStrategoList)trans.constNil3);
      f_4163 = term;
      g_4163 = trans.constNil3;
      h_4163 = trans.constNil3;
      i_4163 = trans.constNil3;
      term = termFactory.makeTuple(g_4163, h_4163);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21241;
      term = termFactory.makeTuple(f_4163, trans.constNil3, term, i_4163);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}