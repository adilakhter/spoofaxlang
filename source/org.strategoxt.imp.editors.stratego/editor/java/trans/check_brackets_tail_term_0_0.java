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

@SuppressWarnings("all") public class check_brackets_tail_term_0_0 extends Strategy 
{ 
  public static check_brackets_tail_term_0_0 instance = new check_brackets_tail_term_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("check_brackets_tail_term_0_0");
    Fail22757:
    { 
      IStrategoTerm f_4722 = null;
      IStrategoTerm g_4722 = null;
      IStrategoTerm h_4722 = null;
      IStrategoTerm i_4722 = null;
      IStrategoTerm j_4722 = null;
      IStrategoTerm k_4722 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22757;
      f_4722 = term.getSubterm(0);
      g_4722 = term.getSubterm(1);
      k_4722 = term;
      term = reverse_0_0.instance.invoke(context, trans.constNil4);
      if(term == null)
        break Fail22757;
      i_4722 = term;
      term = origin_non_layout_tokens_0_0.instance.invoke(context, g_4722);
      if(term == null)
        break Fail22757;
      term = reverse_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22757;
      h_4722 = term;
      term = origin_non_layout_tokens_0_0.instance.invoke(context, g_4722);
      if(term == null)
        break Fail22757;
      term = (IStrategoTerm)termFactory.makeListCons(trans.const4452, termFactory.makeListCons(term, (IStrategoList)trans.constCons2044));
      term = flatten_list_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22757;
      term = reverse_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22757;
      j_4722 = term;
      term = k_4722;
      Success12145:
      { 
        Fail22758:
        { 
          term = termFactory.makeTuple(h_4722, i_4722);
          term = common_prefix_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22758;
          term = termFactory.makeTuple(term, h_4722);
          term = equal_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22758;
          if(true)
            break Success12145;
        }
        term = termFactory.makeTuple(j_4722, i_4722);
        term = common_prefix_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail22757;
        term = termFactory.makeTuple(term, j_4722);
        term = equal_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail22757;
      }
      term = f_4722;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}