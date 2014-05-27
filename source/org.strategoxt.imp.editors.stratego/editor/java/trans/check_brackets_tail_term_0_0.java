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
    Fail21281:
    { 
      IStrategoTerm n_4168 = null;
      IStrategoTerm o_4168 = null;
      IStrategoTerm p_4168 = null;
      IStrategoTerm q_4168 = null;
      IStrategoTerm r_4168 = null;
      IStrategoTerm s_4168 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21281;
      n_4168 = term.getSubterm(0);
      o_4168 = term.getSubterm(1);
      s_4168 = term;
      term = reverse_0_0.instance.invoke(context, trans.constNil3);
      if(term == null)
        break Fail21281;
      q_4168 = term;
      term = origin_non_layout_tokens_0_0.instance.invoke(context, o_4168);
      if(term == null)
        break Fail21281;
      term = reverse_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21281;
      p_4168 = term;
      term = origin_non_layout_tokens_0_0.instance.invoke(context, o_4168);
      if(term == null)
        break Fail21281;
      term = (IStrategoTerm)termFactory.makeListCons(trans.const4242, termFactory.makeListCons(term, (IStrategoList)trans.constCons1963));
      term = flatten_list_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21281;
      term = reverse_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21281;
      r_4168 = term;
      term = s_4168;
      Success11436:
      { 
        Fail21282:
        { 
          term = termFactory.makeTuple(p_4168, q_4168);
          term = common_prefix_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21282;
          term = termFactory.makeTuple(term, p_4168);
          term = equal_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21282;
          if(true)
            break Success11436;
        }
        term = termFactory.makeTuple(r_4168, q_4168);
        term = common_prefix_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail21281;
        term = termFactory.makeTuple(term, r_4168);
        term = equal_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail21281;
      }
      term = n_4168;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}